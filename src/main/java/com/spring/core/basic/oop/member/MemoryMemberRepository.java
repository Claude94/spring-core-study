package com.spring.core.basic.oop.member;

import java.util.HashMap;
import java.util.Map;
//회원 정보를 메모리에 저잘할 역할
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}
