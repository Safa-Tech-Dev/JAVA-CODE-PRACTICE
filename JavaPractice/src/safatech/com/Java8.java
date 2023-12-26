package safatech.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args) {
        /*
        1. Given a list of integers,
        find out all the even numbers that exist in the list using Stream functions
         */
        System.out.println("************ find all even numbers ************");
        Integer[] arr = {1,1,3,6,0,7,-8,-1,-3};
        List<Integer> myList1 = Arrays.asList(arr);
        List<Integer> evenList = myList1.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
        System.out.println(evenList);
        myList1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        /*
        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
         */
        System.out.println("******* find all the number starting with 1");
        List<Integer> myList2 = Arrays.asList(10,12,15,8,9,7,5);
        myList2.stream().map(s -> s + "") // converting to string
                .filter( i -> i.startsWith("1")).forEach( i -> System.out.println(i));

        /*
        3. How to find duplicate elements in a given integers list in java using Stream functions?
         */
        System.out.println("********** Find the Duplicate Elements ************");
        Integer[] intArray = new Integer[]{12,34,12,5,5,23};
        List<Integer> myList3 = Arrays.asList(intArray);
        Set<Integer> mySet = new HashSet<>();
        myList3.stream().filter(n -> !mySet.add(n)).forEach(System.out::println);

        //method - 2
        String s1 = "ILoveDawateIslami";
        List<String> duplicatElements = Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicatElements);

        /*
        How to count each element/word from the String ArrayList in Java8?
         */
        System.out.println("********** count each element/word from the String ArrayList ************");
        List<String> names = Arrays.asList("AA","BB", "CC","AA");
        Map<String, Long> namesCounting = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCounting);

        /*
        Find the Unique Element
         */
        System.out.println("********* Printing Unique Elements *********");
        List<String> uniqueElement =  Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                .entrySet().stream()
                        .filter(x -> x.getValue() == 1)
                                .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());
        System.out.println(uniqueElement);
        /*
            Find First Non-Repeated Element from the String
         */
        System.out.println("*********Printing first Non-Repeated Element*********");
        String first_non_Repeated_Element = Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                                .entrySet().stream()
                        .filter(x -> x.getValue() == 1)
                                        .findFirst().get().getKey();
        System.out.println(first_non_Repeated_Element);

        /*
            Find First Repeated Element from the String
         */
        System.out.println("****************first Repeated Element******************");
        String firstRepeatedElement = Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                                .entrySet().stream()
                        .filter(x -> x.getValue() > 1)
                                .findFirst().get().getKey();
        System.out.println(firstRepeatedElement);

        /*
        4.Given the list of integers, find the first element of the list using Stream functions?
         */
        System.out.println("********** Find first Element of the list************");

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
        5. Given a list of integers, find the total number of elements present in the list using Stream functions?
         */
        System.out.println("******* total number of elements present in the list ***********");
        long count = myList3.stream().count();
        System.out.println(count);

        /*
            6. Given a list of integers,
             find the maximum value element present in it using Stream functions?
         */

        System.out.println("****** Max element in the list ************");
        Integer max = myList3.stream().max(Integer::compare).get();
        System.out.println(max);

        // method - 2
        /*
        Write a Program to find the Maximum element in an array?
        */
        int[] arr2 = {12,19,20,88,00,9};
        System.out.println(Java8.findMaxElement(arr2));
        /*
        7.Write a program to print the count of each character in a String?
         */
        System.out.println("*******Printing Each characters count*********");
        String s = "ILoveDawateIslami";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        /*
         Given a list of integers, sort all the values present in it using Stream functions?
         */
        System.out.println("******** printing in ascending order ************");
        List<Integer> number = Arrays.asList(10,15,8,49,25,98,98,32,15);
        number.stream().sorted().forEach(System.out::println);
        /*
        Given a list of integers, sort all the values present in it in descending order using Stream functions?
         */
        System.out.println("******** printing in descending order ************");
        number.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        /*
        Find the second Highest element from the Array
         */

        System.out.println("******* Printing Second Highest Element ********☺");
        int[] array = {5,9,11,2,8,21,1};
        Integer firstElement = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(firstElement);

        /*
        Find the Longest String in the given array
         */
        System.out.println("******* Printing the Longest String *********");

        String[] strArray = {"Java", "Springboot", "microservices","DockerHubKubernetes","Amazon Web Services"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        /*
        String.join method
        */
        System.out.println("***** Printing String.join method******");

        List<String> nos = Arrays.asList("1","2","3","4");
        String results = String.join("-", nos);
        System.out.println(results);

        /*
        Skip and Limit example (2 - 9)
         */
        System.out.println("***** Printing Skip() and Limit() ********");

        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
        /*
        Given an integer array nums, return true if any value appears
        at least twice in the array, and return false if every element is distinct.
         */
        int[] nums = {1,2,3,1};
        System.out.println(Java8.containsDuplicate(nums));

        /*
        Write a Java 8 program to concatenate two Streams?
         */
        System.out.println(" ******** Printing Concat Stream ********");
        List<String> l1 = Arrays.asList("Saddam", "Farheen");
        List<String> l2 = Arrays.asList("Safa", "Khan");
        Stream<String> concatStream = Stream.concat(l1.stream(),l2.stream());
        concatStream.forEach(j -> System.out.println(j + " "));

        /*Java 8 program to perform cube on list elements and filter numbers greater than 50.*/
        System.out.println("********** Printing cube on list and no. > 50 *****");
        myList1.stream().map( k -> k * k * k).filter(m -> m > 50).forEach(System.out::println);

        /*
         Write a Java 8 program to sort an array and then convert the sorted array into Stream?
         */
        System.out.println(" ********** Printing sorted with and converted to stream ************");
        int[] ar = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(ar);
        Arrays.stream(ar).forEach(System.out::println);

        /*
        How to use map to convert object into Uppercase in Java 8?
         */
        System.out.println("************ Printing String to Uppper Case ********");
        String[] name = {"saddam", "khan", "farheen", "Safa naaz"};
        List<String> nameList = Arrays.stream(name)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nameList);
        /*
        How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
         */

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
