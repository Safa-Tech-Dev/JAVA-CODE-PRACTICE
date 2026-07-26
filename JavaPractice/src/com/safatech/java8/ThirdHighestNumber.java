package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;

public class ThirdHighestNumber {


    static void main() {

        Integer[] nums = {9,null, 30, null,20, null, 11, 10};
        Integer thirstHighest = Arrays.stream(nums)
                .filter(n -> n != null)
                .sorted((a, b) -> b - a)
                .skip(2)
                .findFirst()
                .orElse(0);
        IO.println(thirstHighest);


    }
}
