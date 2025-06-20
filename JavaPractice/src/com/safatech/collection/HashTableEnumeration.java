package JavaPractice.src.com.safatech.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 Write a program in Java to display the contents of a
 HashTable using enumeration.
 The Element will be printed in random order.
 */
public class HashTableEnumeration {


    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("1", "Saturday");
        hashtable.put("2", "Sunday");
        hashtable.put("3", "Monday");
        hashtable.put("4", "Tuesday");
        hashtable.put("5", "Wednesday");
        hashtable.put("6", "Thursday");
        hashtable.put("7", "Friday");

        Enumeration<String> stringEnumeration = hashtable.elements();
        while (stringEnumeration.hasMoreElements()){
            System.out.println(stringEnumeration.nextElement());
        }
    }
}
