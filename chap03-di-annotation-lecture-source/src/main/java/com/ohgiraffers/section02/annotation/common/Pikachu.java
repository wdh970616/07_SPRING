package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * @AutoWired로 동일한 타입의 여러 bean을 찾게 되는 경우 자동으로 연결될 우선시 할 타입으로 설정
 * 동일한 타입의 클래스 중 하나만 Primary 타입으로 지정할 수 있다.
 */
@Primary
@Component
public class Pikachu implements Pokemon {

    @Override
    public void attack() {
        System.out.println("💥피카츄의 백만볼트");
    }
}
