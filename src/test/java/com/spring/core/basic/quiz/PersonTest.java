package com.spring.core.basic.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest() {

        Person kim = Person.getInstance();
        Person park = Person.getInstance();

        System.out.println("park = " + park);
        System.out.println("kim = " + kim);
    }

}