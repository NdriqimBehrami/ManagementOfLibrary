package com.example.library.service;

import com.example.library.models.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAll();
    public Book findById(int theId);
    public void save(Book theBook);
    public void deleteById(int theId);
}
