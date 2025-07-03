package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the total number of elements present in the list using Stream functions?
 */
public class CountElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,45,63,1,22,12,2,3);

        long count = list.stream().count();
        System.out.println("Total count : " + count);
    }
}
