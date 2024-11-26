package com.safatech.dsa.datastructure.array2d.pattern.spiralmatrix;

import java.util.Scanner;

public class SpiralMatrix {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottonRow = r - 1, leftCol = 0, rightCol = c -1;

        int totalElements = 0;
        while(totalElements < r * c){
            // topRow -> leftCol to rightCol
            //check totalelement before entering to loop , && totalElements < r * c
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++; // increase one row bottom
            // rightCol -> topRow to bottomRow

            for(int i = topRow; i <= bottonRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--; // decrease one col left
            // bottonRow -> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                System.out.print(matrix[bottonRow][j] + " ");
                totalElements++;
            }
            bottonRow--; // decrease one row above
            // leftcol -> bottmRow to topRow
            for(int i = bottonRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++; //increase one col right
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
        System.out.println("Spiral Order");
        printSpiralOrder(matrix,r, c);

    }
}
