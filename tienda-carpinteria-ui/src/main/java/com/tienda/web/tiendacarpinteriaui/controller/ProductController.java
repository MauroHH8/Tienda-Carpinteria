package com.tienda.web.tiendacarpinteriaui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.api.BackofficeApi;
import com.tienda.web.tienda_carpinteria_ui.model.OrderDetailsDTO;
import com.tienda.web.tienda_carpinteria_ui.model.OrderRequestDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ProductDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ProductListDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ResponseContainerResponseDTO;
import com.tienda.web.tiendacarpinteriaui.model.ProductCartModel;
import com.tienda.web.tiendacarpinteriaui.model.UserLoginModel;

@Controller
@RequestMapping(path="/products")
public class ProductController extends BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	private BackofficeApi backofficeApi;
	private ObjectMapper mapper;
	
	
	public ProductController(ObjectMapper theMapper, BackofficeApi thebackofficeApi) {
		mapper = theMapper;
		backofficeApi = thebackofficeApi;
	}

	@GetMapping("")
	public String productPage(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		
		HttpSession session = request.getSession();
		ResponseContainerResponseDTO responseContainerDto = null;
		
		try {
			responseContainerDto = backofficeApi.retrieveAllProducts();
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		if (responseContainerDto == null) {
			model.addAttribute("errorRetrievingProducts", "Error interno.");
		} else if (responseContainerDto.getErrors() != null && !responseContainerDto.getErrors().isEmpty()) {
			model.addAttribute("errorRetrievingProducts", responseContainerDto.getErrors().get(0).getDetail());
		} else {
			ProductListDTO productListDTO = (ProductListDTO) responseContainerDto.getData();
			model.addAttribute("products", productListDTO);
		}
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "products";
	}
	
	@GetMapping("/product/{id}")
	public String productViewer(HttpServletRequest request, HttpServletResponse response,@PathVariable Long id, Model model) {
		
		HttpSession session = request.getSession();
		ResponseContainerResponseDTO responseContainerDto = null;
		
		try {
			responseContainerDto = backofficeApi.retrieveProduct(id);
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		if (responseContainerDto == null) {
			model.addAttribute("errorRetrievingProducts", "Error interno.");
		} else if (responseContainerDto.getErrors() != null && !responseContainerDto.getErrors().isEmpty()) {
			model.addAttribute("errorRetrievingProducts", responseContainerDto.getErrors().get(0).getDetail());
		} else {
			ProductDTO productDTO = (ProductDTO) responseContainerDto.getData();
			model.addAttribute("product", productDTO);
		}
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "product";
	}

	
	
}

