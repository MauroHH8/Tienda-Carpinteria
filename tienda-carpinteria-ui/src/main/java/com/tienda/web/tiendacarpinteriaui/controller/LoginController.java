package com.tienda.web.tiendacarpinteriaui.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.api.LoginApi;
import com.tienda.web.tienda_carpinteria_ui.model.JWTResponseDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ResponseContainerResponseDTO;
import com.tienda.web.tiendacarpinteriaui.model.UserLoginModel;


@Controller
@RequestMapping(path = "") //No renderiza una pagina, ya que esta dentro del index como comportamiento
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	private LoginApi loginApi;
	private ObjectMapper mapper;
	
	public LoginController(ObjectMapper theMapper, LoginApi theLoginApi) {
		mapper = theMapper;
		loginApi = theLoginApi;
	}

	@PostMapping("/login")
	public String performLogin(HttpServletRequest request, Model model, @ModelAttribute UserLoginModel loginModel) {
		ResponseEntity<ResponseContainerResponseDTO> responseEntity = null;
		try {
			responseEntity = loginApi.loginWithHttpInfo(loginModel.getUsername(), loginModel.getPassword());
		} catch (HttpClientErrorException e) {
			try {
				ResponseContainerResponseDTO resp = mapper.readValue(e.getResponseBodyAsByteArray(),
						ResponseContainerResponseDTO.class);
				responseEntity = new ResponseEntity<ResponseContainerResponseDTO>(resp, e.getStatusCode());
			} catch (IOException e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		HttpHeaders headers = responseEntity.getHeaders();
		ResponseContainerResponseDTO response = responseEntity.getBody();
		String redirectUrl = "redirect:"+loginModel.getRedirectTo();
		HttpSession session = request.getSession();		
		if (response == null) {
			session.setAttribute("loginError", "Error interno.");
		} else if (response.getErrors() != null && !response.getErrors().isEmpty()) {
			session.setAttribute("loginError", response.getErrors().get(0).getDetail());
		} else {
			JWTResponseDTO jwtResponse = (JWTResponseDTO) response.getData();
			session.removeAttribute("loginError");
			loginModel.setPassword(StringUtils.repeat("*", loginModel.getPassword().length()));
			String accessToken = headers.getFirst("access_token");
			String refreshToken = headers.getFirst("refresh_token");
			loginModel.setAccessToken(accessToken);
			loginModel.setRefreshToken(refreshToken);
			session.setAttribute("user", loginModel);
			session.setAttribute("access-token", accessToken);
			session.setAttribute("refresh-token", refreshToken);
		}
		return redirectUrl; 
	}
	
	@GetMapping("/logout")
	public String performLogout(HttpServletRequest request, Model model, @ModelAttribute UserLoginModel loginModel) {
		String redirectUrl = "redirect:/"+loginModel.getRedirectTo();
		HttpSession session = request.getSession();
		session.removeAttribute("access-token");
		session.removeAttribute("refresh-token");
		session.removeAttribute("user");
		return "redirect:/index";
	}
	

}
