package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static int getMostFrequentElement(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        for (int el : arr){
            if(!map.containsKey(el))    {
                map.put(el, 1);
            }else{
                map.put(el, map.get(el) + 1);
            }
        }
    }
    public static void main(String[] args) {


    }
}
