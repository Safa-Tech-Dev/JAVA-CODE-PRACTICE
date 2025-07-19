package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch.rotatedarray;

/**
 * 153. Find Minimum in Rotated Sorted Array
 */
public class MinimumInRotatedArray {

    public static void main(String[] args) {

        int[] nums = {3,4,5,1,2};
        System.out.println(findMinimum(nums));

    }
    public static int findMinimum(int[] nums){

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start)/2;
            // if mid is smaller than the last value, update the ans, and move the end to backward
            if(nums[mid] <= nums[n-1]){

                ans = nums[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
