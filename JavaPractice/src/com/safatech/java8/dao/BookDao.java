package com.safatech.java8.dao;

import com.safatech.java8.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "Core Java", 400));
        bookList.add(new Book(363, "Hibernate", 180));
        bookList.add(new Book(275, "Spring", 200));
        bookList.add(new Book(893, "WebService", 200));
        return bookList;
    }
}
