package com.example.library.model;


public class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return isbn + "," + title + "," + author;
    }

    public static Book fromString(String data) {
        String[] parts = data.split(",");
        return new Book(parts[0], parts[1], parts[2]);
    }
}
