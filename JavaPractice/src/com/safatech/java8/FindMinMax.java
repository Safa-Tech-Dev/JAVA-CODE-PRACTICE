package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.Comparator;
/*
Given a list of integers,
find the maximum and minimum value element present in it using Stream functions?
*/
public class FindMinMax {

    public static void getMinValue(int[] arr){

//        method 1 instead of get() we can use  orElse(null); to avoid NoSuchElementException
        Integer min1 = Arrays.stream(arr).boxed().min(Comparator.naturalOrder()).get();
//        method 2
        Integer min2 = Arrays.stream(arr).boxed().min(Integer::compareTo).orElse(null); // Use a default value for safety
//        method 3
        int min3 = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min Value: " + min1);
        System.out.println("Min Value: " + min2);
        System.out.println("Min Value: " + min3);


    }
    public static void getMaxValue(int[] arr){

        // method 1
        Integer max1 = Arrays.stream(arr).boxed().max(Integer::compareTo).get();
        // method 2
        Integer max2 = Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
        // method 3
        int max3 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max Value: " + max1);
        System.out.println("Max Value: " + max2);
        System.out.println("Max Value: " + max3);
    }

    public static void main(String[] args) {
        int[] arr = {12,19,20,88,0,9};
        getMinValue(arr);
        getMaxValue(arr);

    }
}
