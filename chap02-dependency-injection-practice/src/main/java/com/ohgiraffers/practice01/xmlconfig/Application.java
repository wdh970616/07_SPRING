package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("com/ohgiraffers/practice01/xmlconfig/spring-context.xml");

        System.out.println(context.getBean("board", BoardDTO.class));
    }
}
