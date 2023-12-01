package safatech.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        /*
        1. Given a list of integers,
        find out all the even numbers that exist in the list using Stream functions
         */
        Integer[] arr = {1,1,3,6,0,7,-8,-1,-3};
        List<Integer> myList1 = Arrays.asList(arr);
        List<Integer> evenList = myList1.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
        System.out.println(evenList);
        myList1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        /*
        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
         */
        List<Integer> myList2 = Arrays.asList(10,12,15,8,9,7,5);
        myList2.stream().map(s -> s + "") // converting to string
                .filter( i -> i.startsWith("1")).forEach( i -> System.out.println(i));
    }
}
