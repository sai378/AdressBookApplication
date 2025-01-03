package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.util.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    public void addBook(Book book) {
        List<String> books = FileHandler.readFromFile();
        books.add(book.toString());
        FileHandler.writeToFile(books);
    }

    public List<Book> viewAllBooks() {
        List<String> lines = FileHandler.readFromFile();
        List<Book> books = new ArrayList<>();
        for (String line : lines) {
            books.add(Book.fromString(line));
        }
        return books;
    }

    public boolean removeBook(String isbn) {
        List<String> lines = FileHandler.readFromFile();
        boolean removed = lines.removeIf(line -> line.startsWith(isbn + ","));
        if (removed) {
            FileHandler.writeToFile(lines);
        }
        return removed;
    }
}
