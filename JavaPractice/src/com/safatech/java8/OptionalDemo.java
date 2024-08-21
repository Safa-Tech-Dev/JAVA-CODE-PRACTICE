package com.safatech.java8;

import com.safatech.java8.dao.CustomerDao;
import com.safatech.java8.model.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email) throws Exception {

        List<Customer> customers = CustomerDao.getAllCustomer();
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow( () -> new Exception(" No such customer is present with this email id " + email));
    }

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(101, "saddam", "abc@gmail.com", Arrays.asList("778896120","652310232658"));

        // empty() ->> if you'r sure that your date is empty
        // of() ->> if you'r sure that your data will never be null
        // ofNullable ->> if you'r not sure, your data may or may not be null, empty  ofNullable = of() + empty()

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

       //Optional<String> optionalOf = Optional.of(customer.getName());
        //System.out.println(optionalOf);

        Optional<String> optionalOfNullable = customer.getName();
       //  we should not directly call the get() method , it will throw some exception
        //NoSuchElementException: No value present
        //we should go for isPresent() method
        if(optionalOfNullable.isPresent()){
            System.out.println(optionalOfNullable.get());
        }

        //if your data is  null and you want to print some default value
        System.out.println(optionalOfNullable.orElse("defualt"));

        //if you want to throw some custom exception
       // System.out.println(optionalOfNullable.orElseThrow(() -> new IllegalArgumentException("Name not found")));

        // If you want to perform some action on
        System.out.println(optionalOfNullable.map(String::toUpperCase).orElseGet(() -> "default"));

        getCustomerByEmailId("pqr");
    }
}
