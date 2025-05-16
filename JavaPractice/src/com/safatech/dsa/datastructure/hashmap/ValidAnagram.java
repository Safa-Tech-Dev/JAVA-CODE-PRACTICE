package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    static Map<Character, Integer> makeFrequencyMap(String s){

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int currentFrequency = map.get(ch);
                map.put(ch, currentFrequency + 1);
            }
        }
        return map;
    }

    static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;
        Map<Integer, Integer> map1 = makeFrequencyMap(s);
        Map<Integer, Integer> map2 = makeFrequencyMap(t);
        return map1.equals(map2);
    }

    public static void main(String[] args) {

    }
}
