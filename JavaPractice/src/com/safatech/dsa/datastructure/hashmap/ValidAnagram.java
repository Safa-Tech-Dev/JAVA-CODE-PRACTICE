package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

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

    // Taking more space as we are using two Map
    static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map1 = makeFrequencyMap(s);
        Map<Character, Integer> map2 = makeFrequencyMap(t);
        return map1.equals(map2);
    }
    // Space Optimized
    static boolean isAnagram1(String s, String t){

        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map = makeFrequencyMap(s);

        for(int i = 0; i < t.length(); i++){

            Character ch = t.charAt(i);
            if(!map.containsKey(ch))
                return false;
            int currentFrequency = map.get(ch);
            map.put(ch, currentFrequency - 1);
        }
        // All valuse in map should be zero for s and t to be anagrams
        for(Integer i : map.values()){
            if(i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram1(s1,t1)); // true
        System.out.println(isAnagram1(s2,t2)); // false


    }
}
