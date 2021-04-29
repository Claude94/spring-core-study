package com.spring.core.basic.quiz;

import ch.qos.logback.classic.spi.STEUtil;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Person {

    private String name;
    private int age;

    //1번 싱글톤 패턴을 적용하는 방법
    //단 하나의 생성자를 만들고 private으로 제한한다.

    private Person() {}
    // 2번 클래스 내부에서 단 하나의 겍체를 생성한다

    public static Person person = new Person();
    // 3번 미리 만들어준 단 하나의 객체를 공개된 메서드를 통해서 제공한다

    public static Person getInstance() {
        return person;
    }
}
