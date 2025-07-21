package JavaPractice.src.com.safatech.string;


public class ReversedString {

    /*
    Write a program to reverse a word and each character without using inbuilt reverse() method
    */
    public static void getReversedStringAndEachCharacter(String str){

        //in-built reverse method
        StringBuilder sb = new StringBuilder(str);  // Thread Safe
        System.out.println("Using in-built reverse() method : " + sb.reverse());

        StringBuffer bf = new StringBuffer(); // Not-Thread Safe
        for(int i = str.length() - 1; i>=0; i--){

            bf.append(str.charAt(i));
        }
        System.out.println(bf);
    }

        /*
        Reverse the word in string
        */
    public static void getReversedWord(String str){

        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strArray.length - 1; i >= 0 ; i--){
            sb.append(strArray[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        String str = "Safa Tech";
        getReversedStringAndEachCharacter(str);

        String s = "How are you";
        getReversedWord(s);
    }
}
