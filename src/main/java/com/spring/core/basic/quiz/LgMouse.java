package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component
public class LgMouse implements Mouse {

    @Override
    public void info() {
        System.out.println("엘지 마우스");
    }
}
