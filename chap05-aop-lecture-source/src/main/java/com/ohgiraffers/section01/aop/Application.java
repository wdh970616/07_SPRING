package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        MemberService memberService = (MemberService) context.getBean("memberService");

        System.out.println("============== selectMembers ==============");
        System.out.println(memberService.selectMembers());
        System.out.println();

        System.out.println("============= selectMemberById =============");
        System.out.println(memberService.selectMemberById(1L));
    }
}
