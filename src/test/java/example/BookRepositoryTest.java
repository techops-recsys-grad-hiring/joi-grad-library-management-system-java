package example;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.junit.jupiter.api.Test;

import static example.BookTestData.getInValidBookRequest;
import static example.BookTestData.getValidBookRequest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryTest {

    @Test
    void shouldBeAbleToAddBook() {
        BookRepository bookRepository = new BookRepository();

        Book book = bookRepository.addBook(getValidBookRequest(7));

        assertEquals(7, book.getBookId());
        assertEquals("Time Machine", book.getTitle());
    }

    @Test
    void shouldThrowExceptionIfInvalidData() {
        BookRepository bookRepository = new BookRepository();

        assertThatThrownBy(() -> bookRepository.addBook(getInValidBookRequest())).isInstanceOf(
                RuntimeException.class).hasMessage("Invalid data");
    }

    @Test
    void shouldThrowExceptionIfBookAlreadyPresent() {
        BookRepository bookRepository = new BookRepository();

        assertThatThrownBy(() -> bookRepository.addBook(getValidBookRequest(5))).isInstanceOf(
                RuntimeException.class).hasMessage("Book already exist for bookId: 5");
    }

    @Test
    void shouldBeAbleToFetchBookIfPresent() {
        BookRepository bookRepository = new BookRepository();

        Book book = bookRepository.getBookByBookId(5);

        assertEquals(5, book.getBookId());
        assertEquals("Pride and Prejudice", book.getTitle());
    }

    @Test
    void shouldThrowExceptionIfBookNotFound() {
        BookRepository bookRepository = new BookRepository();

        assertThatThrownBy(() -> bookRepository.getBookByBookId(8)).isInstanceOf(
                RuntimeException.class).hasMessage("Book not found for bookId: 8");
    }

}