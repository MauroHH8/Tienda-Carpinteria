package com.tienda.web.tiendacarpinteria.api;

import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.ProductRequestDTO;
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
 * A delegate to be called by the {@link ProductsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public interface ProductsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /products/category : Create category
     * Create a category, authentication required.
     *
     * @param categoryRequestDTO Created category object (optional)
     * @return successful operation response a CategoryDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#createCategory
     */
    default ResponseEntity<ResponseContainerResponseDTO> createCategory(CategoryRequestDTO categoryRequestDTO) {
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
     * POST /products/product : Create product
     * Create a product, authentication required.
     *
     * @param productRequestDTO Created product object (optional)
     * @return successful operation response a ProductDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#createProduct
     */
    default ResponseEntity<ResponseContainerResponseDTO> createProduct(ProductRequestDTO productRequestDTO) {
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
     * DELETE /products/category/{categoryId} : Delete category
     * Delete a category, authentication required.
     *
     * @param categoryId the category id (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#deleteCategory
     */
    default ResponseEntity<ResponseContainerResponseDTO> deleteCategory(Long categoryId) {
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
     * DELETE /products/product/{productId} : Delete product
     * Delete a product, authentication required.
     *
     * @param productId the product id (required)
     * @return successful operation response a EmptyResponseDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#deleteProduct
     */
    default ResponseEntity<ResponseContainerResponseDTO> deleteProduct(Long productId) {
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
     * GET /products/category : Retrieve a list of category
     * Retrieve a list of category.
     *
     * @return successful operation response a CategoryListDTO as data (status code 200)
     * @see ProductsApi#retrieveAllCategory
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllCategory() {
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
     * GET /products/product : Retrieve a list of products
     * Retrieve a list of products.
     *
     * @return successful operation response a ProductListDTO as data (status code 200)
     * @see ProductsApi#retrieveAllProducts
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveAllProducts() {
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
     * GET /products/category/{categoryId} : Retrieve category
     * Retrieve a category, authentication required.
     *
     * @param categoryId the category id (required)
     * @return successful operation response a CategoryDTO as data (status code 200)
     * @see ProductsApi#retrieveCategory
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveCategory(Long categoryId) {
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
     * GET /products/product/{productId} : Retrieve product
     * Retrieve a product, authentication required.
     *
     * @param productId the product id (required)
     * @return successful operation response a ProductDTO as data (status code 200)
     * @see ProductsApi#retrieveProduct
     */
    default ResponseEntity<ResponseContainerResponseDTO> retrieveProduct(Long productId) {
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
     * PUT /products/category/{categoryId} : Update category
     * Update a category, authentication required.
     *
     * @param categoryId the category id (required)
     * @param categoryDTO Updated category object (optional)
     * @return successful operation response a CategoryDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#updateCategory
     */
    default ResponseEntity<ResponseContainerResponseDTO> updateCategory(Long categoryId,
        CategoryDTO categoryDTO) {
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
     * PUT /products/product/{productId} : Update product
     * Update a product, authentication required.
     *
     * @param productId the product id (required)
     * @param productDTO Updated product object (optional)
     * @return successful operation response a ProductDTO as data (status code 200)
     *         or Access token is missing or invalid (status code 401)
     * @see ProductsApi#updateProduct
     */
    default ResponseEntity<ResponseContainerResponseDTO> updateProduct(Long productId,
        ProductDTO productDTO) {
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
