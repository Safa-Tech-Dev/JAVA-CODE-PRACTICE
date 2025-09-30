package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch.rotatedarray;

/**
 * 33. Search in Rotated Sorted Array -- No Duplicate element
 */
public class SearchInRotatedSortedArray1 {

    public static int search(int[] nums, int target){

        int n = nums.length,
                start = 0,
                 end = n - 1;
        while (start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){

                return mid;
            }
            if (nums[mid] < nums[end]){

                if(target <= nums[end] && target > nums[mid]){

                    start = mid + 1;
                }else{

                    end = mid - 1;
                }
            }else{

                if(target >= nums[start] && target < nums[mid]){

                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(nums, target));

    }
}
