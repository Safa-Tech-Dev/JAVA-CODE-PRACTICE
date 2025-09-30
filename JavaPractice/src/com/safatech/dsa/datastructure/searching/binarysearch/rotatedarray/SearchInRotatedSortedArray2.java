package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch.rotatedarray;

/**
 * 81. Search in Rotated Sorted Array II --- Contains Duplicates
 */
public class SearchInRotatedSortedArray2 {

    public static boolean search(int[] nums, int target){

        int n = nums.length,
                start = 0,
                end = n - 1;
        while (start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){

                return true;
            }

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            else if (nums[mid] <= nums[end]){

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
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2,5,6,0,0,1,2};
        int target = 6;
        System.out.println(search(nums, target));
        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println(search(nums2,target2));

    }
}
