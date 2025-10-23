package JavaPractice.src.com.safatech.string;

public class RemoveSpacialCharacters {

    public static String removeSpacialCharacters(String s){

        // Keep only letters, numbers, and spaces
        return s.replaceAll("[^a-zA-Z0-9 ]", "");
    }
    static void main() {

        String input = "He@llo! J#av$a 123%";
        IO.println(removeSpacialCharacters(input));
    }
}
