package com.tienda.web.tiendacarpinteria.api;

import com.tienda.web.tiendacarpinteria.model.ResponseContainerResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link TokenApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public interface TokenApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /token/login : Create a user session
     * Create a user session
     *
     * @param username the username to authenticate (required)
     * @param password the password to authenticate (required)
     * @return successful operation response a JWTResponseDTO as data (status code 200)
     * @see TokenApi#login
     */
    default ResponseEntity<ResponseContainerResponseDTO> login(String username,
        String password) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"type\" : \"type\" }, \"meta\" : { \"refNumber\" : \"refNumber\", \"time\" : 0 }, \"errors\" : [ { \"code\" : \"code\", \"link\" : \"link\", \"detail\" : \"detail\" }, { \"code\" : \"code\", \"link\" : \"link\", \"detail\" : \"detail\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /token/refresh : refresh a token
     * Refresh a token, authentication required.
     *
     * @param authorization authentication token (required)
     * @return successful operation response a JWTResponseDTO as data (status code 200)
     * @see TokenApi#refreshToken
     */
    default ResponseEntity<ResponseContainerResponseDTO> refreshToken(String authorization) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"type\" : \"type\" }, \"meta\" : { \"refNumber\" : \"refNumber\", \"time\" : 0 }, \"errors\" : [ { \"code\" : \"code\", \"link\" : \"link\", \"detail\" : \"detail\" }, { \"code\" : \"code\", \"link\" : \"link\", \"detail\" : \"detail\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
