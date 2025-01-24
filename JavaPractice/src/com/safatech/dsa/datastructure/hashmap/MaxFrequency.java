package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static int getMaxFreuencyElement(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        for (int el : arr){
            if(!map.containsKey(el))    {
                map.put(el, 1);
            }else{
                map.put(el, map.get(el) + 1);
            }
        }
        int maxFreq  = 0; int ansKey = -1;
        for(var el : map.entrySet()){
            if(el.getValue() > maxFreq){
                maxFreq = el.getValue();
                ansKey = el.getKey();
            }
        }
        return ansKey;
    }
    public static void main(String[] args) {

        int[] arr = {2,3,1,2,7,1,4,6,6,7,8,7,7,5,4,3,7,4,3,4,7};
        System.out.println(getMaxFreuencyElement(arr));

    }
}
