package com.safatech.dsa.datastructure.array1d.pattern.arraymanipulation;

public class SwapToNumber {

    public static void swapWithout3rdVariable(int a, int b){

        System.out.println("Before swap");
        System.out.println("a: " + a + ", b: " + b);

        a = a + b; // 5 + 7 = 12
        b = a - b; // 12 - 7 = 5
        a = a - b; // 12 - 5 = 7
        System.out.println("After swap");
        System.out.println("a: " + a + ", b: " + b);
    }

     public static void swapUsing3rdVariable(int a, int b){

        System.out.println("Before swap");
        System.out.println("a: " + a + ", b: " + b);
        int temp;
        temp  = a; // 10
        a = b; // 20
        b = temp; // 10

        System.out.println("After swap");
        System.out.println("a: " + a + ", b: " + b);

     }

    public static void main(String[] args) {

        swapWithout3rdVariable(5,7);
        swapUsing3rdVariable(10, 20);
    }
}
