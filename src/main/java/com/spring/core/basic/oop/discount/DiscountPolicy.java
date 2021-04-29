package com.spring.core.basic.oop.discount;

import com.spring.core.basic.oop.member.Member;

public interface DiscountPolicy {
    //할인정책별 할인액 계산 기능

    int discount(Member member, int itemPrice);
}
