package com.tienda.web.tiendacarpinteriaui.interceptors;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {
	
	private ObjectMapper mapper;
	
	public RestTemplateResponseErrorHandler(ObjectMapper theMapper) {
		mapper = theMapper;
	}

	@Override
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
		return (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR || 
				httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);	
		}

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {
		if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
			//error servidor	
		} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
			//error cliente
		}
		Map<String, Object> response = mapper.readValue(httpResponse.getBody(),HashMap.class);
		throw new HttpClientErrorException(httpResponse.getStatusCode(), (String) response.get("error"));
		}

	@Override
	public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {
		handleError(response);
	}
}
	

	
	
