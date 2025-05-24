package com.safatech.dsa.datastructure.array1d.pattern.arraymanipulation;

/**
 * find unique number in a given array where all the numbers are being repeated twice with one value being unique.
 */
public class FindUnique {

    public static int findUnique(int[] arr){

        int ans = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){ // 1st number
            for (int j = i + 1; j<n; j++){ // 2nd number

                if(arr[i] == arr[j]){
                    arr[i] = -1; // strike out
                    arr[j] = -1; // strike out
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

   /* The ^ operator is the bitwise XOR.
    All numbers that appear twice cancel each other out: a ^ a = 0.
    XOR with 0 returns the number itself: 0 ^ b = b
    */
    public static int findUniqueWithXor(int[] arr){

        int ans = 0;
        for(int num : arr){
            ans ^= num; // XOR cancels out duplicate elements
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,1,3}; // {-1,-1,-1,4,-1,-1,-1}
        System.out.println(findUnique(arr)); //4
        System.out.println(findUniqueWithXor(arr));

    }
}
