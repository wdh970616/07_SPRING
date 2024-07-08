package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName : " + beanName);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        // 첫번째 손님이 쇼핑카트를 꺼낸다.
        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);

        // 빵이랑 우유를 담는다.
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        // 담긴 내용 확인
        System.out.println("cart1에 담긴 상품 : " + cart1.getItems());

        // 두번째 손님이 쇼핑카트를 꺼낸다.
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);

        // 물을 담는다.
        cart2.addItem(water);

        // 담긴 내용 확인
        System.out.println("cart2에 담긴 상품 : " + cart2.getItems());

        System.out.println("cart1의 hashcode : " + cart1.hashCode());
        System.out.println("cart2의 hashcode : " + cart2.hashCode());
    }
}
