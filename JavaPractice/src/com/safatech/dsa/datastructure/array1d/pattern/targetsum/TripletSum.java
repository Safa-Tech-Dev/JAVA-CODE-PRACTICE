package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.targetsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * # leetcode : 15
 * count no. of triplets in the array1d whose sum is equal to the given value x.
 */
public class TripletSum {

    public static int tripletSum(int[] arr, int target){

        int n = arr.length;
        int ans = 0;

        for(int i = 0; i<n; i++){ // 1st number
            for(int j = i + 1; j<n; j++){ //2nd number
                for(int k = j + 1; k<n; k++){ //3rd number

                    if(arr[i] + arr[j] + arr[k] == target){

                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    // three sum using two pointer
    public List<List<Integer>> threeSum(int[] nums){

        int n = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // fix the element
        for(int i = 0; i < n; i++){

            // check the duplicates of the first element
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            // Two Pointer
            int left = i + 1;
            int right = n - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // skip duplicates for left pointer
                    while(left < right && nums[left] == nums[left - 1]){

                        left++;
                    }

                    // skip duplicates for right pointer
                    while(left < right && nums[right] == nums[right + 1]){

                        right--;
                    }
                }
                else if(0 > sum){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {1,4,5,6,3};
        int target = 12;// {1,5,6}, {4,5,3}
        System.out.println(tripletSum(arr,target));

        TripletSum tripletSum = new TripletSum();
        int[] nums = {-1,0,1,2,-1,-4};
        IO.println(tripletSum.threeSum(nums));

    }
}
