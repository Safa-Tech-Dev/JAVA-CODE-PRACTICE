package safatech.com;

import java.io.FileReader;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection {


    public static void main(String[] args) {


        //How can you make an ArrayList read-only
        System.out.println("****** ArrayList Read Only ***********");
        try{
            List<String> l = new ArrayList<>();
            l.add("practice");
            l.add("solve");
            l.add("interview");
            System.out.println("Original list: " + l);
            //unmodifiableList
            List<String> read_only_list = Collections.unmodifiableList(l);
            read_only_list.add("Saddam");
        }catch (UnsupportedOperationException e){
            System.out.println("Exception thrown is: " + e);
        }

        // use of Properties class
        System.out.println("**** Properties Class *******");
        try{
            FileReader file = new FileReader("info.properties");
            Properties obj_file = new Properties();
            obj_file.load(file);
            System.out.println("User: " + obj_file.getProperty("user"));
            System.out.println("password: " + obj_file.getProperty("password"));
        }catch (Exception e ){
            System.out.println("File NotFound" + e);
        }

        // How can you synchronize an ArrayList in Java?
        //method - 1 (Using Collections.synchronizedList() method:)
        System.out.println("****** Synchronized List ********");
        List<String> synchronized_list = Collections.synchronizedList(new ArrayList<>());
        synchronized_list.add("Learn");
        synchronized_list.add("Solve");
        synchronized_list.add("Practice");
        synchronized_list.add("Interview");
        synchronized (synchronized_list){ // Must be declared

            Iterator it = synchronized_list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        //method - 2 (Using CopyOnWriteArrayList)

        //Creating a thread-safe ArrayList
        System.out.println("******* Using CopyOnWriteArrayList ********");
        CopyOnWriteArrayList<String> syn_list = new CopyOnWriteArrayList<>();

        syn_list.add("Learn");
        syn_list.add("Practice");
        syn_list.add("Solve");
        syn_list.add("Interview");

        Iterator<String> it = syn_list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            syn_list.add("Saddam");
        }
        /*
        Write a program in Java to display the contents of a
        HashTable using enumeration.
         */
        System.out.println("*********contents of a HashTable using enumeration*******");
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1","Monday");
        hashtable.put("2","Tuesday");
        hashtable.put("3","Wednesday");
        hashtable.put("4","Thursday");
        hashtable.put("5","Friday");
        hashtable.put("6","Saturday");
        hashtable.put("7","Sunday");
        Enumeration<String> enumeration_hash_table = hashtable.elements();
        while (enumeration_hash_table.hasMoreElements()){
            System.out.println(enumeration_hash_table.nextElement());// not in order

            /*
            program to shuffle all the elements of a collection in Java.
             */
            System.out.println("***** shuffled all the elements of a collection *********");
            ArrayList<String> list = new ArrayList<>();
            list.add("Monday");
            list.add("Tuesday");
            list.add("Wednesday");
            list.add("Thursday");
            list.add("Friday");
            list.add("Saturday");
            list.add("Sunday");
            System.out.println("Before Shuffle : " + list);
            Collections.shuffle(list);
            System.out.println("After Shuffle : " + list);

            /*
            program in Java to clone a Treeset to another Treeset.
             */
            System.out.println("**** Printing clone of TreeSet *****");
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("Monday");
            treeSet.add("Tuesday");
            treeSet.add("Wednesday");
            treeSet.add("Thursday");
            treeSet.add("Friday");
            treeSet.add("Saturday");
            treeSet.add("Saturday");

            System.out.println("Original Set : " + treeSet);
            TreeSet<String> clone_tree_set = (TreeSet<String>) treeSet.clone();
            System.out.println("Cloned Tree Set : " + clone_tree_set);

            /*
            Write a program in java to get the collection view of the
            values present in a HashMap.
             */
            System.out.println("*********Printing Collection view of HashMap ***********");
            HashMap<String,String> map = new HashMap<>();
            map.put("1","Monday");
            map.put("2","Tuesday");
            map.put("3","Wednesday");
            map.put("4","Thursday");
            map.put("5","Friday");
            map.put("6","Saturday");
            map.put("7","Sunday");
            System.out.println("Original HashMap : " + map);
            System.out.println("Collection HashMap : " + map.values());

            /*
            Write a program in java to join two arraylists into one
            arraylist.
             */
            System.out.println("***** join two arraylists into one arraylist *******");
            ArrayList<String> list_1 = new ArrayList<>();
            list_1.add("Monday");
            list_1.add("Tuesday");
            list_1.add("Wednesday");
            list_1.add("Thursday");
            System.out.println("Printing 1st ArrayList : " + list_1);

            ArrayList<String> list_2 = new ArrayList<>();
            list_2.add("Friday");
            list_2.add("Saturday");
            list_2.add("Sunday");
            System.out.println("Printing 2nd ArrayList : " + list_2);

            ArrayList<String> joined_list = new ArrayList<>();
            joined_list.addAll(list_1);
            joined_list.addAll(list_2);
            System.out.println("Printing joined ArrayList : " + joined_list);
        }
     }
}
