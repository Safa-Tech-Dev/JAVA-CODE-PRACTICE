package JavaPractice.src.com.safatech.collection;

import java.util.HashMap;
import java.util.Map;
/**
Write a program in java to get the collection view of the
values present in a HashMap.
*/
public class CollectionViewOfMap {

    public static void main(String[] args) {

        Map<String, String> days = new HashMap<>();
        days.put("1", "Saturday");
        days.put("2", "Sunday");
        days.put("3", "Monday");
        days.put("4", "Tuesday");
        days.put("5", "Wednesday");
        days.put("6", "Thursday");
        days.put("7", "Friday");
        System.out.println("Original Map: " + days);
        System.out.println("Collection View Of Map: " + days.values());
    }
}
