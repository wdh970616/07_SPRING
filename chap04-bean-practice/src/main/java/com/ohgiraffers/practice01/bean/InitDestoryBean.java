package com.ohgiraffers.practice01.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class InitDestoryBean {

    @PostConstruct
    public void init() {
        System.out.println("init 작업이 실행되었습니다.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy 작업이 실행되었습니다.");
    }
}
