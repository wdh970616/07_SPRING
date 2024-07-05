package com.ohgiraffers.section01.autowired.common;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookDTO {

    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private LocalDate createDate;
}
