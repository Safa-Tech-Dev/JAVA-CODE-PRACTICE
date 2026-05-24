package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.targetsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * # 18
 * Example 1:
 *
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 */
public class FourSum {


    public List<List<Integer>> fourSum(int[] arr, int target){


        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        // fix the 1st number
        for(int i = 0; i < n; i++){

            // check duplicates for the 1st number
            if(i > 0 && arr[i] == arr[i - 1])
                continue;

            // fix the 2nd number
            for(int j = i + 1; j < n; j++){

                // check duplicates for the 2nd number
                if(j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                // Two Pointer

                int left = j + 1;
                int right = n - 1;

                // find pairs for the current number j
                while (left < right){

                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum == target){

                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;

                        // skip duplicate for the left
                        while (left < right && arr[left] == arr[left - 1])
                            continue;

                        // skip duplicate for the right
                        while (left < right && arr[right] == arr[right + 1])
                            continue;
                    }
                    else if(target > sum)
                        left++;
                    else
                        right--;
                }

            }
        }
        return result;
    }
    static void main() {


        int[] nums1 = {1,0,-1,0,-2,2};
        int target1 = 0;
        FourSum fourSum1 = new FourSum();

        IO.println(fourSum1.fourSum(nums1,target1));

        int[] nums2 = {2,2,2,2,2};
        int target2 = 8;
        FourSum fourSum2 = new FourSum();

        IO.println(fourSum2.fourSum(nums2,target2));
    }
}
