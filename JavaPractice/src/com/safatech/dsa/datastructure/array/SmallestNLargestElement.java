package com.safatech.dsa.datastructure.array;

import java.util.Arrays;

public class SmallestNLargestIndex {

    public static int[] smallestNLargestIndex(int[] arr){

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,3,5,6,8,9};
        System.out.println(Arrays.toString(smallestNLargestIndex(arr)));

    }
}
