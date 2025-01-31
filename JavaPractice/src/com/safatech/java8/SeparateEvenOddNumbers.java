package JavaPractice.src.com.safatech.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
Array = {1,3,5,2,8,7,9,10} All the even numbers at start and odd numbers in the last

O/p : [2, 8, 10, 1, 3, 5, 7, 9]
*/
public class SeparateEvenOddNumbers {

    public static int[] separateEvenOdd(int[] arr){

        IntStream separated = IntStream.concat(
                Arrays.stream(arr).filter(e -> e % 2 == 0),
                Arrays.stream(arr).filter(o -> o % 2 != 0));
        return separated.toArray();
    }
    public static void main(String[] args) {

        int[] arr = {1,3,5,2,8,7,9,10};
        System.out.println(Arrays.toString(separateEvenOdd(arr)));
    }
}
