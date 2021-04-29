package com.spring.core.basic.oop.config;

import com.spring.core.basic.oop.discount.DiscountPolicy;
import com.spring.core.basic.oop.discount.FixDiscountPolicy;
import com.spring.core.basic.oop.member.MemberRepository;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import com.spring.core.basic.oop.member.MemoryMemberRepository;
import com.spring.core.basic.oop.order.Order;
import com.spring.core.basic.oop.order.OrderService;
import com.spring.core.basic.oop.order.OrderServiceImpl;

//객체를 생성하고 핋요에 맞게 주입하는 클래스
public class AppConfig {

    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    public OrderServiceImpl orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
