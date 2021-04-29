package com.spring.core.basic.oop.member;

public interface MemberRepository {

    //회원 가입 기능
    void save(Member member);

    //회원 조회 기능
    Member findById(Long memberId);
}
