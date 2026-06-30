package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public BookService() {
        System.out.println("BookService Bean Created");
    }

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void display() {
        System.out.println("BookService is working...");
        repository.display();
    }
}