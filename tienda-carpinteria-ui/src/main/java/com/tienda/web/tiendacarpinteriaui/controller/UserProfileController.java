package com.tienda.web.tiendacarpinteriaui.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.api.UserApi;
import com.tienda.web.tienda_carpinteria_ui.model.ResponseContainerResponseDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserListDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserRequestDTO;
import com.tienda.web.tiendacarpinteriaui.model.NewUserAccountModel;
import com.tienda.web.tiendacarpinteriaui.model.UserLoginModel;
import com.tienda.web.tiendacarpinteriaui.utils.DateUtils;


@Controller
@RequestMapping(path="/profile") 
public class UserProfileController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileController.class);
	
	private UserApi userApi;
	private ObjectMapper mapper;
	

	public UserProfileController(UserApi theUserApi, ObjectMapper theMapper) {
		userApi = theUserApi;
		mapper = theMapper;
	}


	@GetMapping("")
	public String productPage(HttpServletRequest request, HttpServletResponse response, 
			Model model,HttpSession session) {
		
		ResponseContainerResponseDTO responseContainerDto = null;
		
		try {
			responseContainerDto = userApi.retrieveAllUsers();
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		if (responseContainerDto == null) {
			model.addAttribute("errorRetrievingUsers", "Error interno.");
		} else if (responseContainerDto.getErrors() != null && !responseContainerDto.getErrors().isEmpty()) {
			model.addAttribute("errorRetrievingUsers", responseContainerDto.getErrors().get(0).getDetail());
		}
			UserListDTO userListDTO = (UserListDTO) responseContainerDto.getData();
			
			List<UserDTO> userList = userListDTO.getItems();
			
			UserLoginModel userModel = (UserLoginModel) session.getAttribute("user");
			
			String email = userModel.getUsername();
			
			System.out.println(email);
			
			for(UserDTO user: userList ) {
				if(user.getEmail().equals(email)) {
					model.addAttribute("products", user);
					LOGGER.info("User ok", email);
				}
			}
		
			
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "profile";
		}
	
	/**/
	
	
	@GetMapping("/register")
	public String registerPage(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		
		model.addAttribute("newUserAccountModel", new NewUserAccountModel());
		
		return "newAccount";
	}
	
	
	//
	@PostMapping("/register")
	public String registerNewUser(HttpServletRequest request, HttpServletResponse response,  Model model, 
						@ModelAttribute NewUserAccountModel newUserAccountModel ) {
		
		HttpSession session = request.getSession();
		ResponseContainerResponseDTO responseContainerDto = null;
		
		UserRequestDTO newUser = new UserRequestDTO();
		
		
		newUser.setFirstName(newUserAccountModel.getFirstName());
		newUser.setLastName(newUserAccountModel.getLastName());
		newUser.setEmail(newUserAccountModel.getEmail().toLowerCase());
		newUser.setDni(newUserAccountModel.getDni());
		newUser.setPassword(newUserAccountModel.getPassword());
		newUser.setAddress(newUserAccountModel.getAddress());
		

		try {
			responseContainerDto = userApi.createUser(newUser);
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "redirect:/index";
	}

	
	
}
	


