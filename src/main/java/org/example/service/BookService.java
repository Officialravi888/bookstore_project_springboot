package org.example.service;

import org.example.entity.Book;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookService {
    private static Map<Integer, Book> books = new HashMap<>();
    private static int nextId = 1;

    public static List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public static Book getBook(int id) {
        return books.get(id);
    }

    public static Book addBook(Book book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    public static Book updateBook(int id, Book book) {
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public static void deleteBook(int id) {
        books.remove(id);
    }
}
