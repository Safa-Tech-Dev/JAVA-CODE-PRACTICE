package JavaPractice.src.com.safatech.collection;

import java.util.Set;
import java.util.TreeSet;

public class ClonedTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Saturday");
        treeSet.add("Sunday");
        treeSet.add("Monday");
        treeSet.add("Tuesday");
        treeSet.add("Wednesday");
        treeSet.add("Thursday");
        treeSet.add("Friday");
        treeSet.add("Friday");
        System.out.println("Original TreeSet: " + treeSet);

        TreeSet<String> cloned_TreeSet = (TreeSet<String>) treeSet.clone();
        System.out.println("Cloned TreeSet: " + treeSet);
    }
}
