package com.safatech.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {


    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BiFunction biFunction = new BiFunctionExample();
        List<Integer> list1 = Stream.of(1,2,3,4,5,6,7,9,19).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(1,2,3,4,5,6,7,43,67,9,19).collect(Collectors.toList());
        System.out.println("Traditional approach: " + biFunction.apply(list1, list2));

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
                return Stream.of(list1, list2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("Anonymous approach: " + biFunction1.apply(list1, list2));


         BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = (l1, l2) -> {
            return Stream.of(list1, list2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        Function<List<Integer>, List<Integer>> sortdList = (lists) -> lists
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("method chaininng Lambda approach : " + biFunction2.andThen(sortdList).apply(list1, list2));
//        System.out.println("Lambda approach : " + biFunction2.apply(list1, list2));

        Map<String,Integer> map = new HashMap<>();
        map.put("saddam",5000);
        map.put("Asif",15000);
        map.put("saif",12000);

        BiFunction<String, Integer, Integer> increaseSalaryBiFunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value + 1000;
            }
        };
//        map.replaceAll(increaseSalaryBiFunction);

        BiFunction<String, Integer, Integer> increaseSalaryLambdaBiFunction = (key,  value) ->  value + 2000;

//        map.replaceAll(increaseSalaryLambdaBiFunction);
        map.replaceAll( (key,  value) ->  value + 3000);

        System.out.println(map);
    }

}
