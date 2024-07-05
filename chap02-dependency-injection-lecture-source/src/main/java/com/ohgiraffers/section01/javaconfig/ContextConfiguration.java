package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("account")
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-234-56780");
    }

    @Bean("member")
    public MemberDTO memberGenerator() {
        // MemberDTO 생성자를 통해 Account를 생성하는 메소드를 호출하여 리턴값은 전달하여 bean을 조립할 수 있다.
        return new MemberDTO(1, "홍길동", "010-1234-5678", "hong123@gmail.com", accountGenerator());
    }
}
