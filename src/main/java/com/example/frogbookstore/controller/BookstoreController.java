package com.example.frogbookstore.controller;


import com.example.frogbookstore.entity.Book;
import com.example.frogbookstore.service.BookService;
import com.fasterxml.jackson.databind.JsonSerializer;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.Thymeleaf;

import java.util.*;

@RestController
public class BookstoreController {

    private final BookService bookService;
    private Integer editId;
    public BookstoreController(BookService bookService) {
        this.bookService = bookService;
    }

    private ModelAndView redirectPage(String redirectTo, ModelMap model){
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/" + redirectTo, model);
    }

    /* READ: Fetch all the data from the database and pass it into the index.html file* */
    @GetMapping({"/listview", "/"})
    public ModelAndView method(){
        ModelAndView indexPage = new ModelAndView("index.html");
        indexPage.addObject("bookDetail", bookService.get());
//        for(Book book : bookService.get()) {
//            System.out.println(book.getId());
//        }

        return indexPage;
    }

    /* DELETE: Delete the book record on button press* */
    @GetMapping("/deleteRecord")
    public ModelAndView deleteRecord(@RequestParam Integer id, ModelMap model) {
        bookService.deleteBook(id);
        return redirectPage("listview", model);
    }

    /*CREATE: Create new entity for book*/
    @PostMapping("/addBook")
    public ModelAndView addBook(@RequestParam String isbn, @RequestParam String bookname, @RequestParam String authorname, ModelMap model){
        //Validation, for empty input.
        Book newBook = new Book(isbn, bookname, authorname);
        bookService.addBook(newBook);
        return redirectPage("listview", model);
    }



    /* When edit is pressed, it takes the data and pass it into the form */
    @GetMapping("/passRecordToEditForm")
    public ModelAndView passRecordToEditForm(@RequestParam String id, @RequestParam String isbn, @RequestParam String bookname, @RequestParam String authorname, ModelMap model) {
        System.out.println(id);
        ModelAndView indexPage = new ModelAndView("index.html");
        editId = Integer.parseInt(id);
        indexPage.addObject("edit", "yes");
        indexPage.addObject("editId", id);
        Book editBook = new Book(isbn, bookname,authorname);
        indexPage.addObject("editBook", editBook);
        return indexPage;
    }



    @PostMapping("/updateData")
    public ModelAndView updateData(@RequestParam String isbn, @RequestParam String bookname, @RequestParam String authorname, ModelMap model){
        System.out.println(editId);
        Book newBook = new Book(isbn, bookname, authorname);
        bookService.updateBook(editId, isbn, bookname, authorname);
        //bookService.addBook(newBook);
        editId = null;
        return redirectPage("listview", model);
    }

}
