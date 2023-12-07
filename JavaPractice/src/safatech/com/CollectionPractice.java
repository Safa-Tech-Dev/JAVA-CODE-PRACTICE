package safatech.com;

import javax.sound.midi.Soundbank;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class CollectionPractice {


    public static void main(String[] args) {

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

        try{
            FileReader file = new FileReader("info.properties");
            Properties obj_file = new Properties();
            obj_file.load(file);
            System.out.println("User: " + obj_file.getProperty("user"));
            System.out.println("password: " + obj_file.getProperty("password"));
        }catch (Exception e ){
            System.out.println("File NotFound" + e);
        }
    }
}
