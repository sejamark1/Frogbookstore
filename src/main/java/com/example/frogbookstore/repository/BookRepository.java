package com.example.frogbookstore.repository;

import com.example.frogbookstore.entity.Book;
import org.springframework.data.repository.CrudRepository;
// Allow you to manupulate the database.
public interface BookRepository  extends CrudRepository<Book, Integer> {

}
