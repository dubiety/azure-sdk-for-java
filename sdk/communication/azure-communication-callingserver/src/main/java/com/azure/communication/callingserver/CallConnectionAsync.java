// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.azure.communication.callingserver.implementation.CallConnectionsImpl;
import com.azure.communication.callingserver.implementation.converters.CallConnectionPropertiesConverter;
import com.azure.communication.callingserver.implementation.converters.CallParticipantConverter;
import com.azure.communication.callingserver.implementation.converters.CallingServerErrorConverter;
import com.azure.communication.callingserver.implementation.converters.CancelAllMediaOperationsResultConverter;
import com.azure.communication.callingserver.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.callingserver.implementation.converters.PhoneNumberIdentifierConverter;
import com.azure.communication.callingserver.implementation.converters.PlayAudioResultConverter;
import com.azure.communication.callingserver.implementation.converters.TransferCallRequestConverter;
import com.azure.communication.callingserver.implementation.models.AddParticipantRequest;
import com.azure.communication.callingserver.implementation.models.CancelAllMediaOperationsRequest;
import com.azure.communication.callingserver.implementation.models.CancelParticipantMediaOperationRequest;
import com.azure.communication.callingserver.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.callingserver.implementation.models.GetParticipantRequest;
import com.azure.communication.callingserver.implementation.models.PlayAudioRequest;
import com.azure.communication.callingserver.implementation.models.PlayAudioToParticipantRequest;
import com.azure.communication.callingserver.implementation.models.RemoveParticipantRequest;
import com.azure.communication.callingserver.implementation.models.TransferCallRequest;
import com.azure.communication.callingserver.models.AddParticipantResult;
import com.azure.communication.callingserver.models.CallConnectionProperties;
import com.azure.communication.callingserver.models.CallParticipant;
import com.azure.communication.callingserver.models.CallingServerErrorException;
import com.azure.communication.callingserver.models.CancelAllMediaOperationsResult;
import com.azure.communication.callingserver.models.PlayAudioOptions;
import com.azure.communication.callingserver.models.PlayAudioResult;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;

import reactor.core.publisher.Mono;

/**
 * Asynchronous client that supports call connection operations.
 */
public final class CallConnectionAsync {

    private final String callConnectionId;
    private final CallConnectionsImpl callConnectionInternal;
    private final ClientLogger logger = new ClientLogger(CallConnectionAsync.class);

    CallConnectionAsync(String callConnectionId, CallConnectionsImpl callConnectionInternal) {
        this.callConnectionId = callConnectionId;
        this.callConnectionInternal = callConnectionInternal;
    }

    /**
     * Get the call connection id property.
     *
     * @return Call connection id value.
     */
    public String getCallConnectionId() {
        return callConnectionId;
    }

