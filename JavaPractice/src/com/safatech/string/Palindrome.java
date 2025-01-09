package JavaPractice.src.com.safatech.string;

/*
Check the String is Palindrome or not
1.reverse the string and check with the original string
2. if contains equal , palindrom otherwise not palindrom
*/
public class Palindrome {

    public static String getReversedString(String str){

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString(); // toString() is used to convert stringBuilder to String
        return reversed;
    }
    public static void main(String[] args) {

//        String originalString = "Mom";
        String originalString = "java";

        if(originalString.equalsIgnoreCase(getReversedString(originalString))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
