package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("member") // @Bean("이름")을 이용해서 ID를 메소드명과 다르게 지정해줄수 있다.
    public MemberDTO getMember() {
        System.out.println("getMember() 호출함...");
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
