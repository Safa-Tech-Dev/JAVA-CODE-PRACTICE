package com.safatech.dsa.datastructure.array2d;

import java.util.Scanner;

public class PascalTriangle {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascalTriangle(int n){

        int[][] ans = new int[n][];
        for(int i = 0; i < n; i++){
            //Property
            //1.ith row has (i + 1) column
            ans[i] = new int[i+1];
            //2.every row, first and last element should be 1
            ans[i][0] = ans[i][i] = 1;
            //3.sum of the elements of above row's and its previous column.
            for(int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] ans = pascalTriangle(n);
        System.out.println("Pascal's Triangle.");
        printMatrix(ans);
    }
}
