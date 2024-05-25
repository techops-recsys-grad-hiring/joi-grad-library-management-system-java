package org.example.repository;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public final List<Book> books;

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
}
