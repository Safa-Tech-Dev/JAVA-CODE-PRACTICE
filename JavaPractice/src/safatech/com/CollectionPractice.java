package safatech.com;

import javax.sound.midi.Soundbank;
import java.io.FileReader;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionPractice {


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
     }
}
