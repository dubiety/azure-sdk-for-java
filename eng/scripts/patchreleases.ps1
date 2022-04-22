# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

param(
    [string]$GroupId = "com.azure"
)

Write-Information "PS Script Root is: $PSScriptRoot"
$RepoRoot = Resolve-Path "${PSScriptRoot}../../.."
$CommonScriptFilePath = Join-Path $RepoRoot "eng" "common" "scripts" "common.ps1"
$BomHelpersFilePath = Join-Path $PSScriptRoot "bomhelpers.ps1"
$PatchReportFile = Join-Path $PSScriptRoot "patchreport.html"
$BomFilePath = Join-Path $RepoRoot "sdk" "boms" "azure-sdk-bom" "pom.xml"
$BomChangeLogPath = Join-Path $RepoRoot "sdk" "boms" "azure-sdk-bom" "changelog.md"
$NewBomFilePath = Join-Path $PSScriptRoot "bom.xml"
$NewBomFileReport = Join-Path $PSScriptRoot "bompom.html" 
. $CommonScriptFilePath
. $BomHelpersFilePath

class ArtifactInfo {
    [string]$GroupId = "com.azure"
    [string]$ArtifactId
    [string]$ServiceDirectoryName
    [string]$ArtifactDirPath
    [string]$LatestGAOrPatchVersion
    [string]$FutureReleasePatchVersion
    [string]$CurrentPomFileVersion
    [string]$ChangeLogPath
    [string]$ReadMePath
    [string]$PipelineName
    [hashtable]$Dependencies

    ArtifactInfo([string]$ArtifactId, [string]$LatestGAOrPatchVersion) {
        $this.ArtifactId = $ArtifactId
        $this.LatestGAOrPatchVersion = $LatestGAOrPatchVersion
    }
}

function ConvertToPatchInfo([ArtifactInfo]$ArInfo) {
    $patchInfo = [ArtifactPatchInfo]::new()
    $patchInfo.ArtifactId = $ArInfo.ArtifactId
    $patchInfo.ServiceDirectoryName = $ArInfo.ServiceDirectoryName
    $patchInfo.ArtifactDirPath = $ArInfo.ArtifactDirPath
    $patchInfo.LatestGAOrPatchVersion = $ArInfo.LatestGAOrPatchVersion
    $patchInfo.CurrentPomFileVersion = $ArInfo.CurrentPomFileVersion
    $patchInfo.ChangeLogPath = $ArInfo.ChangeLogPath
    $patchInfo.ReadMePath = $ArInfo.ReadMePath
    $patchInfo.PipelineName = $ArInfo.PipelineName
    $patchInfo.FutureReleasePatchVersion = $arInfo.FutureReleasePatchVersion

    return $patchInfo    
}

function GetVersionInfoForAllMavenArtifacts([string]$GroupId = "com.azure") {
    $artifactInfos = @{}
    $azComArtifactIds = GetAllAzComClientArtifactsFromMaven -GroupId $GroupId

    foreach ($artifactId in $azComArtifactIds) {
        $info = GetVersionInfoForAnArtifactId -ArtifactId $artifactId

        $artifactId = $info.ArtifactId
        $latestGAOrPatchVersion = $info.LatestGAOrPatchVersion
        $artifactInfos[$artifactId] = [ArtifactInfo]::new($artifactId, $latestGAOrPatchVersion)
    }

    return $artifactInfos
}

function UpdateDependencies($ArtifactInfos) {
    foreach ($artifactId in $ArtifactInfos.Keys) {
        $deps = @{}
        $sdkVersion = $ArtifactInfos[$artifactId].LatestGAOrPatchVersion
        $pomFileUri = "https://repo1.maven.org/maven2/com/azure/$artifactId/$sdkVersion/$artifactId-$sdkVersion.pom"
        $webResponseObj = Invoke-WebRequest -Uri $pomFileUri
        $dependencies = ([xml]$webResponseObj.Content).project.dependencies.dependency | Where-Object { (([String]::IsNullOrWhiteSpace($_.scope)) -or ($_.scope -eq 'compile')) }
        $dependencies | Where-Object { $_.groupId -eq $GroupId } | ForEach-Object { $deps[$_.artifactId] = $_.version }
        $ArtifactInfos[$artifactId].Dependencies = $deps
    }

    return
}

