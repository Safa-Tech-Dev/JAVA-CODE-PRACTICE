package com.safatech.string;

import java.util.Arrays;
import java.util.List;

public class JoinMethod {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1","2","3","4","5");
        String joined = String.join("-", numbers);
        System.out.println(joined);

    }
}
