package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;

/**
 * Program to remove/ delete the element from the array
 */
public class RemoveElementFromArray {

    public static int[] remove(int[] arr, int item){

        int index = 0,
                n = arr.length;
        int[] newArray = new int[n-1];
        for(int i = 0; i < n; i++){

            if(arr[i] != item){

                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }

    /**
     * 27. Remove Element,
     * return the number of elements in nums which are not equal to val.
     * @param nums
     * @param item
     * @return return the number of elements in nums which are not equal to item.
     */
    public static int removeInPlace(int[] nums, int item){

        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] != item){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {

        int[] originalArray = {1,2,3,4,5};
        int elementToRemove = 3;
        System.out.println(Arrays.toString(remove(originalArray,elementToRemove)));

        int[] nums = {3,2,2,3};
        int elementToRemove2 = 3;
        System.out.println((removeInPlace(nums,elementToRemove2)));


    }
}
