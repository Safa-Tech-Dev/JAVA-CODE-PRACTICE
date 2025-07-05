package JavaPractice.src.com.safatech.dsa.datastructure.searching.linearsearch;

/**
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * Useful: When array is not sorted and small size array
 */
public class LinearSearch {

    public static int getLinearSearch(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target) {
                return i; // found at index i
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 2, 9};
        int target = 7;
        int result = getLinearSearch(arr, target);
        if(result != -1){
            System.out.println("Target found at index " + result);
        }else{
            System.out.println("Target not found" );
        }

    }
}
