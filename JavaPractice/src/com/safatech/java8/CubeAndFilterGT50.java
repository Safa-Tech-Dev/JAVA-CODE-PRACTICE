package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class CubeAndFilterGT50 {

    public static void getCubeGT50(List<Integer> list){

        List<Integer> gT50 = list.stream()
                .map(k -> k * k * k)
                .filter(i -> i > 50).collect(Collectors.toList());

        gT50.forEach(System.out::println);
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,3,7,2,10,1);
        getCubeGT50(list);
    }
}
