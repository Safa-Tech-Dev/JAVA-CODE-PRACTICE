package JavaPractice.src.com.safatech.string;

public class AddDaysToDateWithoutDateFunction {


    // Function to add days without using built-in date API
    public static String addDays(String dateStr, int daysToAdd){

        String[] parts = dateStr.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        while (daysToAdd > 0){

            int daysInMonth = getdaysInMonth(month, year);
            int remainingDays = daysInMonth - day;

            if(daysToAdd > remainingDays){
                // Move to next month
                daysToAdd -= (remainingDays + 1);
                day = 1; // set first day of month
                month++;
                if(month > 12){
                    month = 1; // first month of the year
                    year++;
                }
            }else{
                day += daysToAdd;
                daysToAdd = 0;
            }
        }
        // Format output
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    // Returns number of days in given month/year
    private static int getdaysInMonth(int month, int year) {

        switch (month){

            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw  new IllegalArgumentException("Invalid month : " + month);
        }
    }
    // Leap year logic
    private static boolean isLeapYear(int year) {

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        test("20-04-1997", 5, "25-04-1997");
        test("20-04-1997", 15, "05-05-1997");
        test("28-02-2020", 1, "29-02-2020");   // Leap year
        test("28-02-2021", 1, "01-03-2021");   // Non-leap
        test("31-12-2023", 1, "01-01-2024");
        test("15-01-2024", 45, "29-02-2024");  // Leap year Feb
        test("15-01-2023", 45, "01-03-2023");  // Normal year Feb
    }
    // Test helper
    public static void test(String date, int add, String expected) {
        String result = addDays(date, add);
        System.out.printf("Input: %s +%-3d → Output: %s  [%s]\n",
                date, add, result, result.equals(expected) ? "✅ PASS" : "❌ FAIL (Expected: " + expected + ")");
    }

}
