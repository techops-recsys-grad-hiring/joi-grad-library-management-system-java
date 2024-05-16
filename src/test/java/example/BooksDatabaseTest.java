package example;

import org.example.Book;
import org.example.BooksDatabase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksDatabaseTest {

    @Test
    void shouldBeAbleToAddBook() {
        BooksDatabase booksDatabase = new BooksDatabase();

        Book book = booksDatabase.addBook(7, "Time Machine", "H.G Wells", "Classic", 1925, 4);

        assertEquals(7, book.getBookId());
        assertEquals("Time Machine", book.getTitle());
    }

    @Test
    void shouldThrowExceptionIfInvalidData() {
        BooksDatabase booksDatabase = new BooksDatabase();

        assertThatThrownBy(() -> booksDatabase.addBook(5, "", null, "Classic", 1925, 4)).isInstanceOf(
                RuntimeException.class).hasMessage("Invalid data");
    }

    @Test
    void shouldThrowExceptionIfBookAlreadyPresent() {
        BooksDatabase booksDatabase = new BooksDatabase();

        assertThatThrownBy(() -> booksDatabase.addBook(5, "Time Machine", "H.G Wells", "Classic", 1925, 4)).isInstanceOf(
                RuntimeException.class).hasMessage("Book already exist for bookId: 5");
    }

    @Test
    void shouldBeAbleToFetchBookIfPresent() {
        BooksDatabase booksDatabase = new BooksDatabase();

        Book book = booksDatabase.getBookByBookId(5);

        assertEquals(5, book.getBookId());
        assertEquals("Pride and Prejudice", book.getTitle());
    }

    @Test
    void shouldThrowExceptionIfBookNotFound() {
        BooksDatabase booksDatabase = new BooksDatabase();

        assertThatThrownBy(() -> booksDatabase.getBookByBookId(8)).isInstanceOf(
                RuntimeException.class).hasMessage("Book not found for bookId: 8");
    }

}
