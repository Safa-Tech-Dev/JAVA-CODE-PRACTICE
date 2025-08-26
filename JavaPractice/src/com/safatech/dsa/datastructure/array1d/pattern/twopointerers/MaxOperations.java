package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1679. Max Number of K-Sum Pairs
 */
public class MaxOperations {

    // Two Pointer
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

    // Using HashMap
    public static int maxOperations2(int[] arr, int target){

        Map<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;
        for(int num : arr){

            int complement = target - num;
            if(freq.containsKey(complement)){
                pairs++;
                if(freq.get(complement) == 1) // if complement value is 1, remove from the map
                    freq.remove(complement);
                else
                    freq.put(complement, freq.get(complement) - 1); // or decrease the value by 1
            }else{
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }
        return pairs;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int target = 5;
        System.out.println(maxOperations(arr, target));

        int[] arr2 = {3,1,3,4,3};
        int target2 = 6;
        System.out.println(maxOperations(arr2, target2));
        System.out.println(maxOperations2(arr, target));
        System.out.println(maxOperations2(arr2, target2));
    }
}
