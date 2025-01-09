package JavaPractice.src.com.safatech.dsa.datastructure.array1d;

import java.util.Arrays;

public class RemoveElement {

     public static int[] remove(int[] arr, int elementToRemove){

         int[] newArray = new int[arr.length - 1];
         int index = 0;
         for(int i = 0; i< arr.length; i++){
             if(arr[i] != elementToRemove){
                 newArray[index] = arr[i];
                 index++;
             }
         }
         return newArray;
     }
    public static void main(String[] args) {

        int[] originalArray = {1,2,3,4,5};
        int elementToRemove = 3;
        System.out.println("Original Array " + Arrays.toString(originalArray));
        System.out.println("Element removed: " + Arrays.toString(remove(originalArray,elementToRemove)));

    }
}
