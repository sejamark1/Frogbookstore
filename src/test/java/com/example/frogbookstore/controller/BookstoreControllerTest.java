package com.example.frogbookstore.controller;

import com.example.frogbookstore.entity.Book;
import com.example.frogbookstore.repository.BookRepository;
import com.example.frogbookstore.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.thymeleaf.context.IContext;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookstoreControllerTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookstoreController bookstoreController;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookService bookService;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookRepository bookRepository;



    @Test
    void addBook() {
        Book testBook = new Book("test101", "testbook", "testname");
        bookstoreController.addBookToDataBase(testBook);
        Optional<Book> foundData = bookRepository.findById(testBook.getId());
        assertEquals(testBook, foundData);

    }
    @Test
    void deleteRecord() throws Exception{
        Book testBook = new Book("test101", "testbook", "testname");
        bookstoreController.addBookToDataBase(testBook);
        bookRepository.deleteById(testBook.getId());
        Optional<Book> foundData = bookRepository.findById(testBook.getId());
        assertEquals(null, foundData);
    }


    @Test
    void updateData() {
        Book testBook = new Book("test101", "testbook", "testname");
        bookstoreController.addBookToDataBase(testBook);
        Book updateBook = new Book("updatetest101", "updatetestbook", "updatetestname");
        bookService.updateBook(testBook.getId(), updateBook.getIsbn_no(), updateBook.getBook_name(), updateBook.getAuthor_name());
        Optional<Book> foundData = bookRepository.findById(testBook.getId());
        assertEquals(foundData, updateBook);
    }
}