package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * program to reverse each letter of a word of string
 */
public class ReverseEachLetterOfString {

    public static void getReversedEachLetterOfWord(String s){

        List<String> reversedWord = Arrays.stream(s.split(" "))
                .map(word -> new StringBuffer(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedWord);

    }
    public static void main(String[] args) {

        String inputString = "Hello World this is Java";
        getReversedEachLetterOfWord(inputString);
    }
}
