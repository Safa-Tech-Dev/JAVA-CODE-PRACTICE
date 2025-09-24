package JavaPractice.src.com.safatech.corejava;

import java.util.Arrays;

public class RerverseArray {

    public static void reverseArray(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n/2; i++){

            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
    }
}
