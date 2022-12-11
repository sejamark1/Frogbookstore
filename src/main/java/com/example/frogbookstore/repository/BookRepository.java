package com.example.frogbookstore.repository;

import com.example.frogbookstore.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository  extends CrudRepository<Book, Integer> {

}
