package com.safatech.java8;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println("Anonymous predicate: " + biPredicate1.test("madam", "madam"));

        BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println("Equals Predicat: " + equalsPredicate.test("madam", "madam"));
        BiPredicate<String, String> lengthPredicate = (s1, s2) -> s1.length() == s2.length();
        boolean andOutput = lengthPredicate.and(equalsPredicate).test("abc", "madam");
        System.out.println("and method: " + andOutput);
        boolean orOutput = lengthPredicate.or(equalsPredicate).test("abc", "def");
        System.out.println("or method: " + orOutput);


    }

}
