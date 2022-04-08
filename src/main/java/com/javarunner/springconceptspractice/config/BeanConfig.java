package com.javarunner.springconceptspractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    TestBean testBeanMethod(){
        return new TestBean();
    }
}
