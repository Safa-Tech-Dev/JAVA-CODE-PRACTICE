package JavaPractice.src.com.safatech.java8;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;

/**
 * Java 8 Program to Print 10 random numbers using forEach
 */
public class Print10Random {

    public static void main(String[] args) {

        // Generate 10 random from 0 to 9
        Random random = new Random();
        random.ints(10,0, 10)
                .forEach(e -> System.out.print(e + " "));

        // Generate Random no limit to 10
        random.ints().limit(10).forEach(System.out::println);
    }

}