    /**
     * Play audio in a call.
     *
     * @param audioFileUri The media resource uri of the play audio request. Currently only Wave file (.wav) format
     *                     audio prompts are supported. More specifically, the audio content in the wave file must
     *                     be mono (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     * @param playAudioOptions Options for play audio.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PlayAudioResult> playAudio(URI audioFileUri, PlayAudioOptions playAudioOptions) {
        return playAudioInternal(audioFileUri, playAudioOptions);

    }

    Mono<PlayAudioResult> playAudioInternal(URI audioFileUri, PlayAudioOptions playAudioOptions) {
        try {
            Objects.requireNonNull(audioFileUri, "'audioFileUri' cannot be null.");
            PlayAudioRequest request = new PlayAudioRequest().setAudioFileUri(audioFileUri.toString());
            if (playAudioOptions != null) {
                request
                    .setLoop(playAudioOptions.isLoop())
                    .setOperationContext(playAudioOptions.getOperationContext())
                    .setAudioFileId(playAudioOptions.getAudioFileId())
                    .setCallbackUri(playAudioOptions.getCallbackUri().toString());
            }
            return playAudioInternal(request);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<PlayAudioResult> playAudioInternal(PlayAudioRequest playAudioRequest) {
        try {
            return callConnectionInternal.playAudioAsync(callConnectionId, playAudioRequest)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(PlayAudioResultConverter.convert(result)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Play audio in a call.
     *
     * @param audioFileUri The media resource uri of the play audio request. Currently only Wave file (.wav) format
     *                     audio prompts are supported. More specifically, the audio content in the wave file must
     *                     be mono (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     * @param playAudioOptions Options for play audio.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PlayAudioResult>> playAudioWithResponse(
        URI audioFileUri,
        PlayAudioOptions playAudioOptions) {
        return playAudioWithResponseInternal(audioFileUri, playAudioOptions, Context.NONE);
    }

    Mono<Response<PlayAudioResult>> playAudioWithResponseInternal(
        URI audioFileUri,
        PlayAudioOptions playAudioOptions,
        Context context) {
        try {
            Objects.requireNonNull(audioFileUri, "'audioFileUri' cannot be null.");
            PlayAudioRequest request = new PlayAudioRequest().setAudioFileUri(audioFileUri.toString());
            if (playAudioOptions != null) {
                request
                    .setLoop(playAudioOptions.isLoop())
                    .setOperationContext(playAudioOptions.getOperationContext())
                    .setAudioFileId(playAudioOptions.getAudioFileId())
                    .setCallbackUri(playAudioOptions.getCallbackUri().toString());
            }
            return playAudioWithResponseInternal(request, context);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<PlayAudioResult>> playAudioWithResponseInternal(
        PlayAudioRequest playAudioRequest,
        Context context) {
        try {
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal
                    .playAudioWithResponseAsync(callConnectionId, playAudioRequest, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response, PlayAudioResultConverter.convert(response.getValue())));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Hangup a call.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful hangup request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> hangup() {
        try {
            return callConnectionInternal.hangupCallAsync(callConnectionId)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.empty());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Hangup a call.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful hangup request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> hangupWithResponse() {
        return hangupWithResponse(Context.NONE);
    }

    Mono<Response<Void>> hangupWithResponse(Context context) {
        try {
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.hangupCallWithResponseAsync(callConnectionId, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Cancel all media operations in the call.
     *
     * @param operationContext The value to identify context of the operation. This is used to co-relate other
     *                         communications related to this operation
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload of the cancel all media operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CancelAllMediaOperationsResult> cancelAllMediaOperations(String operationContext) {
        try {
            CancelAllMediaOperationsRequest request = new CancelAllMediaOperationsRequest();
            request.setOperationContext(operationContext);
            return callConnectionInternal.cancelAllMediaOperationsAsync(callConnectionId, request)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(CancelAllMediaOperationsResultConverter.convert(result)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Cancel all media operations in the call.
     *
     * @param operationContext The value to identify context of the operation. This is used to co-relate other
     *                         communications related to this operation
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload of the cancel all media operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CancelAllMediaOperationsResult>> cancelAllMediaOperationsWithResponse(String operationContext) {
        return cancelAllMediaOperationsWithResponse(operationContext, Context.NONE);
    }

    Mono<Response<CancelAllMediaOperationsResult>> cancelAllMediaOperationsWithResponse(
        String operationContext,
        Context context) {
        try {
            CancelAllMediaOperationsRequest request = new CancelAllMediaOperationsRequest();
            request.setOperationContext(operationContext);
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal
                    .cancelAllMediaOperationsWithResponseAsync(callConnectionId, request, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response, CancelAllMediaOperationsResultConverter.convert(response.getValue())));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Add a participant to the call.
     *
     * @param participant The identifier of the participant.
     * @param alternateCallerId The phone number to use when adding a phone number participant.
     * @param operationContext The value to identify context of the operation. This is used to co-relate other
     *                         communications related to this operation
     * @param callBackUri callBackUri to get notifications.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful add participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AddParticipantResult> addParticipant(
        CommunicationIdentifier participant,
        String alternateCallerId,
        String operationContext,
        URI callbackUri) {
        try {
            Objects.requireNonNull(participant, "'participant' cannot be null.");
            AddParticipantRequest request = getAddParticipantRequest(participant,
                alternateCallerId,
                operationContext,
                callbackUri);
            return callConnectionInternal.addParticipantAsync(callConnectionId, request)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(new AddParticipantResult(result.getParticipantId())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    private AddParticipantRequest getAddParticipantRequest(CommunicationIdentifier participant,
            String alternateCallerId, String operationContext, URI callbackUri) {

            AddParticipantRequest request = new AddParticipantRequest()
            .setParticipant(CommunicationIdentifierConverter.convert(participant))
            .setAlternateCallerId(PhoneNumberIdentifierConverter.convert(alternateCallerId))
            .setOperationContext(operationContext)
            .setCallbackUri(callbackUri.toString());

            return request;
    }

    /**
     * Add a participant to the call.
     *
     * @param participant The identifier of the participant.
     * @param alternateCallerId The phone number to use when adding a phone number participant.
     * @param operationContext The value to identify context of the operation. This is used to co-relate other
     *                         communications related to this operation
     * @param callBackUri callBackUri to get notifications.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful add participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AddParticipantResult>> addParticipantWithResponse(
        CommunicationIdentifier participant,
        String alternateCallerId,
        String operationContext,
        URI callbackUri) {
        return addParticipantWithResponse(participant, alternateCallerId, operationContext, callbackUri, Context.NONE);
    }

    Mono<Response<AddParticipantResult>> addParticipantWithResponse(
        CommunicationIdentifier participant,
        String alternateCallerId,
        String operationContext,
        URI callbackUri,
        Context context) {
        try {
            Objects.requireNonNull(participant, "'participant' cannot be null.");
            AddParticipantRequest request = getAddParticipantRequest(participant,
                alternateCallerId,
                operationContext,
                callbackUri);
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal
                    .addParticipantWithResponseAsync(callConnectionId, request, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response, new AddParticipantResult(response.getValue().getParticipantId())));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Remove a participant from the call.
     *
     * @param participant The identifier of the participant.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful remove participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> removeParticipant(CommunicationIdentifier participant) {
        try {
            RemoveParticipantRequest request = new RemoveParticipantRequest().setIdentifier(CommunicationIdentifierConverter.convert(participant));
            return callConnectionInternal.removeParticipantAsync(callConnectionId, request)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.empty());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Remove a participant from the call.
     *
     * @param participant The identifier of the participant.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful remove participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeParticipantWithResponse(CommunicationIdentifier participant) {
        return removeParticipantWithResponse(participant, Context.NONE);
    }

    Mono<Response<Void>> removeParticipantWithResponse(CommunicationIdentifier participant, Context context) {
        try {
            RemoveParticipantRequest request = new RemoveParticipantRequest().setIdentifier(CommunicationIdentifierConverter.convert(participant));

            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal
                    .removeParticipantWithResponseAsync(callConnectionId, request, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Transfer the call.
     *
     * @param targetParticipant The identifier of the participant.
     * @param targetCallConnectionId The target call connection id to transfer to.
     * @param userToUserInformation The user to user information.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful transfer to participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> transferCall(CommunicationIdentifier targetParticipant, String targetCallConnectionId, String userToUserInformation) {
        try {
            TransferCallRequest request = TransferCallRequestConverter.convert(targetParticipant, targetCallConnectionId, userToUserInformation);
            return callConnectionInternal.transferAsync(callConnectionId, request)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.empty());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Transfer the call to a participant.
     *
     * @param targetParticipant The identifier of the participant.
     * @param targetCallConnectionId The target call connection id to transfer to.
     * @param userToUserInformation The user to user information.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful transfer to participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> transferToParticipantWithResponse(CommunicationIdentifier participant, String targetCallConnectionId, String userToUserInformation) {
        return transferCallWithResponse(participant, userToUserInformation, targetCallConnectionId, Context.NONE);
    }

    Mono<Response<Void>> transferCallWithResponse(CommunicationIdentifier targetParticipant, String targetCallConnectionId, String userToUserInformation, Context context) {
        try {
            TransferCallRequest request = TransferCallRequestConverter.convert(targetParticipant, targetCallConnectionId, userToUserInformation);
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal
                    .transferWithResponseAsync(callConnectionId, request, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get call connection properties.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionProperties> get() {
        try {

            return callConnectionInternal.getCallAsync(callConnectionId)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(CallConnectionPropertiesConverter.convert(result)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get call connection properties.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionProperties>> getWithResponse() {
        return getWithResponse(Context.NONE);
    }

    Mono<Response<CallConnectionProperties>> getWithResponse(Context context) {
        try {
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.getCallWithResponseAsync(callConnectionId, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response, CallConnectionPropertiesConverter.convert(response.getValue())));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get participants of the call.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get participants request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<List<CallParticipant>> getParticipants() {
        try {
            return callConnectionInternal.getParticipantsAsync(callConnectionId)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(
                    result.stream().map(CallParticipantConverter::convert).collect(Collectors.toList())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get participants of the call.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get participants request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<Response<List<CallParticipant>>> getParticipantsWithResponse() {
        return getParticipantsWithResponse(Context.NONE);
    }

    Mono<Response<List<CallParticipant>>> getParticipantsWithResponse(Context context) {
        try {
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.getParticipantsWithResponseAsync(callConnectionId, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response,
                            response.getValue()
                            .stream()
                            .map(CallParticipantConverter::convert)
                            .collect(Collectors.toList()
                        )
                    )
                );
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get participant from the call using identifier.
     *
     * @param participant The identifier of the participant.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get participant request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<List<CallParticipant>> getParticipant(CommunicationIdentifier participant) {
        try {
            GetParticipantRequest request = new GetParticipantRequest().setIdentifier(CommunicationIdentifierConverter.convert(participant));
            return callConnectionInternal.getParticipantAsync(callConnectionId, request)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(
                    result.stream().map(CallParticipantConverter::convert).collect(Collectors.toList())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get participant from the call using identifier.
     *
     * @param participant The identifier of the participant.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful get participant request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<Response<List<CallParticipant>>> getParticipantWithResponse(CommunicationIdentifier participant) {
        return getParticipantWithResponse(participant, Context.NONE);
    }

    Mono<Response<List<CallParticipant>>> getParticipantWithResponse(CommunicationIdentifier participant, Context context) {
        try {
            GetParticipantRequest request = new GetParticipantRequest().setIdentifier(CommunicationIdentifierConverter.convert(participant));
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.getParticipantWithResponseAsync(callConnectionId, request, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                        new SimpleResponse<>(response,
                            response.getValue()
                            .stream()
                            .map(CallParticipantConverter::convert)
                            .collect(Collectors.toList()
                        )
                    )
                );
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Keep call connection alive.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful keep alive request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> keepAlive() {
        try {
            return callConnectionInternal.keepAliveAsync(callConnectionId)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.empty());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Keep call connection alive.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful keep alive request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> keepAliveWithResponse() {
        return keepAliveWithResponse(null);
    }

    Mono<Response<Void>> keepAliveWithResponse(Context context) {
        try {
            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.keepAliveWithResponseAsync(callConnectionId, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Play audio to a participant.
     *
     * @param participant The identifier of the participant.
     * @param audioFileUri The media resource uri of the play audio request. Currently only Wave file (.wav) format
     *                     audio prompts are supported. More specifically, the audio content in the wave file must
     *                     be mono (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     * @param playAudioOptions Options for play audio.
     * @param context A {@link Context} representing the request context.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PlayAudioResult> PlayAudioToParticipant(
        CommunicationIdentifier participant,
        URI audioFileUri,
        PlayAudioOptions playAudioOptions) {
        return PlayAudioToParticipantInternal(participant, audioFileUri, playAudioOptions, Context.NONE);
    }

    Mono<PlayAudioResult> PlayAudioToParticipantInternal(CommunicationIdentifier participant, URI audioFileUri,
            PlayAudioOptions playAudioOptions, Context context) {
        try {
            Objects.requireNonNull(participant, "'participant' cannot be null.");
            Objects.requireNonNull(audioFileUri, "'audioFileUri' cannot be null.");

            PlayAudioToParticipantRequest playAudioToParticipantRequest = new PlayAudioToParticipantRequest()
                .setAudioFileUri(audioFileUri.toString())
                .setIdentifier(CommunicationIdentifierConverter.convert(participant));
            if (playAudioOptions != null) {
                playAudioToParticipantRequest
                    .setLoop(playAudioOptions.isLoop())
                    .setOperationContext(playAudioOptions.getOperationContext())
                    .setAudioFileId(playAudioOptions.getAudioFileId())
                    .setCallbackUri(playAudioOptions.getCallbackUri().toString());
            }

            return callConnectionInternal.participantPlayAudioAsync(callConnectionId, playAudioToParticipantRequest, context)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(PlayAudioResultConverter.convert(result)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Play audio to a participant.
     *
     * @param participant The identifier of the participant.
     * @param audioFileUri The media resource uri of the play audio request. Currently only Wave file (.wav) format
     *                     audio prompts are supported. More specifically, the audio content in the wave file must
     *                     be mono (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     * @param playAudioOptions Options for play audio.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PlayAudioResult>> PlayAudioToParticipantWithResponse(
        CommunicationIdentifier participant,
        URI audioFileUri,
        PlayAudioOptions playAudioOptions) {
        return PlayAudioToParticipantWithResponseInternal(participant, audioFileUri, playAudioOptions, Context.NONE);
    }

    Mono<Response<PlayAudioResult>> PlayAudioToParticipantWithResponseInternal(CommunicationIdentifier participant, URI audioFileUri,
            PlayAudioOptions playAudioOptions, Context context) {
        try {
            Objects.requireNonNull(participant, "'participant' cannot be null.");
            Objects.requireNonNull(audioFileUri, "'audioFileUri' cannot be null.");

            PlayAudioToParticipantRequest playAudioToParticipantRequest = new PlayAudioToParticipantRequest()
                .setAudioFileUri(audioFileUri.toString())
                .setIdentifier(CommunicationIdentifierConverter.convert(participant));
            if (playAudioOptions != null) {
                playAudioToParticipantRequest
                    .setLoop(playAudioOptions.isLoop())
                    .setOperationContext(playAudioOptions.getOperationContext())
                    .setAudioFileId(playAudioOptions.getAudioFileId())
                    .setCallbackUri(playAudioOptions.getCallbackUri().toString());
            }

            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.participantPlayAudioWithResponseAsync(callConnectionId, playAudioToParticipantRequest, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                    .map(response ->
                    new SimpleResponse<>(response, PlayAudioResultConverter.convert(response.getValue())));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Cancel Participant Media Operation.
     *
     * @param participant The identifier of the participant.
     * @param mediaOperationId The Id of the media operation to Cancel.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> CancelParticipantMediaOperation(
        CommunicationIdentifier participant,
        String mediaOperationId) {
        try {
            Objects.requireNonNull(participant, "'participant' cannot be null.");
            Objects.requireNonNull(mediaOperationId, "'mediaOperationId' cannot be null.");

            CancelParticipantMediaOperationRequest cancelParticipantMediaOperationRequest =
                new CancelParticipantMediaOperationRequest()
                    .setMediaOperationId(mediaOperationId)
                    .setIdentifier(CommunicationIdentifierConverter.convert(participant));

            return callConnectionInternal.cancelParticipantMediaOperationAsync(callConnectionId, cancelParticipantMediaOperationRequest, Context.NONE)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.empty());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Cancel Participant Media Operation.
     *
     * @param participant The identifier of the participant.
     * @param mediaOperationId The Id of the media operation to Cancel.
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for play audio operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> CancelParticipantMediaOperationWithResponse(
        CommunicationIdentifier participant,
        String mediaOperationId) {
        Objects.requireNonNull(participant, "'participant' cannot be null.");
        Objects.requireNonNull(mediaOperationId, "'mediaOperationId' cannot be null.");
        return CancelParticipantMediaOperationWithResponseInternal(participant, mediaOperationId, Context.NONE);
    }

    Mono<Response<Void>> CancelParticipantMediaOperationWithResponseInternal(
        CommunicationIdentifier participant,
        String mediaOperationId,
        Context context) {
        try {
            CancelParticipantMediaOperationRequest cancelParticipantMediaOperationRequest =
                new CancelParticipantMediaOperationRequest()
                    .setMediaOperationId(mediaOperationId)
                    .setIdentifier(CommunicationIdentifierConverter.convert(participant));

            return withContext(contextValue -> {
                contextValue = context == null ? contextValue : context;
                return callConnectionInternal.cancelParticipantMediaOperationWithResponseAsync(callConnectionId, cancelParticipantMediaOperationRequest, contextValue)
                    .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }
}
