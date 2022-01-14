package com.example.library.controllers;

import com.example.library.models.Book;
import com.example.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private BookService bookService;
    public HomeController(BookService theBookService) {
        bookService = theBookService;
    }


    @GetMapping("/home")
    public String index() {
        return "books/index";
    }


    @RequestMapping("list-books")
    public String listBooks(Model theModel) {

        List<Book> theBooks = bookService.findAll();
        //add to the spring model
        theModel.addAttribute("books", theBooks);
        return "books/list-books";
    }





}
