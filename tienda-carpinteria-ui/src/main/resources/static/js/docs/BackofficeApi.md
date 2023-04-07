# TiendaDeCarpinteriaOpenApi30.BackofficeApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory**](BackofficeApi.md#createCategory) | **POST** /products/category | Create category
[**createProduct**](BackofficeApi.md#createProduct) | **POST** /products/product | Create product
[**deleteCategory**](BackofficeApi.md#deleteCategory) | **DELETE** /products/category/{categoryId} | Delete category
[**deleteProduct**](BackofficeApi.md#deleteProduct) | **DELETE** /products/product/{productId} | Delete product
[**retrieveAllCategory**](BackofficeApi.md#retrieveAllCategory) | **GET** /products/category | Retrieve a list of category
[**retrieveAllProducts**](BackofficeApi.md#retrieveAllProducts) | **GET** /products/product | Retrieve a list of products
[**retrieveCategory**](BackofficeApi.md#retrieveCategory) | **GET** /products/category/{categoryId} | Retrieve category
[**retrieveProduct**](BackofficeApi.md#retrieveProduct) | **GET** /products/product/{productId} | Retrieve product
[**updateCategory**](BackofficeApi.md#updateCategory) | **PUT** /products/category/{categoryId} | Update category
[**updateProduct**](BackofficeApi.md#updateProduct) | **PUT** /products/product/{productId} | Update product



## createCategory

> ResponseContainerResponseDTO createCategory(opts)

Create category

Create a category, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let opts = {
  'categoryRequestDTO': new TiendaDeCarpinteriaOpenApi30.CategoryRequestDTO() // CategoryRequestDTO | Created category object
};
apiInstance.createCategory(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryRequestDTO** | [**CategoryRequestDTO**](CategoryRequestDTO.md)| Created category object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createProduct

> ResponseContainerResponseDTO createProduct(opts)

Create product

Create a product, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let opts = {
  'productRequestDTO': new TiendaDeCarpinteriaOpenApi30.ProductRequestDTO() // ProductRequestDTO | Created product object
};
apiInstance.createProduct(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productRequestDTO** | [**ProductRequestDTO**](ProductRequestDTO.md)| Created product object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteCategory

> ResponseContainerResponseDTO deleteCategory(categoryId)

Delete category

Delete a category, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let categoryId = 789; // Number | the category id
apiInstance.deleteCategory(categoryId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Number**| the category id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteProduct

> ResponseContainerResponseDTO deleteProduct(productId)

Delete product

Delete a product, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let productId = 789; // Number | the product id
apiInstance.deleteProduct(productId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Number**| the product id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveAllCategory

> ResponseContainerResponseDTO retrieveAllCategory()

Retrieve a list of category

Retrieve a list of category, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
apiInstance.retrieveAllCategory((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveAllProducts

> ResponseContainerResponseDTO retrieveAllProducts()

Retrieve a list of products

Retrieve a list of products, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
apiInstance.retrieveAllProducts((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveCategory

> ResponseContainerResponseDTO retrieveCategory(categoryId)

Retrieve category

Retrieve a category, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let categoryId = 789; // Number | the category id
apiInstance.retrieveCategory(categoryId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Number**| the category id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveProduct

> ResponseContainerResponseDTO retrieveProduct(productId)

Retrieve product

Retrieve a product, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let productId = 789; // Number | the product id
apiInstance.retrieveProduct(productId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Number**| the product id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateCategory

> ResponseContainerResponseDTO updateCategory(categoryId, opts)

Update category

Update a category, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let categoryId = 789; // Number | the category id
let opts = {
  'categoryDTO': new TiendaDeCarpinteriaOpenApi30.CategoryDTO() // CategoryDTO | Updated category object
};
apiInstance.updateCategory(categoryId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Number**| the category id | 
 **categoryDTO** | [**CategoryDTO**](CategoryDTO.md)| Updated category object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateProduct

> ResponseContainerResponseDTO updateProduct(productId, opts)

Update product

Update a product, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.BackofficeApi();
let productId = 789; // Number | the product id
let opts = {
  'productDTO': new TiendaDeCarpinteriaOpenApi30.ProductDTO() // ProductDTO | Updated product object
};
apiInstance.updateProduct(productId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Number**| the product id | 
 **productDTO** | [**ProductDTO**](ProductDTO.md)| Updated product object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

