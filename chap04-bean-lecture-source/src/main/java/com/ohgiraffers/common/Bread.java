package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class Bread extends Product {
    private LocalDate bakedDate;    // 제조일

    // 부모클래스까지 초기화하는 생성자
    public Bread(String name, int price, LocalDate bakedDate) {
        super(name, price); // 부모클래스의 생성자
        this.bakedDate = bakedDate;
    }
}
