package JavaPractice.src.com.safatech.string;

import java.util.HashSet;
import java.util.Set;

/*
Printing Isogram or not(Which does not contain any duplicate characters)
*/
public class CheckIsogram {

    public static void main(String[] args) {

        String str = "codedecode";
        System.out.println(isIsogram(str));
        String str1 = "sky";
        System.out.println(isIsogram(str1));

    }

    public static boolean isIsogram(String str){

        char[] charArray = str.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        boolean isogram = true;
        for( Character c : charArray){

            if(characterSet.contains(c)){
                isogram = false;
            }else{
                characterSet.add(c);
            }
        }
        return isogram;
    }
}
