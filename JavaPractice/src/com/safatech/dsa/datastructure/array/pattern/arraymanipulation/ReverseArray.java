package com.safatech.dsa.datastructure.array.pattern.arraymanipulation;

public class ReverseArray {

    public static int[] getReversedArray(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        //traverse the original array in reverse direction
        for(int i = n - 1; i>= 0; i--){

            ans[j++] = arr[i];
        }

        return ans;
    }

    public static int[] getReversedArrayInPlace(int[] arr) {

        int i = 0, j = arr.length - 1;

       while (i < j){
           swapInArray(arr, i, j);
           i++;
           j--;
       }
       return arr;
    }

    public static void swapInArray(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        printArray(getReversedArray(arr));
        System.out.println("\n" + " In place swap");
        printArray(getReversedArrayInPlace(arr)); // call by reference
        System.out.println("\n" + " In place swap with odd value ");
        int[] arr2 = {1,2,3,4,5};
        printArray(getReversedArrayInPlace(arr2)); // call by reference

    }
}
