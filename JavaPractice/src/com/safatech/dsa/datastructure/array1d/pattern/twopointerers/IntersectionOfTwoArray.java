package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1. If array not sorted, use set
 * 2. If array sorted use two pointer
 * 349. Intersection of Two Arrays
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArray {

    // If array not sorted, use set
    public static int[] findIntersection(int[] arr1, int[] arr2){

        Set<Integer> seen = new HashSet<>();

        Set<Integer> intersectionSet = new HashSet<>();

        for(int i : arr1){

            seen.add(i);
        }

        for(int j : arr2){

            if(seen.contains(j)){
                intersectionSet.add(j);
            }
        }

        int index = 0;
        int[] result = new int[intersectionSet.size()];

        for(int k : intersectionSet){

            result[index++] = k;
        }

        return result;

    }

    // Array Sorted, use Two Pointer

    public static int[] intersectionOfArray(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(n,m)];
        while (i < n && j < m){

            // if arr1 is too small, move i
            if(arr1[i] < arr2[j]){
                i++;
            }
            // if arr2 is too small, move j
            else if(arr2[j] < arr1[i]){
                j++;
            }
            // check if result is empty and no duplicates
            else if(k == 0 || result[k-1] != arr1[i]){

                result[k++] = arr1[i];
            }
            i++;
            j++;
        }

        // trim the original array
        return Arrays.copyOf(result,k);

    }

    static void main() {

        // Array not sorted, use set
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        IO.println(Arrays.toString(findIntersection(nums1,nums2)));

        int[] nums3 = {4,9,5}, nums4 = {9,4,9,8,4};
        IO.println(Arrays.toString(findIntersection(nums3,nums4)));


        // Array is sorted, use two pointer
        int[] nums5 = {1,1,2,2}, nums6 = {2,2};
        IO.println(Arrays.toString(intersectionOfArray(nums5,nums6)));

        int[] nums7 = {4,5,9}, nums8 = {4,4,8,9,9};
        IO.println(Arrays.toString(intersectionOfArray(nums7,nums8)));


    }
}
