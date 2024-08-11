package com.safatech.java17;

public class Java17 {
    public static void main(String[] args) {

        //Switch Statements Since Java 12
        System.out.println(Java17.getDayOfWeek(5));

        //Java 17
        String day = "Sunday";
        String result = "";
        switch (day){
            case "Saturday", "Sunday" -> result = "6am";
            case "Monday" -> result = "7am";
            default -> result = "8am";
        }
        System.out.println(result);

        //another way
        result = switch (day){
            case "Saturday", "Sunday" ->   "6am";
            case "Monday" -> "7am";
            default -> "8am";
        };
        System.out.println(result);

       //Switch Statements Since Java 12 preview version

        result = switch (day){
            case "Saturday", "Sunday": yield  "6am";
            case "Monday": yield "7am";
            default: yield "8am";
        };
        System.out.println(result);

    }
    //Switch Statements Since Java 12
    public static String getDayOfWeek(int dayNum){
        return switch (dayNum){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };


    }
}
