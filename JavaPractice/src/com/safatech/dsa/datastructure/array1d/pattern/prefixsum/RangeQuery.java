package com.safatech.dsa.datastructure.array1d.pattern.prefixsum;

import java.util.Scanner;

public class RangeQuery {

    public static void printArray(int[] arr){

        for (int i = 0; i< arr.length; i++){

            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] getPrefixSumArray(int[] arr){

        int n = arr.length;
        for (int i = 1; i<n; i++){

            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1d size");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " element");
        for (int i = 1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = getPrefixSumArray(arr);
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("ans " + ans);
        }

    }
}
