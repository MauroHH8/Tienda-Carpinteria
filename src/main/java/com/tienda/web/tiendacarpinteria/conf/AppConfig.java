package com.tienda.web.tiendacarpinteria.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.tienda.web.tiendacarpinteria.controller.ProductController;
import com.tienda.web.tiendacarpinteria.controller.UserController;
import com.tienda.web.tiendacarpinteria.db.repository.CategoryRepository;
import com.tienda.web.tiendacarpinteria.db.repository.ProductRepository;
import com.tienda.web.tiendacarpinteria.db.repository.UserRepository;
import com.tienda.web.tiendacarpinteria.service.CategoryAdministrationService;
import com.tienda.web.tiendacarpinteria.service.CategoryAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.ProductAdministrationService;
import com.tienda.web.tiendacarpinteria.service.ProductAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationService;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.CategoryMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.CategoryMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.ProductMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.ProductMapperImpl;
import com.tienda.web.tiendacarpinteria.service.mapper.UserMapper;
import com.tienda.web.tiendacarpinteria.service.mapper.UserMapperImpl;

@Configuration
public class AppConfig {

	@Bean
	public UserAdministrationService getUserAdministrationService(UserMapper userMapper, 
			UserRepository userRepository) {
		return new UserAdministrationServiceImpl(userMapper, userRepository);
	}

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
	public UserController getUserController(UserAdministrationService userAdministrationService) {
		return new UserController(userAdministrationService);
	}
	
	
	@Bean
	public ProductController getProductController(CategoryAdministrationService categoryAdministrationService,
			ProductAdministrationService productAdministrationService) {
		return new ProductController(categoryAdministrationService, productAdministrationService);
	}

	
	@Bean
	public CategoryAdministrationService getCategoryAdministrationService(CategoryMapper categoryMapper, 
			CategoryRepository categoryRepository) {
		return new CategoryAdministrationServiceImpl();
	}
	
	@Bean
	public ProductAdministrationService getProductAdministrationService(ProductMapper productMapper, 
			ProductRepository productRepository) {
		return new ProductAdministrationServiceImpl(productMapper, productRepository);
	}
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.httpBasic().disable();
        return http.build();
    }
}