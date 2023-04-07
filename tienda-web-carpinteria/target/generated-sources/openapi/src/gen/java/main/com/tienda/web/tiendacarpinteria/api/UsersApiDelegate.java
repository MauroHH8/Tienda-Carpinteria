package com.tienda.web.tiendacarpinteria.api;

import com.tienda.web.tiendacarpinteria.model.ResponseContainerResponseDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserRequestDTO;
import com.tienda.web.tiendacarpinteria.model.UserRoleRequestDTO;
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
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users/user/{userDni}/role/{roleId} : Add role to a user
     * Add a role to a user, authentication required.
     *
     * @param userDni the user id (required)
     * @param roleId the role id (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#addRoleToUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> addRoleToUser(Integer userDni,
        Long roleId) {
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
     * POST /users/role : Create roles
     * Create a roles, authentication required.
     *
     * @param userRoleRequestDTO Created roles object (optional)
     * @return successful operation response a UserRoleDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#createRole
     */
    default ResponseEntity<ResponseContainerResponseDTO> createRole(UserRoleRequestDTO userRoleRequestDTO) {
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
     * POST /users/add-user : Create user
     * Create a user, authentication required.
     *
     * @param userRequestDTO Created user object (optional)
     * @return successful operation response a UserDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#createUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> createUser(UserRequestDTO userRequestDTO) {
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
     * DELETE /users/user/{userDni} : Delete user
     * Delete a user, authentication required.
     *
     * @param userDni the user DNI (required)
     * @param userDTO Created user object (optional)
     * @return successful operation  response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#deleteUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> deleteUser(Integer userDni,
        UserDTO userDTO) {
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
     * GET /users/user/{userDni}/roles : Retrieve the roles from a user.
     * Retrieve the roles from a user, authentication required.
     *
     * @param userDni the user id (required)
     * @return successful operation response a UserRoleListDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#getUserRoles
     */
    default ResponseEntity<ResponseContainerResponseDTO> getUserRoles(Integer userDni) {
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
     * DELETE /users/user/{userDni}/role/{roleId} : Remove role from a user
     * Remove a role from a user, authentication required.
     *
     * @param userDni the user id (required)
     * @param roleId the role id (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#removeRoleToUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> removeRoleToUser(Integer userDni,
        Long roleId) {
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
     * GET /users/role : Retrieve a list of roles
     * Retrieve a list of roles, authentication required.
     *
     * @return successful operation response a UserRoleListDTO as data (status code 200)
     * @see UsersApi#retrieveAllRoles
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllRoles() {
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
     * GET /users/list : Retrieve a list of users
     * Retrieve a list of users, authentication required.
     *
     * @return successful operation response a UserListDTO as data (status code 200)
     * @see UsersApi#retrieveAllUsers
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllUsers() {
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
     * GET /users/user/{userDni} : Retrieve a user
     * Retrieve a user, authentication required.
     *
     * @param userDni the user DNI (required)
     * @return successful operation response a UserDTO as data (status code 200)
     * @see UsersApi#retrieveUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveUser(Integer userDni) {
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
     * GET /users/user/{email} : Retrieve a user
     * Retrieve a user, authentication required.
     *
     * @param email the user email (required)
     * @return successful operation response a UserDTO as data (status code 200)
     * @see UsersApi#retrieveUserbyEmail
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveUserbyEmail(String email) {
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
     * PUT /users/user/{userDni} : Update user
     * Update a user, authentication required.
     *
     * @param userDni the user dni (required)
     * @param userDTO Updated user object (optional)
     * @return successful operation response a UserDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see UsersApi#updateUser
     */
    default ResponseEntity<ResponseContainerResponseDTO> updateUser(Integer userDni,
        UserDTO userDTO) {
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
