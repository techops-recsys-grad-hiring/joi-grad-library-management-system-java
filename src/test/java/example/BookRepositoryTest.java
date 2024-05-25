package example;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static example.BookTestData.getInValidBookRequest;
import static example.BookTestData.getValidBookRequest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryTest {

    @Test
    void shouldReturnAll6Books() {
        BookRepository bookRepository = new BookRepository();

        List<Book> books = bookRepository.books;
        books.remove(1);

        assertThat(books.size()).isEqualTo(6);
    }
}