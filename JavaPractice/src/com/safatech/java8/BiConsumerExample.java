package com.safatech.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, Integer> {

    @Override
    public void accept(String s, Integer i) {

        System.out.println("input 1: " + s +", input2: " +i);

    }
    public static void main(String[] args) {

        BiConsumer<String, Integer> biConsumer = new BiConsumerExample();
        biConsumer.accept("Tradition approach",65000);

        BiConsumer<String, Integer> biConsumer1 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println("input 1: " + s +", input2: " +i);
            }
        };
        biConsumer1.accept("Anomymous approach",65000);


        BiConsumer<String, Integer> biConsumer2 = (s, i) -> System.out.println("input 1: " + s +", input2: " +i);

        biConsumer2.accept("Lambda approach",443);

        Map<String,Integer> map = new HashMap<>();
        map.put("saddam",5000);
        map.put("Asif",15000);
        map.put("saif",12000);
//        map.forEach(biConsumer2);
        map.forEach((k, v) -> System.out.println("key: " + k +" , " + " value: " +v));
    }

}
