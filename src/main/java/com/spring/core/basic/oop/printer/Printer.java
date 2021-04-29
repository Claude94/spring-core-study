package com.spring.core.basic.oop.printer;

import lombok.Getter;

public class Printer {
    @Getter
    private Paper paper;

    public Printer(Paper paper) {
        this.paper = paper;
    }
    //용지 출력 기능
    public void printPaper () {
        System.out.println("============내용 출력===========");
        for (String data : paper.getDatas()) {
            System.out.println("#" + data);
        }
    }
}
