package com.javarunner.springconceptspractice;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

    public EagerLoadingBean(){
        System.out.println("EagerLoadingBean created.. ! ");

    }
}
