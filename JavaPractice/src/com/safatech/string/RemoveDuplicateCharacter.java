package JavaPractice.src.com.safatech.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

      /*
      Remove the duplicates character from the string and print the string
      */
    public static void getRemovedString(String str){

        Set<Character> characterSet = new LinkedHashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!characterSet.contains(ch)){
                characterSet.add(ch);
                sb.append(ch);
            }
        }
        System.out.println("Duplicate Removed Set : " + characterSet);
        System.out.println("Duplicaate Removed String " + sb);
    }
    public static void main(String[] args) {

        String str = "Saddam";
        getRemovedString(str);
    }
}
