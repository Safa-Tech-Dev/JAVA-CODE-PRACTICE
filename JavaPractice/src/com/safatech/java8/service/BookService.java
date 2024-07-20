package com.safatech.java8.service;

import com.safatech.java8.dao.BookDao;
import com.safatech.java8.model.Book;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSortedOrder(){
        List<Book> books = new BookDao().getBooks();
        Collections.sort(books,(o1, o2) -> o2.getName().compareTo(o1.getName()));
        return books;

    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSortedOrder());
    }
}
/*class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}*/
