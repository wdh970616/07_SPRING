package com.ohgiraffers.section03.properties;

import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;

@Configuration
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {

    @Value("${bread.carpbread.name}")
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, LocalDate.now());
    }
}
