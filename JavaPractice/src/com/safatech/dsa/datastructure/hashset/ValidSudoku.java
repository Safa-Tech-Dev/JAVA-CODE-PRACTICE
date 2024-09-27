package com.safatech.dsa.datastructure.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated
 * according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 * Example 1:
 * Input: board =
 * {{'5','3','.','.','7','.','.','.','.'}
 * ,{'6','.','.','1','9','5','.','.','.'}
 * ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'}
 * ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'}
 * ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','7','9'}}
 * Output: true
 *
 * Example 2:
 *
 * Input: board =
 * {{'8','3','.','.','7','.','.','.','.'}
 * ,{'6','.','.','1','9','5','.','.','.'}
 * ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'}
 * ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'}
 * ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','7','9'}}
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two
 * 8's in the top left 3x3 sub-box, it is invalid.
 */
public class ValidSudoku {

    public  static boolean isValidValidSudoku(char[][] board){

        Set<String> seen = new HashSet<>();

        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){

                //For each non-empty cell, b stores the digit in the cell, wrapped in parentheses.
                // For example, if the cell contains the digit '5', b will become '(5)'.
                // This makes it easier to distinguish between row, column, and subgrid checks.
                String b = "("+board[row][col]+")";
                //If the current cell board{row}{col} contains a dot (.), it represents an empty cell, and we skip any further checks for that cell.
                if(board[row][col] != '.'){
                    //Check for duplicates in row, column, and subgrid
                    //If any of these conditions detect a duplicate (i.e., the element could not be added to the set because it already exists),
                    // the function immediately returns false.
                    //'(5)0', '0(5)', '0(5)0'
                    if(!seen.add(b+row) || !seen.add(col+b) || !seen.add(row/3 + b + col/3)){
                        return false;
                    }
                }
            }
        }
        //Return true if no violations are found
        return true;
    }

    public static void main(String[] args) {

        char[][] board1 = {{'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidValidSudoku(board1));

        char[][] board2 = {{'8','3','.','.','7','.','.','.','.'}
                         ,{'6','.','.','1','9','5','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'4','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidValidSudoku(board2));

    }
}
