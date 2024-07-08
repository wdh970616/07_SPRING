package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @PostConstruct  // Owner 객체가 bean에 등록될 때 동작
    public void openShop() {
        System.out.println("사장님이 가게문을 열었습니다! 이제부터 쇼핑을 하실 수 있습니다.");
    }

    @PreDestroy // Owner 객체가 beanFactory에서 삭제될 때 동작
    public void closeShop() {
        System.out.println("사장님이 가게문을 닫았습니다. 이제 귀가할 시간입니다!");
    }
}
