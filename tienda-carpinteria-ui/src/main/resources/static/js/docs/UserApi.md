# TiendaDeCarpinteriaOpenApi30.UserApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRoleToUser**](UserApi.md#addRoleToUser) | **POST** /users/user/{userDni}/role/{roleId} | Add role to a user
[**createRole**](UserApi.md#createRole) | **POST** /users/role | Create roles
[**createUser**](UserApi.md#createUser) | **POST** /users/add-user | Create user
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/user/{userDni} | Delete user
[**getUserRoles**](UserApi.md#getUserRoles) | **GET** /users/user/{userDni}/roles | Retrieve the roles from a user.
[**removeRoleToUser**](UserApi.md#removeRoleToUser) | **DELETE** /users/user/{userDni}/role/{roleId} | Remove role from a user
[**retrieveAllRoles**](UserApi.md#retrieveAllRoles) | **GET** /users/role | Retrieve a list of roles
[**retrieveAllUsers**](UserApi.md#retrieveAllUsers) | **GET** /users/list | Retrieve a list of users
[**retrieveUser**](UserApi.md#retrieveUser) | **GET** /users/user/{userDni} | Retrieve a user
[**updateUser**](UserApi.md#updateUser) | **PUT** /users/user/{userDni} | Update user



## addRoleToUser

> ResponseContainerResponseDTO addRoleToUser(userDni, roleId)

Add role to a user

Add a role to a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user id
let roleId = 789; // Number | the role id
apiInstance.addRoleToUser(userDni, roleId, (error, data, response) => {
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
 **userDni** | **Number**| the user id | 
 **roleId** | **Number**| the role id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createRole

> ResponseContainerResponseDTO createRole(opts)

Create roles

Create a roles, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let opts = {
  'userRoleRequestDTO': new TiendaDeCarpinteriaOpenApi30.UserRoleRequestDTO() // UserRoleRequestDTO | Created roles object
};
apiInstance.createRole(opts, (error, data, response) => {
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
 **userRoleRequestDTO** | [**UserRoleRequestDTO**](UserRoleRequestDTO.md)| Created roles object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createUser

> ResponseContainerResponseDTO createUser(opts)

Create user

Create a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let opts = {
  'userRequestDTO': new TiendaDeCarpinteriaOpenApi30.UserRequestDTO() // UserRequestDTO | Created user object
};
apiInstance.createUser(opts, (error, data, response) => {
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
 **userRequestDTO** | [**UserRequestDTO**](UserRequestDTO.md)| Created user object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteUser

> ResponseContainerResponseDTO deleteUser(userDni, opts)

Delete user

Delete a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user DNI
let opts = {
  'userDTO': new TiendaDeCarpinteriaOpenApi30.UserDTO() // UserDTO | Created user object
};
apiInstance.deleteUser(userDni, opts, (error, data, response) => {
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
 **userDni** | **Number**| the user DNI | 
 **userDTO** | [**UserDTO**](UserDTO.md)| Created user object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getUserRoles

> ResponseContainerResponseDTO getUserRoles(userDni)

Retrieve the roles from a user.

Retrieve the roles from a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user id
apiInstance.getUserRoles(userDni, (error, data, response) => {
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
 **userDni** | **Number**| the user id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removeRoleToUser

> ResponseContainerResponseDTO removeRoleToUser(userDni, roleId)

Remove role from a user

Remove a role from a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user id
let roleId = 789; // Number | the role id
apiInstance.removeRoleToUser(userDni, roleId, (error, data, response) => {
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
 **userDni** | **Number**| the user id | 
 **roleId** | **Number**| the role id | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveAllRoles

> ResponseContainerResponseDTO retrieveAllRoles()

Retrieve a list of roles

Retrieve a list of roles, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
apiInstance.retrieveAllRoles((error, data, response) => {
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


## retrieveAllUsers

> ResponseContainerResponseDTO retrieveAllUsers()

Retrieve a list of users

Retrieve a list of users, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
apiInstance.retrieveAllUsers((error, data, response) => {
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


## retrieveUser

> ResponseContainerResponseDTO retrieveUser(userDni)

Retrieve a user

Retrieve a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user DNI
apiInstance.retrieveUser(userDni, (error, data, response) => {
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
 **userDni** | **Number**| the user DNI | 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateUser

> ResponseContainerResponseDTO updateUser(userDni, opts)

Update user

Update a user, authentication required.

### Example

```javascript
import TiendaDeCarpinteriaOpenApi30 from 'tienda_de_carpinteria_open_api_3_0';
let defaultClient = TiendaDeCarpinteriaOpenApi30.ApiClient.instance;
// Configure Bearer (JWT) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new TiendaDeCarpinteriaOpenApi30.UserApi();
let userDni = 56; // Number | the user dni
let opts = {
  'userDTO': new TiendaDeCarpinteriaOpenApi30.UserDTO() // UserDTO | Updated user object
};
apiInstance.updateUser(userDni, opts, (error, data, response) => {
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
 **userDni** | **Number**| the user dni | 
 **userDTO** | [**UserDTO**](UserDTO.md)| Updated user object | [optional] 

### Return type

[**ResponseContainerResponseDTO**](ResponseContainerResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

