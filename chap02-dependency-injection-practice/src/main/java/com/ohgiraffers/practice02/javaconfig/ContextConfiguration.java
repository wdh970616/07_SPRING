package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO member() {
        return new MemberDTO(1L, "성민");
    }

    @Bean
    public BoardDTO board() {
        return new BoardDTO(1L, "자바 컨픽", "자바 컨픽으로 빈 객체 지정", member());
    }
}
