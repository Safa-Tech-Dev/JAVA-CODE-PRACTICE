package JavaPractice.src.com.safatech.dsa.datastructure.searching;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Calculate the age of Person
 */
public class AgeOfPerson {

    public static void main(String[] args) {

        String dateOfBirth = "20-04-1997";
        calculateAge(dateOfBirth);
    }

    private static void calculateAge(String dateOfBirth) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate doj = LocalDate.parse(dateOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(doj, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        System.out.println("Age of the person is: " + years + " Years, " + months + " Months, " + days + " Days " );
    }
}
