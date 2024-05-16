package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BooksDatabase {

    private List<Book> books;

    public BooksDatabase() {
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
    public Book addBook(Integer bookId, String title, String author, String genre, Integer publicationYear, Integer availability) {
        if (Objects.isNull(bookId) || Objects.isNull(title) || title.isEmpty() || Objects.isNull(author) || author.isEmpty()
                || Objects.isNull(genre) || genre.isEmpty() || Objects.isNull(publicationYear) || Objects.isNull(availability)) {
            throw new RuntimeException("Invalid data");
        }

        Optional<Book> existingBook = books.stream().filter(book -> book.getBookId() == bookId).findAny();
        if(existingBook.isPresent()){
            throw new RuntimeException("Book already exist for bookId: " + bookId);
        }

        books.add(new Book(bookId, title, author, genre, publicationYear, availability));
        return getBookByBookId(bookId);
    }

    // Method to get book by bookId
    public Book getBookByBookId(int bookId) {
        return books.stream().filter(book -> book.getBookId() == bookId).findAny()
                .orElseThrow(() -> new RuntimeException("Book not found for bookId: " + bookId));
    }
}
