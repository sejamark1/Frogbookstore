package com.example.frogbookstore.controller;


import com.example.frogbookstore.entity.Book;
import com.example.frogbookstore.service.BookService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.Thymeleaf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookstoreController {

    private final BookService bookService;
    public BookstoreController(BookService bookService) {
        this.bookService = bookService;
    }

//    @GetMapping("/")
//    public ModelAndView homePage() {
//        ModelAndView modelAndView = new ModelAndView("index.html");
//        modelAndView.addObject("firstName", "Sergey");
//        modelAndView.addObject("lastName", "Kargopolov");
//        System.out.println("implement");
//        return modelAndView;
//    }





    @GetMapping("/")
    public ModelAndView method(){
        ModelAndView indexPage = new ModelAndView("index.html");
        indexPage.addObject("bookDetail", bookService.get());


        for(Book book : bookService.get()) {
            System.out.println(book.getId());
        }

        return indexPage;
    }


    @PostMapping("/add-book")
    public String addBook(){
        bookService.addBook("IBS39933", "ahryr", "aka");
        return "addbook.html";
    }
//
//    @PostMapping("/add-book")
//    public ModelAndView addBook(){
//        ModelAndView indexPage = new ModelAndView("addbook.html");
//
//
//
//        return indexPage;
//    }







//    @RequestMapping("/")
//    public ModelAndView index(Model model){
//        ModelAndView modelAndView = new ModelAndView("index.html");
//        modelAndView.addObject("key", "Baeldung");
//        return modelAndView;
//    }







//
//    @RequestMapping("/")
//    public ModelAndView index (Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index.html");
//        model.addAttribute("message", "Baeldung");
//        return modelAndView;
//    }





//    @GetMapping("/")
//    public Iterable<Book> method(){
//        for(Book book : bookService.get()) {
//            System.out.println(book.getId());
//        }
//
//        return bookService.get();
//    }

//    @GetMapping("/add-newbook")
//    public String addNewBook(){
//        return "Hello";
//    }
//    @GetMapping("/update-book/{book_id}")
//    public String updateBook(@PathVariable String book_id){
//        return "updated data";
//    }
}
