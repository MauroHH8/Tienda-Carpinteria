# TiendaDeCarpinteriaOpenApi30.StoreApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToCart**](StoreApi.md#addToCart) | **PUT** /carts/cart/{cartId}/items | Add a product to the cart
[**buyCart**](StoreApi.md#buyCart) | **DELETE** /carts/cart/{cartId}/buy | Buy cart
[**createCart**](StoreApi.md#createCart) | **POST** /carts/cart | Create cart
[**deleteCart**](StoreApi.md#deleteCart) | **DELETE** /carts/cart/{cartId} | Delete cart
[**deleteFromCart**](StoreApi.md#deleteFromCart) | **DELETE** /carts/cart/{cartId}/items | Delete products from cart
[**retrieveCart**](StoreApi.md#retrieveCart) | **GET** /carts/cart/{cartId} | Retrieve cart
[**retrieveProductsInCart**](StoreApi.md#retrieveProductsInCart) | **GET** /carts/cart/{cartId}/items | Retrieve products in cart



## addToCart

> ResponseContainerResponseDTO addToCart(cartId, opts)

Add a product to the cart

Add a product to the cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
let opts = {
  'productCartDTO': new TiendaDeCarpinteriaOpenApi30.ProductCartDTO() // ProductCartDTO | The product to be added.
};
apiInstance.addToCart(cartId, opts, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 
 **productCartDTO** | [**ProductCartDTO**](ProductCartDTO.md)| The product to be added. | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## buyCart

> ResponseContainerResponseDTO buyCart(cartId)

Buy cart

Buy a cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
apiInstance.buyCart(cartId, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createCart

> ResponseContainerResponseDTO createCart(opts)

Create cart

Create a cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let opts = {
  'cartDTO': new TiendaDeCarpinteriaOpenApi30.CartDTO() // CartDTO | Created cart object
};
apiInstance.createCart(opts, (error, data, response) => {
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
 **cartDTO** | [**CartDTO**](CartDTO.md)| Created cart object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteCart

> ResponseContainerResponseDTO deleteCart(cartId)

Delete cart

Delete a cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
apiInstance.deleteCart(cartId, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteFromCart

> ResponseContainerResponseDTO deleteFromCart(cartId)

Delete products from cart

Delete products from cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
apiInstance.deleteFromCart(cartId, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveCart

> ResponseContainerResponseDTO retrieveCart(cartId)

Retrieve cart

Retrieve a cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
apiInstance.retrieveCart(cartId, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveProductsInCart

> ResponseContainerResponseDTO retrieveProductsInCart(cartId)

Retrieve products in cart

Retrieve products in cart, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.StoreApi();
let cartId = "cartId_example"; // String | the cartId
apiInstance.retrieveProductsInCart(cartId, (error, data, response) => {
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
 **cartId** | **String**| the cartId | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

