package com.safatech.dsa.datastructure.array2d;

import java.util.Scanner;

public class TransposeOfMatrix {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] findTranspose(int[][] matrix, int r, int c){

        int[][] ans = new int[c][r];
        for(int i = 0; i< c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
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
        System.out.println("Transpose of Matrix");
        //int[][] transposed = findTranspose(matrix, r, c);
        findTransposeInPlace(matrix, r, c);
        printMatrix(matrix);
    }
}
