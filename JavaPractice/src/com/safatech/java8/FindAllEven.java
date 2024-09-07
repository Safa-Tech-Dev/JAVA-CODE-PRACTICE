package com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
     1. Given a list of integers,
     find out all the even numbers that exist in the list using Stream functions
 */
public class FindAllEven {

    public static void main(String[] args) {

        Integer[] arr = {1,1,3,6,0,7,-8,-1,-3};
        List<Integer> numList = Arrays.asList(arr);
        List<Integer> evenList = numList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        numList.stream().filter(i -> i % 2 == 0).forEach( x -> System.out.println(x));
    }
}
