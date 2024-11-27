package com.safatech.dsa.datastructure.array2d.pattern.spiralmatrix;

import java.util.Scanner;

public class GenerateSpiralMatrix {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiralOrderMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, bottonRow = n - 1, leftCol = 0, rightCol = n -1;
        int curr = 1;
        while(curr <= n * n){
            // topRow -> leftCol to rightCol
            //check totalelement before entering to loop , && curr <= n * n
            for(int j = leftCol; j <= rightCol && curr <= n * n; j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++; // increase one row bottom
            // rightCol -> topRow to bottomRow

            for(int i = topRow; i <= bottonRow && curr < n * n; i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--; // decrease one col left
            // bottonRow -> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && curr < n * n; j--){
                matrix[bottonRow][j] = curr;
                curr++;
            }
            bottonRow--; // decrease one row above
            // leftcol -> bottmRow to topRow
            for(int i = bottonRow; i >= topRow && curr < n * n; i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++; //increase one col right
        }
        return matrix;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n.");
        int n = sc.nextInt();
        System.out.println("Spiral Order Matrix.");
        int[][] matrix = generateSpiralOrderMatrix(n);
        printMatrix(matrix);

    }
}
