package com.ohgiraffers.section03.properties;

import com.ohgiraffers.common.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Product.class);
        System.out.println("carpBread = " + carpBread);
    }
}
