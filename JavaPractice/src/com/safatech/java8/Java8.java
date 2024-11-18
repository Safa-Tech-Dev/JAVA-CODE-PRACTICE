package com.safatech.java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args) {

        List<Integer> myList3 = Arrays.asList(12,45,63,1,22,12,2,3);
        /*
        4.How to count each element/word from the String ArrayList in Java8?
         */
        System.out.println("********** count each element/word from the String ArrayList ************");
        List<String> names = Arrays.asList("AA","BB", "CC","AA");
        Map<String, Long> namesCounting = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCounting);

        /*
        6.Find First Non-Repeated Element from the String
         */
        /*System.out.println("*********Printing first Non-Repeated Element*********");
        String first_non_Repeated_Element = Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                                .entrySet().stream()
                        .filter(x -> x.getValue() == 1)
                                        .findFirst().get().getKey();
        System.out.println(first_non_Repeated_Element);*/

        /*
        7.Find First Repeated Element from the String
         */
       /* System.out.println("****************first Repeated Element******************");
        String firstRepeatedElement = Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                                .entrySet().stream()
                        .filter(x -> x.getValue() > 1)
                                .findFirst().get().getKey();
        System.out.println(firstRepeatedElement);*/

        /*
        8.Given the list of integers, find the first element of the list using Stream functions?
         */
        System.out.println("********** Find first Element of the list ************");

        // method -1
        Optional optional = myList3.stream().filter(i -> i > 12).findFirst();
        if(optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("No value present");
        }
        //method -2
        Optional<Integer> first = myList3.stream().findFirst();
        Integer i = first.get();
        System.out.println(i);
        //method - 3
        myList3.stream().findFirst().ifPresent(System.out::println);

        /*
        9. Given a list of integers, find the total number of elements present in the list using Stream functions?
         */
        System.out.println("******* total number of elements present in the list ***********");
        long count = myList3.stream().count();
        System.out.println(count);

        /*
           10. Given a list of integers,
             find the maximum value element present in it using Stream functions?
         */

        System.out.println("****** Max element in the list ************");
        Integer max = myList3.stream().max(Integer::compare).get();
        int[] array1 = {5,9,11,2,8,21,1};
        int n = Arrays.stream(array1).boxed().max(Comparator.naturalOrder()).get();
        int min = Arrays.stream(array1).boxed().min(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(min);

        // method - 2
        /*
        11.Write a Program to find the Maximum element in an array?
        */
        int[] arr2 = {12,19,20,88,00,9};
        System.out.println(Java8.findMaxElement(arr2));
        /*
        13.Write a program to print the count of each City in a List?
         */
        System.out.println(" ************ Printing the count of each City ***************");
          /*   bangalore = 1
        kochi -1
        chennai -  2
        trivandrum - 2
        Pune -3*/
        List<String> listOfCity = Arrays.asList("kochi", "Trivandrum", "Chennai",
                "Chennai", "Trivandrum", "Pune", "Pune", "Pune", "Bangalore");

        Map<String, Long> collectedCity = listOfCity.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectedCity);

        /*
        14. Given a list of integers, sort all the values present in it using Stream functions?
         */
        System.out.println("******** printing in ascending order ************");
        List<Integer> number = Arrays.asList(10,15,8,49,25,98,98,32,15);
        number.stream().sorted().forEach(System.out::println);
        /*
        15.Given a list of integers, sort all the values present in it in descending order using Stream functions?
         */
        System.out.println("******** printing in descending order ************");
        number.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        /*
        19.Given an integer array1d nums, return true if any value appears
        at least twice in the array1d, and return false if every element is distinct.
         */
        System.out.println(" ******* Printing true or false for duplicate element ********");
        int[] nums = {1,2,3,1};
        System.out.println(Java8.containsDuplicate(nums));

        /*
        20.Write a Java 8 program to concatenate two Streams?
         */
        System.out.println(" ******** Printing Concat Stream ********");
        List<String> l1 = Arrays.asList("Saddam", "Farheen");
        List<String> l2 = Arrays.asList("Safa", "Khan");
        Stream<String> concatStream = Stream.concat(l1.stream(),l2.stream());
        concatStream.forEach(j -> System.out.println(j + " "));

        /* 21.Java 8 program to perform cube on list elements and filter numbers greater than 50.*/
        System.out.println("********** Printing cube on list and no. > 50 *****");
