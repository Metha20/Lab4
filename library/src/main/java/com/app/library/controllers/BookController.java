package com.app.library.controllers;

import com.app.library.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // GET /api/books
    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    // POST /api/books
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}
