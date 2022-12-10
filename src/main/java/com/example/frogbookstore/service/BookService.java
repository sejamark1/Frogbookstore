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

//    public Book addBook(String isbn, String bookName, String authorName) {

    public Book addBook(Book newBook) {
        bookRepository.save(newBook);
        return newBook;
    }

    /*READ: Get the data from the database*/
    public Iterable<Book> get(){
        return bookRepository.findAll();

    }
    /*DELETE: Delete data from the database*/
    public void deleteBook(Integer id){
        System.out.println("Called ");
        bookRepository.deleteById(id);
    }
}
