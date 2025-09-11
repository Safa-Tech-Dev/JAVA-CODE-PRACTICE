package com.safatech.corejava;

   /*
   Finding the nth element in the Fibonacci series
   */

public class Fibonacci {

    public static void getFiboSeries(int n){

        int first = 0;
        int second = 1;

        for(int i = 0; i < n; i++){

            System.out.print(first + ",");
            int next = first + second; // c = 0 + 1 = 1
            first = second;  // a = 1
            second = next; // b = 1
        }
    }

    public static int getNthFibonacci(int n){

        if(n <= 1)
            return n;
        return getNthFibonacci(n -1) + getNthFibonacci(n - 2);
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println(getNthFibonacci(num));

        for(int i = 0; i < num; i++){

            System.out.print(getNthFibonacci(i) + " ");
        }
//        int n = 5;
        System.out.println();
        getFiboSeries(num);
    }
}
