package example;

import org.example.model.Book;

public class BookTestData {

    public static Book getValidBookRequest(Integer bookId) {
        return new Book(bookId, "Time Machine", "H.G Wells", "Classic", 1925, 4);
    }

    public static Book getInValidBookRequest() {
        return new Book(5, "", null, "Classic", 1925, 4);
    }
}
