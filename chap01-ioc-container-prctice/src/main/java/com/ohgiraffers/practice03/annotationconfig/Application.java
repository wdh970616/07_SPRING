package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);
        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L, "하얀님을 조심하세요.", "얼른 집에 가고싶어요. 살려주세요. 빨간줄 싫어요. 하얀님 무서워요. 당근 흔들고싶어요.", "위성민")));
        System.out.println(boardDAO.selectBoard(3L));
    }
}
