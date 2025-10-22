package JavaPractice.src.com.safatech.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatMapSum {

    static void main() {

        List<List<Integer>> nums = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(1,2,3),
                        Arrays.asList(4,5,6),
                        Arrays.asList(7,8,9)
                )
        );

        Integer sum1 = nums.stream()
                .flatMap(List::stream)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum1);

        int sum2 = nums.stream()
                .flatMap(List::stream)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum2);
    }
}
