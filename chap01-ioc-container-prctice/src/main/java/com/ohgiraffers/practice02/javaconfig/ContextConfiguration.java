package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("board")
    public BoardDTO getBoard() {
        return new BoardDTO(1L, "스프링 잘하고싶어요!", "스프링 얼른 마스터해서 초고수 개발자가 되고싶어요. 제가 과연 할 수 있을까요?", "위성민");
    }
}
