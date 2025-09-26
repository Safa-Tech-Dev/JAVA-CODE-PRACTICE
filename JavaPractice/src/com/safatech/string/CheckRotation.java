package JavaPractice.src.com.safatech.string;

/**
 * method to Check For Rotation of String
 */
public class CheckRotation {

    public static boolean checkRotation(String originalString, String toBeChecked){


        if(originalString == null || toBeChecked == null){

            return false;
        }
        String doubled = originalString + originalString;
        return doubled.contains(toBeChecked);

    }
    public static void main(String[] args) {

        String originalString = "decode";
        String toBeChecked = "codede";
        System.out.println(checkRotation(originalString, toBeChecked));

        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(checkRotation(str1, str2));
    }
}
