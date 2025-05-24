package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;

public class MoveZeroesToTheEnd {

    public static int[] moveZeroes(int[] arr){
        int left = 0; // initialize left pointer, for placing non-zero element

        for (int right = 0; right < arr.length; right++){
            // Swap if right pointer finds a non-zero element
            if(arr[right] != 0){
                // swap if necessary
                if(left != right){

                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                    left++; // move left pointer forward
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
