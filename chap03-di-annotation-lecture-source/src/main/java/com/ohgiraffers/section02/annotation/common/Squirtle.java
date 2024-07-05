package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon {

    @Override
    public void attack() {
        System.out.println("🌊꼬부기의 물대포 발사");
    }
}
