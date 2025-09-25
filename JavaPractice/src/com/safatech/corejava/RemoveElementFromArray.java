package JavaPractice.src.com.safatech.corejava;

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
    public static void main(String[] args) {

        int[] originalArray = {1,2,3,4,5};
        int elementToRemove = 3;
        System.out.println(Arrays.toString(remove(originalArray,elementToRemove)));
    }
}
