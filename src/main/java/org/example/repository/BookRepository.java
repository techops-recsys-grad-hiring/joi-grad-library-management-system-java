package org.example.repository;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        books = new ArrayList<>();
        initializeBooks();
    }

    // Method to initialize sample book data
    private void initializeBooks() {
        books.add(new Book(1, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 1997, 10));
        books.add(new Book(2, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", 1998, 0));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", "Fiction", 1960, 8));
        books.add(new Book(4, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 1925, 6));
        books.add(new Book(5, "Pride and Prejudice", "Jane Austen", "Romance", 1813, 4));
        books.add(new Book(6, "The Catcher in the Rye", "J.D. Salinger", "Coming-of-age", 1951, 0));
    }

    // Method to get a books in system
    public List<Book> getBooks() {
        return books;
    }

    // Method to add a book in system
    public Book addBook(Book bookRequest) {
        if (Objects.isNull(bookRequest.getTitle()) || bookRequest.getTitle().isEmpty() || Objects.isNull(bookRequest.getAuthor()) || bookRequest.getAuthor().isEmpty() || Objects.isNull(bookRequest.getGenre()) || bookRequest.getGenre().isEmpty()) {
            throw new RuntimeException("Invalid data");
        }

        Optional<Book> existingBook = books.stream().filter(book -> book.getBookId() == bookRequest.getBookId()).findAny();
        if (existingBook.isPresent()) {
            throw new RuntimeException("Book already exist for bookId: " + bookRequest.getBookId());
        }

        books.add(bookRequest);
        return getBookByBookId(bookRequest.getBookId());
    }

    // Method to get book by bookId
    public Book getBookByBookId(int bookId) {
        return books.stream().filter(book -> book.getBookId() == bookId).findAny()
                .orElseThrow(() -> new RuntimeException("Book not found for bookId: " + bookId));
    }
}