function UpdateCIInformation($ArtifactInfos) {
    foreach ($artifactId in $ArtifactInfos.Keys) {
        $arInfo = [ArtifactInfo]$ArtifactInfos[$artifactId]
        $serviceDirectory = $arInfo.ServiceDirectoryName

        if (!$serviceDirectory) {
            $pkgProperties = [PackageProps](Get-PkgProperties -PackageName $artifactId -ServiceDirectory $serviceDirectory)
            $arInfo.ServiceDirectoryName = $pkgProperties.ServiceDirectory
            $arInfo.ArtifactDirPath = $pkgProperties.DirectoryPath
            $arInfo.CurrentPomFileVersion = $pkgProperties.Version
            $arInfo.ChangeLogPath = $pkgProperties.ChangeLogPath
            $arInfo.ReadMePath = $pkgProperties.ReadMePath
        }

        $arInfo.PipelineName = GetPipelineName -ArtifactId $arInfo.ArtifactId -ArtifactDirPath $arInfo.ArtifactDirPath
    }
}

function FindAllArtifactsToBePatched([String]$DependencyId, [String]$PatchVersion, [hashtable]$ArtifactInfos) {
    $artifactsToPatch = @{}

    foreach ($id in $ArtifactInfos.Keys) {
        $arInfo = $ArtifactInfos[$id]
        $futureReleasePatchVersion = $arInfo.FutureReleasePatchVersion

        if ($futureReleasePatchVersion) {
            # This library is already being patched and hence analyzed so we don't need to analyze it again.
            if ($id -ne 'azure-core' -or $id -ne 'azure-core-http-netty') {
                continue;
            }
        }

        $depVersion = $arInfo.Dependencies[$DependencyId]
        if ($depVersion -and $depVersion -ne $PatchVersion) {
            $currentGAOrPatchVersion = $arInfo.LatestGAOrPatchVersion
            $newPatchVersion = GetPatchVersion -ReleaseVersion $currentGAOrPatchVersion
            $arInfo.FutureReleasePatchVersion = $newPatchVersion
            $artifactsToPatch[$id] = $id
            $depArtifactsToPatch = FindAllArtifactsToBePatched -DependencyId $id -PatchVersion $newPatchVersion -ArtifactInfos $ArtifactInfos
            foreach ($recArtifacts in $depArtifactsToPatch.Keys) {
                $artifactsToPatch[$recArtifacts] = $recArtifacts
            }
        }
    }

    return $artifactsToPatch
}

function UpdateDependenciesInVersionClient([hashtable]$ArtifactInfos, [string]$GroupId = "com.azure") {
    ## We need to update the version_client.txt to have the correct versions in place.
    foreach ($artifactId in $ArtifactInfos.Keys) {
        $newDependencyVersion = $ArtifactInfos[$artifactId].FutureReleasePatchVersion

        if (!$newDependencyVersion) {
            $newDependencyVersion = $ArtifactInfos[$artifactId].LatestGAOrPatchVersion
        }

        $currentFileVersion = $ArtifactInfos[$artifactId].CurrentPomFileVersion

        if ($newDependencyVersion) {
            $cmdOutput = SetDependencyVersion -GroupId $GroupId -ArtifactId $artifactId -Version $newDependencyVersion
            $cmdOutput = SetCurrentVersion -GroupId $GroupId -ArtifactId $artifactId -Version $currentFileVersion
        }
    }
}

function GetNextBomVersion() {
    $pkgProperties = [PackageProps](Get-PkgProperties -PackageName "azure-sdk-bom")
    $currentVersion = $pkgProperties.Version

    $patchVersion = GetPatchVersion -ReleaseVersion $currentVersion
    return $patchVersion
}

function TopologicalSortUtil($ArtifactId, $ArtifactInfos, $ArtifactIds, $Visited, $Order) {
    $Visited[$ArtifactId] = $true

    # Find all dependencies that are also getting patched.
    $adjDependencies = $ArtifactInfos[$ArtifactId].Dependencies.Keys | Where-Object { $ArtifactIds -Contains $_ }

    foreach ($arId in $adjDependencies) {
        if (!$Visited.ContainsKey($arId)) {
            TopologicalSortUtil -ArtifactId $arId -ArtifactInfos $ArtifactInfos -ArtifactIds $ArtifactIds -Visited $Visited -Order $Order
        }
    }

    $cmdOutput = $Order.Add($ArtifactId)
}

