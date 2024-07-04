package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

//        MemberDTO member = new MemberDTO();
        // ID(이름)로 값 꺼내오기
        MemberDTO member = (MemberDTO) context.getBean("member");
        System.out.println("ID로 값 꺼내오기 : " + member);

        // 타입으로 값 꺼내오기
        // 타입으로 꺼내올때는 MemberDTO 타입으로 등록된 BEAN이 하나가 아닐수 있기 때문에 모호성 에러가 발생할 수 있다.
        MemberDTO member2 = context.getBean(MemberDTO.class);
        System.out.println("타입으로 값 꺼내오기 : " + member2);

        // ID(이름)와 타입으로 값 꺼내오기
        MemberDTO member3 = context.getBean("member", MemberDTO.class);
        System.out.println("둘다 사용하여 값 꺼내오기 : " + member3);
    }
}
