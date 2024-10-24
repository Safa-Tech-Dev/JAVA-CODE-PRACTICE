package com.safatech.dsa.datastructure.array.pattern.arraymanipulation;

public class RotateArrayByKthSteps {

    // first approach
    public static int[] rotate(int[] arr, int k){

        int n = arr.length;
        int[] ans = new int[n];
        k = k % n;
        int j = 0;

        //copy 1st part
        for(int i = n - k; i<n; i++){
            ans[j++] = arr[i];
        }
        // copy 2nd part
        for(int i = 0; i<n - k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void rotateInPlace(int[] arr, int k){

        int n = arr.length;
        k = k % n;
        getreversedArrayInPlace(arr, 0, n - k - 1);
        getreversedArrayInPlace(arr, n - k, n - 1);
        getreversedArrayInPlace(arr, 0, n - 1);
    }

    public static void getreversedArrayInPlace(int[] arr, int start, int end) {

        int n = arr.length;
        while (start < end){
            swapInPlace(arr,start, end);
            start++;
            end--;
        }
    }
    public static void swapInPlace(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void print(int[] arr){
        for(int  i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 3;
        print(rotate(arr,k));
        int[] arr1 = {1,2,3,4,5,6,7};
        int k1 = 5;
        rotateInPlace(arr1,k1);
        System.out.println();
        print(arr1);
    }
}