function GetTopologicalSort($ArtifactIds, $ArtifactInfos) {
    $order = [System.Collections.ArrayList]::new()
    # $reverseOrder = @()
    $visited = [System.Collections.Hashtable]::new()
    foreach ($artifactId in $ArtifactIds) {
        if (!$visited.ContainsKey($artifactId)) {
            TopologicalSortUtil -ArtifactId $artifactId -ArtifactInfos $ArtifactInfos -ArtifactIds $ArtifactIds -Visited $visited -Order $order
        }
    }

    $pipelineOrdered = @()
    $visited = @{}

    for($i=0; $i -lt $order.Count; $i++) {
        $arId = $order[$i]
        if($null -ne $visited[$arId]) {
            continue;
        }
        
        $visited[$arId] = $true
        $pipelineName = $ArtifactInfos[$arId].PipelineName
        $pipelineOrdered += @{
            ArtifactId = $arId
            PipelineName = $pipelineName
        }

        for($j=$i; $j -lt $order.Count; $j++) {
            $curArId = $order[$j]
            if($null -eq $visited[$curArId] -and $pipelineName -eq $ArtifactInfos[$curArId].PipelineName) {
                $pipelineOrdered += @{
                    ArtifactId = $curArId
                    PipelineName = $pipelineName
                }
                $visited[$curArId] = $true
            }
        }
    }

    return $pipelineOrdered
}

function CreateDependencyXmlElement($Artifact, [xml]$Doc) {
    $xmlns = $Doc.Project.xmlns
    $xsi = $Doc.Project.xsi

    $dependency = $Doc.CreateElement("dependency", $xmlns);
    $groupId = $Doc.CreateElement("groupId", $xmlns);
    $groupId.InnerText = $Artifact.GroupId
    $cmdOutput = $dependency.AppendChild($groupId);
    $artifactId = $Doc.CreateElement("artifactId", $xmlns);
    $artifactId.InnerText = $Artifact.ArtifactId
    $cmdOutput = $dependency.AppendChild($artifactId);
    $version = $Doc.CreateElement("version", $xmlns);
    $version.InnerText = $Artifact.Version
    $cmdOutput = $dependency.AppendChild($version);

    $dependencies = $bomFileContent.GetElementsByTagName("dependencies")[0]
    $cmdOutput = $dependencies.AppendChild($dependency)
}

function GenerateBOMFile($ArtifactInfos, $BomFileBranchName) {
    $gaArtifacts = @()

    foreach ($artifact in $ArtifactInfos.Values) {
        $version = $artifact.LatestGAOrPatchVersion

        if ($null -eq $version) {
            $version = $artifact.FutureReleasePatchVersion
        }

        $gaArtifacts += @{
            GroupId    = $artifact.GroupId
            ArtifactId = $artifact.ArtifactId
            Version    = $version
        }
    }

    $gaArtifacts = $gaArtifacts | Sort-Object -Property ArtifactId

    #Now we need to create the BOM file.
    $bomFileContent = [xml](Get-Content -Path $BomFilePath)
    $dependencyManagement = $bomFileContent.project.dependencyManagement
    $dependencies = $dependencyManagement.dependencies
    $cmdOutput = $dependencyManagement.RemoveChild($dependencies)
    $dependencies = $bomFileContent.CreateElement("dependencies", $bomFileContent.Project.xmlns);
    $cmdOutput = $dependencyManagement.AppendChild($dependencies);

    foreach ($dependency in $gaArtifacts) {
        CreateDependencyXmlElement -Artifact $dependency -Doc $bomFileContent
    }

    $currentBranchName = GetCurrentBranchName
    try {
        UpdateDependenciesInVersionClient -ArtifactInfos $ArtifactInfos
        $releaseVersion = $bomFileContent.project.version
        $patchVersion = GetPatchVersion -ReleaseVersion $releaseVersion
        $remoteName = GetRemoteName
        $cmdOutput = git checkout -b $BomFileBranchName #$remoteName/main 
        $bomFileContent.Save($BomFilePath)
        git add $BomFilePath
        $content = GetChangeLogContentFromMessage -ContentMessage '- Updated Azure SDK dependency versions to the latest releases.'
        UpdateChangeLogEntry -ChangeLogPath $BomChangeLogPath -PatchVersion $patchVersion -ArtifactId "azure-sdk-bom" -Content $content    
        git add *
        git add $BomChangeLogPath
        git commit -m "Prepare BOM for release version $releaseVersion"
        git push -f $remoteName $BomFileBranchName
    }
    finally {
        git checkout $currentBranchName
    }
}

