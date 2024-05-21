package example;

import org.example.model.Book;
import org.example.LibraryManagementSystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryManagementSystemTest {

    private static LibraryManagementSystem libraryManagementSystem;

    @BeforeAll
    static void setUp() {
        libraryManagementSystem = new LibraryManagementSystem();
    }

    @Test
    void shouldReturnBooksIfFoundOnSearchByTitle() {

        List<Book> books = libraryManagementSystem.searchBooks("Harry Potter");

        // add assert statements
    }
}
