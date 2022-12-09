package com.example.frogbookstore.controller;

import com.example.frogbookstore.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreController {

    private final BookService bookService;

    public BookstoreController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/")
    public String method(){
        return "Hello";
    }

    @GetMapping("/add-newbook")
    public String addNewBook(){
        return "Hello";
    }
    @GetMapping("/update-book/{book_id}")
    public String updateBook(@PathVariable String book_id){
        return "updated data";
    }
}
