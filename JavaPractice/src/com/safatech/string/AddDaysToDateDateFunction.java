package JavaPractice.src.com.safatech.string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddDaysToDateDateFunction {

    public static String addDaysToDate(String stringDate, int addDays){

        // Define the date pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");

        // Parse string to LocalDate
        LocalDate date = LocalDate.parse(stringDate, formatter);

        // Add days
        LocalDate newDate = date.plusDays(addDays);

        // Format back to string
        return newDate.format(formatter);
    }

    static void main() {

        // Test cases: {inputDate, daysToAdd, expectedOutput}
        Object[][] testCases = {
                {"20-04-1997", 5, "25-04-1997"},
                {"20-04-1997", 15, "05-05-1997"},
                {"28-02-2020", 1, "29-02-2020"},   // Leap year
                {"28-02-2021", 1, "01-03-2021"},   // Non-leap year
                {"31-12-2023", 1, "01-01-2024"},   // New year
                {"15-01-2024", 45, "29-02-2024"},  // Leap year Feb end
                {"15-01-2023", 45, "01-03-2023"},  // Normal year Feb end
                {"01-03-2020", -1, "29-02-2020"},  // Negative days
                {"31-01-2023", 28, "28-02-2023"},  // Month end
                {"30-06-2023", 365, "29-06-2024"}  // Full year ahead
        };

        int passed = 0;

        System.out.println("🧪 Running Date Addition Test Cases...");
        System.out.println("---------------------------------------------------------");

        for (Object[] test : testCases) {
            String inputDate = (String) test[0];
            int daysToAdd = (int) test[1];
            String expected = (String) test[2];

            String result = addDaysToDate(inputDate, daysToAdd);
            boolean isPass = result.equals(expected);

            System.out.printf("Input: %-10s  +%-4d  → Output: %-10s  [%s]\n",
                    inputDate, daysToAdd, result, isPass ? "✅ PASS" : "❌ FAIL (" + expected + ")");

            if (isPass) passed++;
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("✅ Passed %d / %d test cases.\n", passed, testCases.length);
    }
}
