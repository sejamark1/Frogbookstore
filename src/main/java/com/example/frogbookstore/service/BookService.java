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

    public Book addBook(String isbn, String bookName, String authorName) {
        System.out.println("Called");
        Book newBook = new Book("IBS39933", "ahryr", "aka");
        bookRepository.save(newBook);
        return newBook;
    }

    public Iterable<Book> get(){
        return bookRepository.findAll();

    }

    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }
}
