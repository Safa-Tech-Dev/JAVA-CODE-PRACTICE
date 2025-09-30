package JavaPractice.src.com.safatech.string;

public class LeftRotation {

    public static String rotateLeft(String str, int rotationFactor){

        /**
         *  decode
         * substring(rotationFactor) + substring(0,rotationFactor)
         * code   + de = codede
         */

        String rotatedString = str.substring(rotationFactor) + str.substring(0, rotationFactor);
        return rotatedString;
    }
    public static void main(String[] args) {

        System.out.println(rotateLeft("decode",2));
    }
}
