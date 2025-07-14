package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Java 8 program to Count Strings whose length is greater than 3 in List
 */
public class StringLengthGT3 {

    public static void getStringListGT3(List<String> list){

        // Count the total number of string whose length is > 3
        long countedString = list.stream()
                .filter(s -> s.length() > 3)
                .count();
        System.out.println("Total number of String whose length is > 3: " + countedString);

        System.out.print("And the Strings are: ");
        list.stream()
                .filter(s -> s.length() > 3)
                .forEach(e -> System.out.print(e + " "));

    }
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        getStringListGT3(stringList);

    }
}
