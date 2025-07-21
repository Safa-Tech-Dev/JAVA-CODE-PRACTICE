package JavaPractice.src.com.safatech.string;

/*
Write a program to print the even length string
e.g Hell world we lol
o/p - hell , we
 */
public class EvenString {

    public static void getEvenString(String originalString){

        String[] strArray = originalString.split(" ");
        for(String s : strArray){
            if(s.length() % 2 == 0){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        String givenString = " Hell World We lol";
        getEvenString(givenString);
    }
}
