package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,12,15,8,9,7,5);
        list.stream()
                .map(s -> s + "") // converting to string
                .filter( i -> i.startsWith("1"))
                .forEach(System.out::println);
    }
}
