package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMembers() {
        System.out.println("\n전체조회 : selectMembers() 메소드 실행");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMemberById(Long id) {
        System.out.println("\n단일조회 : selectMemberById() 메소드 실행");
        return memberDAO.selectMemberById(id);
    }
}
