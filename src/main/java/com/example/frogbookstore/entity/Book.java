package com.example.frogbookstore.entity;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("BOOKSTORE")
public class Book {
    @Id
    private Integer id;
    @NotEmpty
    private String isbn_no;
    @NotEmpty
    private String book_name;
    @NotEmpty
    private String author_name;


    public Book(String isbn_no, String book_name, String author_name) {
        this.isbn_no = isbn_no;
        this.book_name = book_name;
        this.author_name = author_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn_no() {
        return isbn_no;
    }

    public void setIsbn_no(String isbn_no) {
        this.isbn_no = isbn_no;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}
