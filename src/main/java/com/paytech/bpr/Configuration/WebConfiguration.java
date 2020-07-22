package com.paytech.bpr.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//        registry.addResourceHandler("/js/**")
//                .addResourceLocations("classpath:/static/js/");
//        registry.addResourceHandler("/css/**")
//                .addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

    }

}
