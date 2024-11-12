package com.safatech.dsa.datastructure.array.pattern.arraymanipulation;

/**
 * Given an array 'a' consisting of integers .Return the first repeating number in the array,
 * if no value is being repeated return -1
 */
public class FirstRepeatingNumber {
    public static int findFirstRepeatingNumber(int[] arr){
        for(int i = 0; i<arr.length; i++){ // first no., it will fix the first number
            for(int j = i + 1; j< arr.length; j++){ // traverse the arr from second number
                if(arr[i] == arr[j]){ // found the number
                    return arr[i]; // return it
                }
            }
        }
        return -1; // if not found return -1
    }
    public static void main(String[] args) {

        int[] arr = {1,5,3,4,6,3,4};
        System.out.println(findFirstRepeatingNumber(arr));

    }
}
