package com.tienda.web.tiendacarpinteria.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tienda.web.tiendacarpinteria.controller.OrderController;
import com.tienda.web.tiendacarpinteria.controller.ProductController;
import com.tienda.web.tiendacarpinteria.controller.TokenController;
import com.tienda.web.tiendacarpinteria.controller.UserController;
import com.tienda.web.tiendacarpinteria.db.repository.CategoryRepository;
import com.tienda.web.tiendacarpinteria.db.repository.OrderDetailsRepository;
import com.tienda.web.tiendacarpinteria.db.repository.OrderRepository;
import com.tienda.web.tiendacarpinteria.db.repository.ProductRepository;
import com.tienda.web.tiendacarpinteria.db.repository.UserRepository;
import com.tienda.web.tiendacarpinteria.service.CategoryAdministrationService;
import com.tienda.web.tiendacarpinteria.service.CategoryAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.JWTService;
import com.tienda.web.tiendacarpinteria.service.JWTServiceImpl;
import com.tienda.web.tiendacarpinteria.service.OrderAdministrationService;
import com.tienda.web.tiendacarpinteria.service.OrderAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.OrderDetailsAdministrationService;
import com.tienda.web.tiendacarpinteria.service.OrderDetailsAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.ProductAdministrationService;
import com.tienda.web.tiendacarpinteria.service.ProductAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationService;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.UserAuthenticationService;
import com.tienda.web.tiendacarpinteria.service.UserAuthenticationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.UserDetailService;
import com.tienda.web.tiendacarpinteria.service.UserDetailServiceImpl;
import com.tienda.web.tiendacarpinteria.service.UserInitializationService;
import com.tienda.web.tiendacarpinteria.service.UserInitializationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.CategoryMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.CategoryMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderDetailsMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderDetailsMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.ProductMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.ProductMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.UserMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.UserMapperImpl;
import com.tienda.web.tiendacarpinteria.service.utils.JwtTokenUtil;

@Configuration
public class AppConfig {

	@Bean
	public UserMapper getUserMapper(PasswordEncoder encoder) {
		return new UserMapperImpl(encoder);
	}
	
	@Bean
	public ProductMapper getProductMapper(CategoryMapper categoryMapper) {
		return new ProductMapperImpl(categoryMapper);
	}
	
	@Bean
	public CategoryMapper getCategoryMapper(CategoryRepository categoryRepository) {
		return new CategoryMapperImpl(categoryRepository);
	}
	
	@Bean
	public OrderMapper getOrderMapper(UserMapper userMapper, OrderDetailsMapper orderDetailsMapper) {
		return new OrderMapperImpl(userMapper, orderDetailsMapper);
	}
	
	@Bean
	public OrderDetailsMapper getOrderDetailsMapper(UserMapper userMapper, ProductMapper productMapper) {
		return new OrderDetailsMapperImpl (userMapper, productMapper);
	}
	
	@Bean
	public UserController getUserController(UserAdministrationService userAdministrationService) {
		return new UserController(userAdministrationService);
	}
	
	@Bean
	public TokenController getTokenController(UserAuthenticationService userAuthenticationService, 
			JWTService jwtService) {
		return new TokenController(userAuthenticationService, jwtService);
	}
	
	@Bean
	public ProductController getProductController(CategoryAdministrationService categoryAdministrationService,
			ProductAdministrationService productAdministrationService) {
		return new ProductController(categoryAdministrationService, productAdministrationService);
	}
	
	@Bean
	public OrderController getOrderController(OrderAdministrationService orderAdministrationService) {
		return new OrderController(orderAdministrationService);
	}
	
	@Bean
	public UserAdministrationService getUserAdministrationService(UserMapper userMapper, 
			UserRepository userRepository) {
		return new UserAdministrationServiceImpl(userMapper, userRepository);
	}

	@Bean
	public JWTService getJwtService(UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil) {
		return new JWTServiceImpl(userDetailsService, jwtTokenUtil);
	}
	
	
	@Bean
	public UserAuthenticationService getUserAuthenticationService(PasswordEncoder passwordEncoder,
			JWTService jwtService, UserDetailService userDetailService) {
		return new UserAuthenticationServiceImpl(passwordEncoder, jwtService, userDetailService);
	}
	
	//Se cambio el UserDetailsService, por una interface similar que busca por email
	@Bean
	public UserDetailService getUserDetailService(UserRepository userRepository) {
		return new UserDetailServiceImpl(userRepository);
	}
	
	
	@Bean
	public CategoryAdministrationService getCategoryAdministrationService(CategoryRepository categoryRepository,
			CategoryMapper categoryMapper) {
		return new CategoryAdministrationServiceImpl(categoryMapper, categoryRepository);
	}
	
	@Bean
	public ProductAdministrationService getProductAdministrationService(ProductMapper productMapper, 
			ProductRepository productRepository) {
		return new ProductAdministrationServiceImpl(productMapper, productRepository);
	}
	
	@Bean
	public UserInitializationService getUserInitializationService(PasswordEncoder passwordEncoder, 
			UserRepository userRepository) {
		return new UserInitializationServiceImpl(passwordEncoder, userRepository);
	}
	
	@Bean
	public OrderAdministrationService getOrderAdministrationService(OrderRepository theOrderRepository, OrderMapper theOrderMapper) {
		return new OrderAdministrationServiceImpl(theOrderRepository, theOrderMapper);
	}
	
	@Bean
	public OrderDetailsAdministrationService getOrderDetailsAdministrationService(OrderDetailsRepository theOrderDetailsRepository,
			OrderDetailsMapper theOrderDetailsMapper) {
		return new OrderDetailsAdministrationServiceImpl(theOrderDetailsRepository,theOrderDetailsMapper);
	}
	
	
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}