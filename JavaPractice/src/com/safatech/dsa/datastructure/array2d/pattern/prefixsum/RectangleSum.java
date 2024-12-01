package com.safatech.dsa.datastructure.array2d;

import java.util.Scanner;

public class RectangleSum {

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
   public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
   }

   // Calculate the row-wise and column-wise sum
    // matrix[i][j] = SumRectangle((0,0), (i)(j))
   public static void findPrefixSumMatrix(int[][] matrix){

        int r = matrix.length;
        int c = matrix[0].length;
        // Traverse every row(Horizontally) to calculate row-wise prefix-sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
       // Traverse every column to calculate col-wise prefix-sum
       for(int j = 0; j < c; j++){ //fixing col
           for(int i = 1; i < r; i++){ // row
               matrix[i][j] += matrix[i-1][j];
           }
       }
   }
    public static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {

        int sum = 0;
        findPrefixSumMatrix(matrix);
        for(int i = l1; i <= l2; i++){
            // r1 to r2 sum for row i
            if(r1 >= 1)
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            else
                sum += matrix[i][r2]; // previously we calculated the sum based on 1 index, but now 0 based index
        }
        return sum;
    }
    public static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {

        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1)
            left = matrix[l2][r1-1];
        if(l1 >= 1)
            up = matrix[l1-1][r2];
        if(l1 >= 1 && r1 >= 1)
            leftUp = matrix[l1 - 1][r1 - 1];
        ans = sum - up - left  + leftUp;

        return ans;
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
        System.out.println("Enter the rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum : " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("Rectangle Sum : " + findSum3(matrix, l1, r1, l2, r2));

    }
}
