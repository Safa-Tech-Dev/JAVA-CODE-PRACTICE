package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static int firstOccurence(int[] nums, int target){

        int n = nums.length;

        int start = 0,
                end = n - 1,
                result = -1;

        while(start <= end){

            int mid = start + (end - start)/2;
            if(target == nums[mid]){

                result = mid;
                end = mid - 1;
            }else if(target < nums[mid]){

                end = mid - 1;
            }else {

                start = mid  + 1;
            }
        }
        return result;
    }
    public static int lastOccurence(int[] nums, int target){

        int n = nums.length;

        int start = 0,
                end = n - 1,
                result = -1;

        while(start <= end){

            int mid = start + (end - start)/2;
            if(target == nums[mid]){

                result = mid;
                start = mid + 1;
            }else if(target < nums[mid]){

                end = mid - 1;
            }else {

                start = mid  + 1;
            }
        }
        return result;
    }

    public static int[] searchRange(int[] nums, int target) {

        int first = firstOccurence(nums, target);
        int last = lastOccurence(nums, target);
        return new int[]{first, last};
    }
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

}
