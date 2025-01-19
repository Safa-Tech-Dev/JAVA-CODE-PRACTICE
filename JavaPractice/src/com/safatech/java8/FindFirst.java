package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Given the list of integers, find the first element of the list using Stream functions?
*/
public class FindFirst {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(12,45,63,1,22,12,2,3);

        // Method 1
        Optional<Integer> firstElement1 = myList.stream().filter(i -> i > 12).findFirst();
        if(firstElement1.isPresent()){
            System.out.println(firstElement1.get());
        }else {
            System.out.println("No value Present...");
        }

        // Method 2
        myList.stream().findFirst().ifPresent(System.out::println);


    }
}
