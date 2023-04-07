/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.tienda.web.tiendacarpinteria.api;

import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ResponseContainerResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
@Validated
@Tag(name = "orders", description = "Access to the store")
public interface OrdersApi {

    default OrdersApiDelegate getDelegate() {
        return new OrdersApiDelegate() {};
    }

    /**
     * DELETE /orders/{orderId}/buy : Buy order
     * Buy a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     */
    @Operation(
        operationId = "buyOrder",
        summary = "Buy order",
        tags = { "store" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation response a EmptyResponseDTO as data", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Access token is missing or invalid")
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/orders/{orderId}/buy",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseContainerResponseDTO> buyOrder(
        @Parameter(name = "orderId", description = "the orderId", required = true) @PathVariable("orderId") Long orderId
    ) {
        return getDelegate().buyOrder(orderId);
    }


    /**
     * POST /orders : Create order
     * Create a order, authentication required.
     *
     * @param orderRequestDTO Created order object (optional)
     * @return successful operation response a OrderDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     */
    @Operation(
        operationId = "createOrder",
        summary = "Create order",
        tags = { "store" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation response a OrderDTO as data", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Access token is missing or invalid")
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/orders",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ResponseContainerResponseDTO> createOrder(
        @Parameter(name = "OrderRequestDTO", description = "Created order object") @Valid @RequestBody(required = false) OrderRequestDTO orderRequestDTO
    ) {
        return getDelegate().createOrder(orderRequestDTO);
    }


    /**
     * DELETE /orders/{orderId} : Delete order
     * Delete a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     */
    @Operation(
        operationId = "deleteOrder",
        summary = "Delete order",
        tags = { "store" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation response a EmptyResponseDTO as data", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Access token is missing or invalid")
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseContainerResponseDTO> deleteOrder(
        @Parameter(name = "orderId", description = "the orderId", required = true) @PathVariable("orderId") Long orderId
    ) {
        return getDelegate().deleteOrder(orderId);
    }


    /**
     * GET /orders : Retrieve a list of orders
     * Retrieve a list of orders
     *
     * @return successful operation response a ProductListDTO as data (status code 200)
     */
    @Operation(
        operationId = "retrieveAllOrders",
        summary = "Retrieve a list of orders",
        tags = { "store" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation response a ProductListDTO as data", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllOrders(
        
    ) {
        return getDelegate().retrieveAllOrders();
    }


    /**
     * GET /orders/{orderId} : Retrieve cart
     * Retrieve a order, authentication required.
     *
     * @param orderId the orderId (required)
     * @return successful operation response a CartDTO as data (status code 200)
     */
    @Operation(
        operationId = "retrieveCart",
        summary = "Retrieve cart",
        tags = { "store" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation response a CartDTO as data", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseContainerResponseDTO> retrieveCart(
        @Parameter(name = "orderId", description = "the orderId", required = true) @PathVariable("orderId") Long orderId
    ) {
        return getDelegate().retrieveCart(orderId);
    }

}