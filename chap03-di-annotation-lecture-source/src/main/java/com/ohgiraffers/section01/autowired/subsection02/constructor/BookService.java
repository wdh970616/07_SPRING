package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    // BookDAO타입의 Bean객체를 Constructor를 사용하여 자동으로 주입해준다.
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    /*
     * Spring 4.3버젼 이후로는 생성자가 한개뿐이라면 @AutoWired 어노테이션을 생략해도 자동으로 생성자 주입이 동작한다.
     * 따라서 생성자가 1개 이상일 경우에는 명시적으로 작성을 해주어야한다.
     */

    /*
     * <생성자 주입 방식의 장점>
     * - 객체가 생성될 때 모든 의존성이 주입되므로 의존성을 보장할 수 있다.
     * - 객체의 불변성을 보장할 수 있다. (필드에 final 키워드가 사용가능하고 객체 생성 이후 의존성을 변경할 수 없기에 안정성 보장)
     * - 코드 가독성이 좋다. (해당 객체가 어떤 의존성을 가지고있는지 명확히 알 수 있다.)
     * - DI 컨테이너의 결합도가 낮기 때문에 테스트하기 좋다. (스프링 컨테이너없이 테스트를 할 수 있다.)
     */

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectBookBySequence(sequence);
    }
}
