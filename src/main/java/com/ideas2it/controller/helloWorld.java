package com.ideas2it.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class helloWorld {
    public static void main(String[] args) {
		SpringApplication.run(helloWorld.class, args);
	}
    
    @Bean
    public ViewResolver getViewResolver() {
    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    	resolver.setPrefix("/WEB-INF/");
    	resolver.setSuffix(".jsp");
		return resolver;	
    }
}
