package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component
public class LgMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("엘지 모니터");
    }
}
