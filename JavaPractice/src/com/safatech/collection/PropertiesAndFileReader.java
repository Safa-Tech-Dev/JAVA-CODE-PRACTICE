package JavaPractice.src.com.safatech.collection;

import java.io.FileReader;
import java.util.Properties;

/**
 * use of Properties class, Properties is a subclass of HashTable
 * public class Properties extends Hashtable<Object,Object>
 */
public class PropertiesAndFileReader {

    public static void main(String[] args) {

        try{

            FileReader file = new FileReader("JavaPractice/info.properties");
            Properties info_property = new Properties();
            info_property.load(file);
            System.out.println("User: " + info_property.getProperty("user"));
            System.out.println("Password: " + info_property.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
