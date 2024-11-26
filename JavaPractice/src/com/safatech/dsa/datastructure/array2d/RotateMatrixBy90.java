package com.safatech.dsa.datastructure.array2d;

import java.util.Scanner;

public class RotateMatrixBy90 {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void getRotateMatrixBy90(int[][] matrix, int n){

        // Transpose it
        findTransposeInPlace(matrix, n ,n);
        // Reverse it
        for(int i = 0; i < n; i++){

            reverseArray(matrix[i]);
        }
    }

    // Reverse Array
    public static void reverseArray(int[] arr){

        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    //valid for only square matrix
    public static void findTransposeInPlace(int[][] matrix, int r, int c){

        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){ // j will start from i
                //swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix.");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        getRotateMatrixBy90(matrix,r);
        System.out.println("Rotated Matrix by 90 degree.");
        printMatrix(matrix);
    }
}
