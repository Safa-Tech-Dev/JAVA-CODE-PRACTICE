package com.safatech.dsa.datastructure.hashmap;

import java.util.*;

/**
 * Given two arrays of strings list1 and list2, find the common strings with the least index sum.
 * A common string is a string that appeared in both list1 and list2.
 * A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
 * Return all the common strings with the least index sum. Return the answer in any order.
 *
 *  Example 1
 * Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"],
 * list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only common string is "Shogun".
 * 
 * Example 2:
 * Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
 * Output: ["Shogun"]
 * Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
 *
 * Example 3:
 * Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
 * Output: ["sad","happy"]
 * Explanation: There are three common strings:
 * "happy" with index sum = (0 + 1) = 1.
 * "sad" with index sum = (1 + 0) = 1.
 * "good" with index sum = (2 + 2) = 4.
 * The strings with the least index sum are "sad" and "happy".
 */
public class MinIndexSum {

    public static void main(String[] args) {

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] commonRestaurant1 = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(commonRestaurant1));

        String[] list3 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list4 = {"KFC","Shogun","Burger King"};
        String[] commonRestaurant2 = findRestaurant(list3, list4);
        System.out.println(Arrays.toString(commonRestaurant2));
        String[] list5 = {"happy","sad","good"};
        String[] list6 = {"sad","happy"};
        String[] commonRestaurant3 = findRestaurant(list5, list6);
        System.out.println(Arrays.toString(commonRestaurant3));
    }
    public static String[] findRestaurant(String[] list1, String[] list2){

        // Create a map to store the restaurants from list2 with their indices.
        Map<String,Integer> map = new HashMap<>();

        // Populate the map with the restaurants from list2.
        for(int i = 0; i< list2.length; i++){

            map.put(list2[i], i);
        }
        // Create a list to store the answer.
        List<String> result = new ArrayList<>();
        // Initialize minimum index sum with a large number.
        int minIndexSum = Integer.MAX_VALUE;

        // Iterate through the list1 to find common restaurants with minimum index sum.
        for(int i = 0; i< list1.length; i++){

            // If the current restaurant is in list2,
            if(map.containsKey(list1[i])){
                // Calculate the index sum.
                int currentMinSum = i + map.get(list1[i]);
                // If the index sum is smaller than the minimum found so far,
                if(currentMinSum < minIndexSum){
                    // Start a new list as we found a restaurant with a smaller index sum.
                    result = new ArrayList<>();
                    // Add this restaurant to the list.
                    result.add(list1[i]);
                    // Update the minimum index sum
                    minIndexSum = currentMinSum;
                    // If the index sum is equal to the current minimum, add the restaurant to the list.
                } else if (minIndexSum == currentMinSum) {
                    result.add(list1[i]);
                }

            }
        }
        // Return the list as an array1d
        return result.toArray(new String[0]);

    }
}