function GenerateHtmlReport($Artifacts, $PatchBranchName, $BomFileBranchName) {
    $count = $ArtifactsToPatch.Count
    $index = 0
    $html = @()
    $html += "<head><title>Patch Report</title></head><body><table border='1'><tr><th>Artifact</th><th>PipelineName</th><th>Release Branch</th><tr>"
    $pipelineCountIndex = 0
    foreach ($artifact in $Artifacts) {
        $artifactId = $artifact.ArtifactId
        $pipelineName = $artifact.PipelineName
        $arWithSamePipeline = $Artifacts | Where-Object { $_.PipelineName -eq $pipelineName } | Select-Object -Property 'ArtifactId'
        $pipelineNameCount = $arWithSamePipeline.Count

        $html += "<tr>"
        $html += "<td>$artifactId</td>"
        if($pipelineCountIndex++ -eq 0) {
          $html += "<td rowspan='$pipelineNameCount'>$pipelineName</td>"
        }
        if ($index++ -eq 0) {
            $html += "<td  rowspan='$count'>$PatchBranchName</td>"
        }
        $html += "</tr>"

        if($pipelineCountIndex -eq $pipelineNameCount) {
            $pipelineCountIndex = 0
        }
    }
    
    $html += "<tr><td>azure-sdk-bom</td><td>java-boms</td><td>$BomFileBranchName</td></tr>"
    $html += "</table>"
    $currentDate = Get-Date -Format "dddd MM/dd/yyyy HH:mm K"

    $html += "<p>Report generated on $currentDate </p>"
    $html | Out-File -FilePath $PatchReportFile -Force
}

$ArtifactInfos = GetVersionInfoForAllMavenArtifacts -GroupId $GroupId
$IgnoreList = @(
    'azure-client-sdk-parent',
    'azure-core-management',
    'azure-core-parent',
    'azure-core-test',
    'azure-sdk-all',
    'azure-sdk-bom',
    'azure-sdk-parent',
    'azure-sdk-template',
    'azure-sdk-template-bom',
    'azure-data-sdk-parent',
    'azure-spring-data-cosmos',
    'azure-cosmos-cassandra-driver-3',
    'azure-cosmos-cassandra-driver-4',
    'azure-cosmos-cassandra-driver-3-extensions',
    'azure-cosmos-cassandra-driver-4-extensions',
    'azure-cosmos-cassandra-spring-data-extensions'
)

$inEligibleKeys = $ArtifactInfos.Keys | Where-Object { !$ArtifactInfos[$_].LatestGAOrPatchVersion -or $IgnoreList -contains $_ }
$inEligibleKeys | ForEach-Object { $ArtifactInfos.Remove($_) }

UpdateDependencies -ArtifactInfos $ArtifactInfos
$AzCoreArtifactId = "azure-core"
$AzCoreVersion = $ArtifactInfos[$AzCoreArtifactId].LatestGAOrPatchVersion

# For testing only.
$AzCoreVersion = "1.28.0"
$ArtifactInfos[$AzCoreArtifactId].FutureReleasePatchVersion = $AzCoreVersion
$AzCoreNettyArtifactId = "azure-core-http-netty"
$ArtifactInfos[$AzCoreNettyArtifactId].Dependencies[$AzCoreArtifactId] = $AzCoreVersion

$ArtifactsToPatch = FindAllArtifactsToBePatched -DependencyId $AzCoreArtifactId -PatchVersion $AzCoreVersion -ArtifactInfos $ArtifactInfos
$RemoteName = GetRemoteName
$CurrentBranchName = GetCurrentBranchName
if ($LASTEXITCODE -ne 0) {
    LogError "Could not correctly get the current branch name."
    exit 1
}
UpdateCIInformation -ArtifactsToPatch $ArtifactsToPatch.Keys -ArtifactInfos $ArtifactInfos

$bomPatchVersion = GetNextBomVersion
$bomBranchName = "bom1_$bomPatchVersion"
Write-Output "Preparing patch releases for BOM updates."
# try {
#     $patchBranchName = "PatchSet1_$bomPatchVersion_1"
#     git checkout -b $patchBranchName #$RemoteName/main
#     UpdateDependenciesInVersionClient -ArtifactInfos $ArtifactInfos

#     foreach ($artifactId in $ArtifactsToPatch.Keys) {
#         $arInfo = $ArtifactInfos[$artifactId]
#         $patchInfo = [ArtifactPatchInfo]::new()
#         $patchInfo = ConvertToPatchInfo -ArInfo $arInfo
#         GeneratePatches -ArtifactPatchInfos $patchInfo -BranchName $patchBranchName -RemoteName $RemoteName -GroupId $GroupId
#     }
# }
# finally {
#     $cmdOutput = git checkout $CurrentBranchName
# }

# GenerateBOMFile -ArtifactInfos $ArtifactInfos -BomFileBranchName $bomBranchName

$orderedArtifacts = GetTopologicalSort -ArtifactIds $ArtifactsToPatch.Keys -ArtifactInfos $ArtifactInfos
GenerateHtmlReport -Artifacts $orderedArtifacts -PatchBranchName $patchBranchName -BomFileBranchName $bomBranchName