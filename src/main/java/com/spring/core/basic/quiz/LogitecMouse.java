package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component
public class LogitecMouse implements Mouse {
    @Override
    public void info() {
        System.out.println("f로지텍 마우스");
    }
}
