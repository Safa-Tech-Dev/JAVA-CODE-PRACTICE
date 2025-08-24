package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;

/**
 * 1679. Max Number of K-Sum Pairs
 */
public class MaxOperations {

    public static int maxOperations(int[] arr, int target ){

        int moves = 0;
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                moves++;
                left++;
                right--;
            }else if(target > sum){ // if target is  bigger than look right side by moving left forward
                left++;
            }else{
                right--;
            }
        }
        return moves;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int target = 5;
        System.out.println(maxOperations(arr, target));

        int[] arr2 = {3,1,3,4,3};
        int target2 = 6;
        System.out.println(maxOperations(arr2, target2));
    }
}
