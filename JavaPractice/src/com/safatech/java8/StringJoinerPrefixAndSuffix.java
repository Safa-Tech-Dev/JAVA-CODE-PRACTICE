package JavaPractice.src.com.safatech.java8;

import java.util.StringJoiner;

/**
 * write a program in java to add prefix and suffix in a given String
 */
public class StringJoinerPrefixAndSuffix {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "$", "$");
        joiner.add("Java");
        joiner.add("Interview");
        joiner.add("Question");
        System.out.println(joiner);
    }
}
