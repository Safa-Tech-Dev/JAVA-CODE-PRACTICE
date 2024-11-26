package com.safatech.corejava;

public class CountEvenOdd {

      /*
      Count even and odd digits in a int nums = 123456;
       */
    private static void findEvenOdd(int num) {
        int evenCount = 0, oddCount = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0)
                evenCount++;
            else
                oddCount++;
            num = num / 10;
        }
        System.out.println("Even count : " + evenCount + " , " + "Odd count : " + oddCount);
    }

    public static void main(String[] args) {
        int num = 123456897;
        findEvenOdd(num);
    }
}
