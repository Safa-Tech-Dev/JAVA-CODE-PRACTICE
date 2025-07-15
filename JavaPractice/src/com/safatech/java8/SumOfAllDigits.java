package JavaPractice.src.com.safatech.java8;

import java.util.stream.IntStream;

/**
 * Write a program to find the sum of all the digits of a number
 */
public class SumOfAllDigits {

    public static void getDigitSum(int num){

        IntStream stream = String.valueOf(num).chars();
        int sum = stream.map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int num = 12345;
        getDigitSum(num);
    }
}
