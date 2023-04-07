package com.tienda.web.tiendacarpinteria.api;

import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
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
 * A delegate to be called by the {@link OrdersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public interface OrdersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /orders/{orderId}/buy : Buy order
     * Buy a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see OrdersApi#buyOrder
     */
    default ResponseEntity<ResponseContainerResponseDTO> buyOrder(Long orderId) {
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
     * POST /orders : Create order
     * Create a order, authentication required.
     *
     * @param orderRequestDTO Created order object (optional)
     * @return successful operation response a OrderDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see OrdersApi#createOrder
     */
    default ResponseEntity<ResponseContainerResponseDTO> createOrder(OrderRequestDTO orderRequestDTO) {
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
     * DELETE /orders/{orderId} : Delete order
     * Delete a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see OrdersApi#deleteOrder
     */
    default ResponseEntity<ResponseContainerResponseDTO> deleteOrder(Long orderId) {
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
     * GET /orders : Retrieve a list of orders
     * Retrieve a list of orders
     *
     * @return successful operation response a ProductListDTO as data (status code 200)
     * @see OrdersApi#retrieveAllOrders
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllOrders() {
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
     * GET /orders/{orderId} : Retrieve cart
     * Retrieve a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a CartDTO as data (status code 200)
     * @see OrdersApi#retrieveCart
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveCart(Long orderId) {
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
