package com.safatech.java8.dao;

import com.safatech.java8.model.Customer;
import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {

    public static List<Customer> getAllCustomer(){

        return Stream.of(
                new Customer(101, "Sadddam", "Sadddam@gmail.com", Arrays.asList("1236547890","978654131")),
                new Customer(101, "Asif", "Asif@gmail.com", Arrays.asList("1236548520","978654564")),
                new Customer(101, "Shahbaz", "Shahbaz@gmail.com", Arrays.asList("1236547852","978654131")),
                new Customer(101, "Aquib", "Aquib@gmail.com", Arrays.asList("1236547152","978654131"))
        ).collect(Collectors.toList());
    }
}
