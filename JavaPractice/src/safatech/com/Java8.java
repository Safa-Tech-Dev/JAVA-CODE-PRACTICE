package safatech.com;

import java.util.*;
import java.util.stream.Collectors;

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

        /*
        Given the list of integers, find the first element of the list using Stream functions?
         */
        System.out.println("********** Find first Element of the list");

        // method -1
        Optional optional = myList3.stream().filter(i -> i > 12).findFirst();
        if(optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("No value present");
        }
        //method -2
        myList3.stream().findFirst().ifPresent(System.out::println);

    }

}
