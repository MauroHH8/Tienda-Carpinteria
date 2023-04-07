# TiendaDeCarpinteriaOpenApi30.LoginApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](LoginApi.md#login) | **POST** /token/login | Create a user session
[**refreshToken**](LoginApi.md#refreshToken) | **PATCH** /token/refresh | refresh a token



## login

> ResponseContainerResponseDTO login(username, password)

Create a user session

Create a user session

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.LoginApi();
let username = "username_example"; // String | the username to authenticate
let password = "password_example"; // String | the password to authenticate
apiInstance.login(username, password, (error, data, response) => {
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
 **username** | **String**| the username to authenticate | 
 **password** | **String**| the password to authenticate | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## refreshToken

> ResponseContainerResponseDTO refreshToken(authorization)

refresh a token

Refresh a token, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.LoginApi();
let authorization = "authorization_example"; // String | authentication token
apiInstance.refreshToken(authorization, (error, data, response) => {
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
 **authorization** | **String**| authentication token | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

