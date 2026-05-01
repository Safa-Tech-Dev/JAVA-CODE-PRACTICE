package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArray {

    // Using set
    public static List<Integer> findUnion(int[] arr1, int[] arr2){

        Set<Integer> seen = new HashSet<>();

        for(int i : arr1){

            seen.add(i);
        }
        for(int j : arr2){
            seen.add(j);
        }

        return new ArrayList<>(seen);
    }

    static void main() {

        int[] arr1 = {1,2,2,3,5};
        int[] arr2 = {1,2,3,4,5,6};

        IO.println(findUnion(arr1,arr2));
    }
}
