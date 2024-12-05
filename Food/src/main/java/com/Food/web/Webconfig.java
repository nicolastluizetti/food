package com.Food.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//implementar 	a interface
@Configuration
public class Webconfig implements WebMvcConfigurer {

//	sobrescrever o metodo add corsmappings
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://www.exemplo.local:8000")
		.allowedMethods("*")
		.maxAge(30);
	}
}
