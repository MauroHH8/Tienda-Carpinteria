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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienda.web.tienda_carpinteria_ui.api.BackofficeApi;
import com.tienda.web.tienda_carpinteria_ui.api.StoreApi;
import com.tienda.web.tienda_carpinteria_ui.api.UserApi;
import com.tienda.web.tienda_carpinteria_ui.model.OrderDTO;
import com.tienda.web.tienda_carpinteria_ui.model.OrderDetailsDTO;
import com.tienda.web.tienda_carpinteria_ui.model.OrderListDTO;
import com.tienda.web.tienda_carpinteria_ui.model.OrderRequestDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ProductDTO;
import com.tienda.web.tienda_carpinteria_ui.model.ResponseContainerResponseDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserListDTO;
import com.tienda.web.tiendacarpinteriaui.model.ProductCartModel;
import com.tienda.web.tiendacarpinteriaui.model.UserLoginModel;

@Controller
@RequestMapping(path="/cart")
public class CartController extends BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);
	
	private BackofficeApi backofficeApi;
	private ObjectMapper mapper;
	private UserApi userApi;
	private StoreApi storeApi;
	
	
	public CartController
	(BackofficeApi theBackofficeApi, ObjectMapper theMapper, 
			UserApi theUserApi,StoreApi theStoreApi) {
		backofficeApi = theBackofficeApi;
		mapper = theMapper;
		userApi = theUserApi;
		storeApi=theStoreApi;
	}

	
	List<ProductCartModel>cart = new ArrayList<>(); //Almacena detalles de las order
	OrderRequestDTO order = new OrderRequestDTO(); //Orden
	OrderDetailsDTO orderDetails = new OrderDetailsDTO (); //detalles
	List<OrderDetailsDTO> orderDetailsList = new ArrayList<>();
	
	
	@GetMapping("")
	public String cartPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		HttpSession session = request.getSession();
		double totalCart = 0;
		
		totalCart = cart.stream().mapToDouble(dt->dt.getTotal()).sum();
				
		
		//Devuelvo el carrito y el total
		model.addAttribute("cartProducts",cart);
		model.addAttribute("totalCart", totalCart);
		
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		
		return "cart";
	}
	
	
	
	@PostMapping("/add/product")
	public String addCartProduct(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer id , @RequestParam Integer cantidad, Model model) {
		
	
		ProductCartModel productModel = new ProductCartModel();
		double totalCart = 0; //El total
		ProductDTO product;
		
		Long idLong = Long.valueOf(id);
		
		//Me traigo el producto por id

		HttpSession session = request.getSession();
		ResponseContainerResponseDTO responseContainerDto = null;
		
		try {
			responseContainerDto = backofficeApi.retrieveProduct(idLong);
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
		}
		
		//Me traigo el producto directo de la api
		product = (ProductDTO) responseContainerDto.getData();
		
		//Cargo el model, para mostrarlo en el HTML
		productModel.setDescription(product.getDescription()); 
		productModel.setPrice(product.getPrice());
		productModel.setQty(cantidad);
		productModel.setTotal((cantidad) * (product.getPrice()));
		productModel.setId(product.getId());
		
		//Agrego productos al carrito, el carrito esta declarado como variable global de la clase.
		cart.add(productModel);
		
		//Obtengo el valor del carrito
		totalCart = cart.stream().mapToDouble(dt->dt.getTotal()).sum();
		
		//Devuelvo el carrito y el total
		model.addAttribute("cartProducts",cart);
		model.addAttribute("totalCart", totalCart);
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "cart";
	}
	
	@GetMapping("/delete/product/{id}")
	public String deleteCartProduct(HttpServletRequest request, HttpServletResponse response,@PathVariable Integer id, Model model ) {
		
		HttpSession session = request.getSession();
		
		List<ProductCartModel>auxCart = new ArrayList<>();
		Long idLong = Long.valueOf(id);
		double totalCart = 0;
		
		for(ProductCartModel productModel: cart) {
			if (productModel.getId()!=idLong) {
				auxCart.add(productModel);
			}
		}
		
		cart = auxCart;
		
		//Obtengo el valor del carrito
		totalCart = cart.stream().mapToDouble(dt->dt.getTotal()).sum();
				
		
		//Devuelvo el carrito y el total
		model.addAttribute("cartProducts",cart);
		model.addAttribute("totalCart", totalCart);
		
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "cart";
	}
	
	@GetMapping("/buy")
	public String buyCart(HttpServletRequest request, HttpServletResponse response, 
			Model model,HttpSession session) {
		
		ResponseContainerResponseDTO responseContainerDto = null;
		
		
		//Traer usuario
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
			
			//Agrego el usuario a la orden y a los detalles.
			for(UserDTO user: userList ) {
				if(user.getEmail().equals(email)) {
					order.setUser(user);
					orderDetails.setUser(user);
					LOGGER.info("Add user to order", email);
				}
			}
			
		
			//Tomo cada producto del carrito.
			
			for(ProductCartModel productModel:cart) {
				
					//Lo busco por el id que guardo el productModel
				try {
					responseContainerDto = backofficeApi.retrieveProduct(productModel.getId());
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
				}
				
				//El producto encontrado por id
				ProductDTO product = (ProductDTO) responseContainerDto.getData();
				
				//Le seteo la cantidad
				product.setQty(productModel.getQty());
				
				//Lo agrego como detalle
				orderDetails.setProduct(product);
				orderDetailsList.add(orderDetails);
			
			}
			
			//Seteo los detalles a la orden
			order.setOrderDetails(orderDetailsList);
			
			try {
				responseContainerDto = storeApi.createOrder(order);
			} catch (HttpClientErrorException e) {
				try {
					responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
				} catch (Exception e1) {
					LOGGER.error("response error de-serialization error", e1);
				}
			}
			
		
		cart.clear();
		orderDetailsList.clear();
		
		return "redirect:/index";
	}
	
	
	@GetMapping("/orders")
	public String myOrders(HttpServletRequest request, HttpServletResponse response, 
			Model model,HttpSession session) {
	
		ResponseContainerResponseDTO responseContainerDto = null;
		
		//Traer todas las ordenes
		
		try {
			responseContainerDto = storeApi.retrieveAllOrders();
		} catch (HttpClientErrorException e) {
			try {
				responseContainerDto = mapper.readValue(e.getResponseBodyAsByteArray(), ResponseContainerResponseDTO.class);
			} catch (Exception e1) {
				LOGGER.error("response error de-serialization error", e1);
			}
		}
		
		if (responseContainerDto == null) {
			model.addAttribute("errorRetrievingOrders", "Error interno.");
		} else if (responseContainerDto.getErrors() != null && !responseContainerDto.getErrors().isEmpty()) {
			model.addAttribute("errorRetrievingOrders", responseContainerDto.getErrors().get(0).getDetail());
		} else {
			OrderListDTO orderListDTO = (OrderListDTO) responseContainerDto.getData();
			
			List<OrderDTO> orderList = orderListDTO.getItems();
			
			//Discriminar las ordenes por usuario.
			UserLoginModel userModel = (UserLoginModel) session.getAttribute("user");
			
			String email = userModel.getUsername();
			
			System.out.println(email);
			OrderListDTO orderListByUser=new OrderListDTO();
			
			for(OrderDTO order: orderList ) {
				if(order.getUser().getEmail().equals(email)) {
					orderListByUser.addItemsItem(order);
					LOGGER.info("OrderByUser ok", email);
				}
			}
			
			//Envio de ordenes del usuario a la vista.
			model.addAttribute("ordersByUser", orderListByUser);
		}
		
		model.addAttribute("userLoginModel", new UserLoginModel());
		checkUserSession(response, model, session);
		
		return "orders";
	}
	
	
	
}
