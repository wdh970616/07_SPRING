package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();
        System.out.println("\n================= 전체 조회 =================");
        for (BookDTO book : books) {
            System.out.println(book);
        }

        System.out.println("\n================= 단일 조회 =================");
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
