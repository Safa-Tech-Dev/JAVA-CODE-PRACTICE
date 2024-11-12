package com.safatech.dsa.datastructure.array1d.pattern.arraymanipulation;

/**
 * find the second largest element in a given array1d
 */
public class FindSecondLargest {

    public static int findMax(int[] arr){

        int mx = Integer.MIN_VALUE; // assign the minimest value

        for(int i = 0; i<arr.length; i++){ // loop through the array1d

            if(arr[i] > mx){ // check element is greater than the max value
                mx = arr[i]; // if true assign as max
            }
        }
        return mx;
    }

    public static int findSecondMax(int[] arr){

        int mx = findMax(arr); // maximum value
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == mx){ //check array1d element is equal to max value
                arr[i] = Integer.MIN_VALUE; // if true strike out, assign infinity
            }
        }
        int secondMax = findMax(arr); // this will return second largest value
        return secondMax;
    }
    public static void main(String[] args) {

        int[] arr = {5,2,5,3,5};
        System.out.println(findSecondMax(arr));

    }
}
