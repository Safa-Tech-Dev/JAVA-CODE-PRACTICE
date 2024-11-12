package com.safatech.dsa.datastructure.array1d;

import java.util.Arrays;

public class SmallestNLargestElement {

    public static int[] smallestNLargestElement (int[] arr){

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,3,5,6,8,9};
        System.out.println(Arrays.toString(smallestNLargestElement(arr)));

    }
}
