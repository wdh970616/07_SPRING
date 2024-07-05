package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("bookDAO") // @Component의 세분화 어노테이션의 한 종류로, DAO 타입의 객체에 상응한다.
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123456, "자바의 정석", "남궁성", "도우출판", LocalDate.now()));
        bookList.put(2, new BookDTO(2, 654321, "칭찬은 고래도 춤추게한다", "고래", "대서양출판", LocalDate.now()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectBookBySequence(int sequence) {
        return bookList.get(sequence);
    }
}