//myList1.stream().map( k -> k * k * k).filter(m -> m > 50).forEach(System.out::println);

        /*
        22. Write a Java 8 program to sort an array1d and then convert the sorted array1d into Stream?
         */
        System.out.println(" ********** Printing sorted array1d and converted to stream ************");
        int[] ar = { 99, 55, 203, 99, 4, 91 };
        //Arrays.parallelSort(ar);
        Arrays.sort(ar);
        Arrays.stream(ar).forEach(System.out::println);

        /*
        23.How to use map to convert object into Uppercase in Java 8?
         */
        System.out.println("************ Printing String to Uppper Case ********");
        String[] name = {"saddam", "khan", "farheen", "Safa naaz"};
        List<String> nameList = Arrays.stream(name)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nameList);

        /*
        24.Array = {1,3,5,2,8,7,9,10} All the even numbers at start and odd numbers in the last
         */
        System.out.println(" ****** Printing All the even numbers at start and odd numbers in the last *************");
        int[] arr1 = {1,3,5,2,8,7,9,10};
        int[] separatedEvenOdd = separateEvenOdd(arr1);
        System.out.println(Arrays.toString(separatedEvenOdd));
        /*
        25.List<Integer> l = Arrays.asList(1,1,2,2,2,3,4,5,5);
        o/p -> 3,4,1,1,5,5,2,2,2
         */
        System.out.println(" *********** Printing sorted order based on frequency ********");
        List<Integer> list = Arrays.asList(1,1,2,2,2,3,4,5,5);
        Comparator<Integer> frequencyComparator = Comparator.
                <Integer,Integer>comparing(e -> Collections.frequency(list, e)) //(1,1= 2, 2,2,2=3, 3=1, 4=1, 5,5=2)
                .thenComparing(e -> e); // in case of tie, use natural ordering of elements

        list.sort(frequencyComparator);
        System.out.println(list);
        /*
        26.list of string sort based on the length of string
         */

        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<String> sortedString = strings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedString);

        /*
        27.write a program in java to add prefix and suffix
         in a given String
         */
        System.out.println("****** Printing String Joiner **********");
        StringJoiner joiner = new StringJoiner(",","$","$");
        joiner.add("Java");
        joiner.add("Interview");
        joiner.add("Question");
        System.out.println(joiner);
        /*
        28.Java 8 Program to Print 10 random numbers using forEach?
         */
        System.out.println("********* Printing 10 random numbers using forEach ********");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        /*
        29.Java 8 program to Count Strings whose length is greater than 3 in List?
         */

        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        long countedString = stringList.stream().filter(str -> str.length() > 3).count();
        System.out.println("Total number of String whose length is > 3: " + countedString);
        System.out.println("String whose length is > 3");
        stringList.stream().filter(st -> st.length() > 3).forEach(System.out::println);

        /*
        30.Calculate the age of Person
         */

        LocalDate birthDate = LocalDate.parse("1997-04-20");
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate,currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Years: "+ years + ", months: " + months + ", days: " + days);
        /*
        31.Write a program to find the sum of all the digits of a number
         */
        System.out.println("****** Printing sum of all the digits ******");
        int num = 12345;//15
        IntStream stream = String.valueOf(num).chars();
        int sum = stream.map(Character::getNumericValue).sum();
        System.out.println(sum);
        /*
        32.program to reverse each word of string
         */
        System.out.println("******** Printing reverse word of each string *************");
        String inputString = "Hello World this is Java";
        List<String> reversedString = Arrays.stream(inputString.split(" ")).
                map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
        System.out.println(reversedString);
        /*
        Sorted the string in alphabetical order
         */
        System.out.println("*********** Printing sorted string ***********");
        List<String> fruits = Arrays.asList("Banana","Apple","Cherry","Strawberry","Guava","Orange");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits);
    }


    public static int[] separateEvenOdd(int[] arr){

        return IntStream.concat(
                Arrays.stream(arr)
                        .filter( e -> e % 2 == 0),
                        Arrays.stream(arr)
                                .filter(o -> o % 2 != 0)).toArray();

    }

    private static int findMaxElement(int[] intArray) {
        return Arrays.stream(intArray).max().getAsInt();
    }

    public static boolean containsDuplicate(int[] nums){


        List<Integer> list = Arrays.stream(nums)
                    .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if(list.size() == set.size())
            return false;
        else
            return true;

    }

}
