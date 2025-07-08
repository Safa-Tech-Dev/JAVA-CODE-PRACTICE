package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;

/*
 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class NumberStartingWith1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,12,15,8,9,7,5);

        numbers.stream()
                .map(s -> s + "")// conveting to string
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

    }
}
