package com.safatech.dsa.datastructure.array1d.pattern.arraymanipulation;

import java.util.Scanner;

public class PresentQuery {

    public static int[] makeFrequencyArray(int[] arr){

        int[] frequency = new int[100005];

        for(int i = 0; i< arr.length; i++){

            frequency[arr[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] freq = makeFrequencyArray(arr);

        Scanner sc = new Scanner(System.in);
        int queries = 5;
        while(queries > 0){

            System.out.println("Enter the number to be searched...");
            int x = sc.nextInt();
            if (freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            queries--;
        }

    }
}
