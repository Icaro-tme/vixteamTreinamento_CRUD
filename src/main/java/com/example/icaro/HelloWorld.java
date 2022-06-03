package com.example.icaro;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HelloWorld implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController( "/hello").setViewName("forward:/hello.html");

        registry.addViewController( "/form").setViewName("forward:/form.html");
    }


}