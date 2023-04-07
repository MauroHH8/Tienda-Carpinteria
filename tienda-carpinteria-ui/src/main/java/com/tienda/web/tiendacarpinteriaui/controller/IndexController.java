package com.tienda.web.tiendacarpinteriaui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.api.BackofficeApi;
import com.tienda.web.tienda_carpinteria_ui.api.StoreApi;
import com.tienda.web.tienda_carpinteria_ui.api.UserApi;
import com.tienda.web.tienda_carpinteria_ui.model.CategoryListDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ProductDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ResponseContainerResponseDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserRequestDTO;
import com.tienda.web.tiendacarpinteriaui.model.NewUserAccountModel;
import com.tienda.web.tiendacarpinteriaui.model.UserLoginModel;
import com.tienda.web.tiendacarpinteriaui.utils.DateUtils;

@Controller
@RequestMapping(path = "/index")
public class IndexController extends BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
	private BackofficeApi backofficeApi;
	private ObjectMapper mapper;
	private StoreApi storeApi;
	private ProductDTO product;
	private UserApi userApi;
	
	
	public IndexController(ObjectMapper theMapper, BackofficeApi theBackofficeApi, StoreApi theStoreApi, UserApi theUserApi) {
		mapper = theMapper;
		backofficeApi = theBackofficeApi;
		storeApi = theStoreApi;
		userApi = theUserApi;
	}

	@GetMapping("")
	public String indexPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		HttpSession session = request.getSession();
		ResponseContainerResponseDTO responseContainerDto = null;
		try {
			responseContainerDto = backofficeApi.retrieveAllCategory();
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		if (responseContainerDto == null) {
			model.addAttribute("errorRetrievingCategories", "Error interno.");
		} else if (responseContainerDto.getErrors() != null && !responseContainerDto.getErrors().isEmpty()) {
			model.addAttribute("errorRetrievingCategories", responseContainerDto.getErrors().get(0).getDetail());
		} else {
			CategoryListDTO categoryListDTO = (CategoryListDTO) responseContainerDto.getData();
			model.addAttribute("categories", categoryListDTO);
		}
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "index";
	}
	
	
	
}