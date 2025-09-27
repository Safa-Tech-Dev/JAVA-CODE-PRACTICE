package JavaPractice.src.com.safatech.dsa.datastructure.array1d;

import java.util.Arrays;

public class SmallestNLargestElement {

    public static int[] smallestNLargestElement (int[] arr){

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static int getLargest(int[] arr){

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,3,5,6,8,9};
        System.out.println(Arrays.toString(smallestNLargestElement(arr)));
        System.out.println(getLargest(arr));

    }
}
