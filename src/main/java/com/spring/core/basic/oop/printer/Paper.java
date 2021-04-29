package com.spring.core.basic.oop.printer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter @Getter
@NoArgsConstructor
public class Paper {

    List<String> datas;

    public Paper(List<String> datas) {
        this.datas = datas;
    }
}
