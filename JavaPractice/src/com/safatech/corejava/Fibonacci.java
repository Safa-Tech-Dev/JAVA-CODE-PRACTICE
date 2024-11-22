package com.safatech.corejava;

   /*
   Finding the nth element in the Fibonacci series
   */

public class Fibonacci {

    public static int getNthFibonacci(int n){

        if(n <= 1)
            return n;
        return getNthFibonacci(n -1) + getNthFibonacci(n - 2);
    }

    public static void main(String[] args) {

        int num = 10;
        System.out.println(getNthFibonacci(num));
    }
}
