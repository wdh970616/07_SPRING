package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

    @Override
    public void attack() {
        System.out.println("🔥파이리의 불꽃 공격");
    }
}
