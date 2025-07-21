package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

/**
 * A palindrome is a word, number, phrase, or sequence that reads the same forwards and backwards
 *
 * madam, level, civic, radar
 *
 * 121,1331, 12321,9889
 */
public class Palindrome {

    public static boolean getPalindrome(String s){

        String str = s.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

//        String s = "Madam";
        String s = "Java";

        if(getPalindrome(s)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrome");
        }
    }

}
