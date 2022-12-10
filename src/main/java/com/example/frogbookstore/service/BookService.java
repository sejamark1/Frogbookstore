package com.example.frogbookstore.service;

import com.example.frogbookstore.entity.Book;
import com.example.frogbookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        bookRepository.deleteById(id);
    }

    /*Find a single record from the database based on given ID*/
    public Iterable<Book> findARecord(Iterable<Integer> id){
        return bookRepository.findAllById(id);
    }

    public Optional<Book> find(Integer id){
        return bookRepository.findById(id);
    }
    /*UPDATE: Updates the new data*/
    public void updateBook(Integer id, String isbn, String bookname, String authorname){
        Optional<Book> books = bookRepository.findById(id);
        if(books.isPresent()) {
            Book updateBook = books.get();
            updateBook.setIsbn_no(isbn);
            updateBook.setBook_name(bookname);
            updateBook.setAuthor_name(authorname);
            updateBook = bookRepository.save(updateBook);
        }else {
            System.out.println("Not found!");
        }



    }
}
