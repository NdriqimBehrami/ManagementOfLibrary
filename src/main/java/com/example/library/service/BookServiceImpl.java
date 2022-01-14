package com.example.library.service;

import com.example.library.repositories.BookRepository;
import com.example.library.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository theBookRepository){
        bookRepository=theBookRepository;
    }
    @Override
    public List<Book> findAll() {
        return bookRepository.findAllByOrderByBookName();
    }

    @Override
    public Book findById(int theId) {
        Optional<Book> result = bookRepository.findById(theId);
        Book theBook = null;
        if(result.isPresent()){
            theBook= result.get();
        }
        else {
            //ska libra
            throw new RuntimeException("Ska liber me kete id"+theId);

        }
        return theBook;
    }

    @Override
    public void save(Book theBook) {
        bookRepository.save(theBook);

    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);

    }
}
