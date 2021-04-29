package com.spring.core.basic.quiz;

import com.spring.core.basic.config.ComputerConfig;
import com.spring.core.basic.hotel.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    @Test
    void computerTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComputerConfig.class);
        Computer computer = context.getBean(Computer.class);

        computer.info();

        Computer computer2 = context.getBean(Computer.class);
        Computer computer3 = context.getBean(Computer.class);

        System.out.println("computer2 = " + computer2);
        System.out.println("computer3 = " + computer3);


    }

}