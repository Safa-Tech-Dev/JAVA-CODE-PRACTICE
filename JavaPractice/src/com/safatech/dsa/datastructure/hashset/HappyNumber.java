package com.safatech.dsa.datastructure.hashset;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getSumOfSquare(n);
        }
        return n == 1;
    }
    private static int getSumOfSquare(int nums){
        int sum = 0;
        while( nums > 0){
            int digit = nums % 10; // 19 % 10 = 9
            sum =sum + (digit * digit); // iteration-1 -> 0 + (9 * 9) = 0 + 81 = 81
            // iteration-2 -> 81 + (1 * 1) = 81 + 1 = 82
            nums = nums / 10; // 19 / 10 = 1
        }
        return sum;
    }
}
