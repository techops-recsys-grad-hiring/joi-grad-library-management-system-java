package org.example;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    // Method to search for books by title, author, or genre
    public List<Book> searchBooks(String keyword) {

        return new ArrayList<>();
    }

    // Method to display matching books along with their availability status
    public void displayMatchingBooks(List<Book> matchingBooks) {

    }

    public LibraryManagementSystem() {
        this.bookRepository = new BookRepository();
        this.userRepository = new UserRepository();
    }


    // Main method to test the functionality
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        // Search for books by title, author, or genre
        String keyword = "Harry Potter";
        List<Book> matchingBooks = libraryManagementSystem.searchBooks(keyword);
        libraryManagementSystem.displayMatchingBooks(matchingBooks);
    }
}