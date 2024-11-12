package com.safatech.dsa.datastructure.array.pattern.arraymanipulation;

/**
 * fini unique number in a given array where all the numbers are being repeated twice with one value being unique.
 */
public class FindUnique {

    public static int findUnique(int[] arr){

        int ans = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){ // 1st number
            for (int j = i + 1; j<n; j++){ // 2nd number

                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,1,3};
        System.out.println(findUnique(arr)); //4

    }
}
