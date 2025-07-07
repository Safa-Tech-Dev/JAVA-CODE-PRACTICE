package JavaPractice.src.com.safatech.string;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterUsingMap {

    public static Set<Character> getDuplicateCharacter(String str){

        Set<Character> duplicates = new LinkedHashSet<>(); // LinkedHashSet() to maintain the order
        Map<Character, Integer> chCount = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            if(chCount.containsKey(str.charAt(i))){
                chCount.put(str.charAt(i), chCount.get(str.charAt(i)) + 1);
            }else{
                chCount.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : chCount.entrySet()){

            if(entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {

        String s1 = "codedecode";
        String s2 = "saddam";
        String s3 = "farheen";
        System.out.println(getDuplicateCharacter(s1));
        System.out.println(getDuplicateCharacter(s2));
        System.out.println(getDuplicateCharacter(s3));
    }
}
