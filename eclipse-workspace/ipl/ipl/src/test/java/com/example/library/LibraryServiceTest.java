package com.example.library;

import com.example.library.model.Book;
import com.example.library.service.LibraryService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {
    @Test
    public void testAddAndRemoveBook() {
        LibraryService libraryService = new LibraryService();
        Book book = new Book("9999", "Test Book", "Test Author");
        libraryService.addBook(book);
        assertTrue(libraryService.viewAllBooks().stream().anyMatch(b -> b.getIsbn().equals("9999")));

        libraryService.removeBook("9999");
        assertFalse(libraryService.viewAllBooks().stream().anyMatch(b -> b.getIsbn().equals("9999")));
    }
}
