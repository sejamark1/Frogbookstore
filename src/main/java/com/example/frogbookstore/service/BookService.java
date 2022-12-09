package com.example.frogbookstore.service;

import com.example.frogbookstore.entity.Book;
import com.example.frogbookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

// This is where all the info dealing with the database goes.
@Service
public class BookService {
    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> get(){
        return bookRepository.findAll();

    }
}
