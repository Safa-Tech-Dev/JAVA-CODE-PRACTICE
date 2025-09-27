package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch;

/**
 * 704. Binary Search
 * Array must be sorted
 * Time Complexity : O(logn)
 */
public class BinarySearch {

    public static int getBinarySearch(int[] arr, int target){

        int n = arr.length;
        int  start = 0;
        int end = n - 1;
        while (start <= end){

            // To avoid Integer overflow
            int  mid = start + (end -  start)/2;
            // if target met return mid
            if(target == arr[mid]){
                return mid;
                // if  target is  smaller, search in left half of array. move end to left
            }else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // not found
    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int target){

        if(start > end){ // base case
            return -1;
        }
        int mid = start + (end - start)/2; // find the middle of value
        if(target == arr[mid]){
            return mid; // target found
        }else if(target < arr[mid]){
            end = mid - 1;
            return recursiveBinarySearch(arr, start, end, target);
        }else {
            start = mid + 1;
            return recursiveBinarySearch(arr, start, end, target);
        }
    }
    public static void main(String[] args) {

        int[] arr = {4,6,8,5,1,2,10,11};
        int target = 10;
//        int result = getBinarySearch(arr, target);
        int result = recursiveBinarySearch(arr,0, arr.length - 1, target);
        if(result != -1){
            System.out.println("Target found at index: " + result);
        }else {
            System.out.println(" Target not found");
        }
    }
}
