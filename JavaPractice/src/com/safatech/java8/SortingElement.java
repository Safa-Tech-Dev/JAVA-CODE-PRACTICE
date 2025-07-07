package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElement {

    // Given a list of integers, sort(Default: Ascending Order)
    // all the values present in it using Stream functions?
    public static void getSortedAscending(List<Integer> list){

        System.out.println("Ascending Order");
        list.stream().sorted().forEach(e -> System.out.println(e));
    }
    // Given a list of integers, sort all the values present in it in descending order using Stream functions?
    public static void getSortedDescendinng(List<Integer> list){

        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
    // Write a Java 8 program to sort an array and then convert the sorted array into Stream?
    public static void getSortedArrayIntoStream(int[] arr){

        System.out.println("Printing sorted array and converted to stream");

        // Multi-threaded (uses Fork/Join framework),Faster for large arrays (usually > 8192 elements)
        // Large arrays that benefit from parallelism, Not guaranteed to be stable
        Arrays.parallelSort(arr);
        // Single-threaded, Slower for large arrays,Small or medium arrays, Stable sort (for objects)
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    // list of string sort based on the length of string
    // List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
    // o/p : [kiwi, apple, grape, banana, orange]
    public static void getSortedBasedOnLengthOfString(List<String> stringList){

        System.out.println("Printing sorted string based On length");
        List<String> sortedString = stringList.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sortedString);
    }

    // Sorted the string in alphabetical order
    // List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
    // o/p : [apple, banana, grape, kiwi, orange]
    public static void getSortedAlphabaticalOrder(List<String> list){

        System.out.println("Printing sorted string in Alphabatical Order");
        List<String> sortedAlphabatical = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedAlphabatical);
    }

    // sort the list based on frequency
    // List<Integer> list = Arrays.asList(1,1,2,2,2,3,4,5,5);
    //  o/p -> 3,4,1,1,5,5,2,2,2
    public static void getSortedBasedOnFrequency(List<Integer> list){

        System.out.println("Printing sorted order based on frequency");
        Comparator<Integer> comparator = Comparator
                .<Integer, Integer>comparing(e -> Collections.frequency(list, e)) //(1,1= 2, 2,2,2=3, 3=1, 4=1, 5,5=2)
                .thenComparing(e -> e);// in case of tie, use natural ordering of elements

        list.sort(comparator);
        System.out.println(list);
    }
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] ar = { 99, 55, 203, 99, 4, 91 };
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<Integer> list = Arrays.asList(1,1,2,2,2,3,4,5,5);
        // Ascending sort method
        getSortedAscending(number);
        // Descending sort method
        getSortedDescendinng(number);
        // Array sort into stream
        getSortedArrayIntoStream(ar);
        // string length based sorting
        getSortedBasedOnLengthOfString(strings);
        // Sorted the string in alphabetical order
        getSortedAlphabaticalOrder(strings);
        // sort the list based on frequency
        getSortedBasedOnFrequency(list);
    }
}
