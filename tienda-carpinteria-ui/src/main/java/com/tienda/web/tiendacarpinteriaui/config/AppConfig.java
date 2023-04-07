package com.tienda.web.tiendacarpinteriaui.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.ApiClient;
import com.tienda.web.tienda_carpinteria_ui.api.BackofficeApi;
import com.tienda.web.tienda_carpinteria_ui.api.LoginApi;
import com.tienda.web.tienda_carpinteria_ui.api.StoreApi;
import com.tienda.web.tienda_carpinteria_ui.api.UserApi;
import com.tienda.web.tiendacarpinteriaui.interceptors.RestTemplateHeaderModifierInterceptor;
import com.tienda.web.tiendacarpinteriaui.interceptors.RestTemplateResponseErrorHandler;

@Configuration
public class AppConfig {

	//Configuracion del host
	@Bean
	public ApiClient getApiClient(RestTemplate restTemplate, @Value("${api.server.host}") String baseUri) {
		ApiClient client = new ApiClient(restTemplate);
		client.setBasePath(baseUri);
		return client;
	}
	
	
	
	@Bean
	public RestTemplateResponseErrorHandler getRestTemplateResponseErrorHandler (ObjectMapper objectMapper) {
		return new RestTemplateResponseErrorHandler(objectMapper);
	}
	
	//RestTemplate del Apiclient sobreescrito para utilizar el interceptor y el ErrorHandler
	@Bean
	public RestTemplate getRestTemplate(RestTemplateResponseErrorHandler responseErrorHandler, ObjectMapper objectMapper) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
		DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory();
		uriBuilderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);
		restTemplate.setUriTemplateHandler(uriBuilderFactory);
		
		//Complementario al RestTemplate de ApiClient
		
		List <ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
		if (CollectionUtils.isEmpty(interceptors)) {
			interceptors = new ArrayList<>();
		}
		interceptors.add(new RestTemplateHeaderModifierInterceptor(objectMapper));
		restTemplate.setInterceptors(interceptors);
		
		return restTemplate;
	}
		
	//Comunicacion con la API del contrato Swagger, a traves de Intancias del cliente api.
	
	@Bean
	public LoginApi getLoginApi (ApiClient apiClient) {
		return new LoginApi(apiClient);
	}
	
	@Bean
	public BackofficeApi getBackofficeApi (ApiClient apiClient) {
		return new BackofficeApi(apiClient);
	}
	
	//52.59
		
	@Bean
	public StoreApi getStoreApi (ApiClient apiClient) {
		return new StoreApi(apiClient);
	}
	
	@Bean
	public UserApi getUserApi (ApiClient apiClient) {
		return new UserApi(apiClient);
	}
	
}
