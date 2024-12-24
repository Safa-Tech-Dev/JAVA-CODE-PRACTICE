package com.safatech.corejava;
/*
Write a program to find the sum of all the digits of a number
 */
public class SumOfDigit {

    public static void main(String[] args) {

        int number = 12345;
        int sum = 0;
        int rem;
        while(number > 0){

            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        System.out.println("Sum : " + sum);
    }
}
