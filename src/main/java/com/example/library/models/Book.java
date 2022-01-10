package com.example.library.models;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idBook;
    @Column(name = "Book_Name")
    private String bookName;
    @Column(name = "Edition")
    private String edition;
    @Column(name = "Author")
    private String author;
    @Column(name = "Pages")
    private int pages;


    public Book() {

    }

    public Book(int idBook, String bookName, String edition, String author, int pages) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.edition = edition;
        this.author = author;
        this.pages = pages;

    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String contents) {
        this.author = contents;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", bookName='" + bookName + '\'' +
                ", edition='" + edition + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +

                '}';
    }
}

