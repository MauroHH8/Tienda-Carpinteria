package com.tienda.web.tiendacarpinteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.tienda.web.tiendacarpinteria.conf.AppConfig;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.tienda.web.tiendacarpinteria.controller","com.tienda.web.tiendacarpinteria"}) 
@Import({AppConfig.class})
public class TiendaCarpinteriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaCarpinteriaApplication.class, args);
	}
	
	public TiendaCarpinteriaApplication(){}

}
