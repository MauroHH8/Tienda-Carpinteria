package com.tienda.web.tiendacarpinteriaui.interceptors;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestTemplateHeaderModifierInterceptor implements ClientHttpRequestInterceptor {

	private ObjectMapper mapper;
	
	public RestTemplateHeaderModifierInterceptor (ObjectMapper theMapper) {
		mapper = theMapper;
	}
	
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		HttpServletRequest httpServletRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		HttpSession session = httpServletRequest.getSession();
		String accessToken = (String) session.getAttribute("access-token");
		if(accessToken != null && accessToken != "") {
			request.getHeaders().add("authorization","Bearer " + accessToken);
		}
		ClientHttpResponse response = execution.execute(request,  body);
		if(response.getStatusCode()== HttpStatus.FORBIDDEN) {
		}
		return response;
	}

}
