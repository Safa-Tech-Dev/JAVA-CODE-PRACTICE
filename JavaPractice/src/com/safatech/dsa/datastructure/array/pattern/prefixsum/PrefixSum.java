package com.safatech.dsa.datastructure.array.pattern.prefixsum;

/**
 * Given a integer array "a" return the prefix sum /running sum
 * in the same array without creating a new array.
 */
public class PrefixSum {

    public static void printArray(int[] arr){

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static int[] getPrefixSumArray(int[] arr){

        int n = arr.length;
        for(int i = 1; i < n; i++){

            arr[i] = arr[i] + arr[i - 1] ;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] input = {2,1,3,4,5};
        System.out.println("Original array....");
        printArray(input);
        int[] prefixSumArray = getPrefixSumArray(input);
        System.out.println("Prefix Sum array....");
        printArray(prefixSumArray);
    }
}
