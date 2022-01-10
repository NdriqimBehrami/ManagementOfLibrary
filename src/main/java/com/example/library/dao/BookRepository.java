package com.example.library.dao;

import com.example.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {


    public List<Book> findAllByOrderByBookName();

}
