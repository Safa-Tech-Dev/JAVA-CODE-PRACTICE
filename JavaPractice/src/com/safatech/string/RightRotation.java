package JavaPractice.src.com.safatech.string;

public class RightRotation {

    public static void rotateRight(String str, int rotationFactor){

         /* decode
        partition(p) = length of string(l) - rotationFactor(r) = 6 - 2 = 4
        sub(p) + sub(0,p)
        de + deco = dedeco
         */
        int partition = str.length() - rotationFactor;

        String rotatedString = str.substring(partition) + str.substring(0,partition);
        System.out.println(rotatedString);
    }

    public static void main(String[] args) {

        rotateRight("decode",2);
    }
}
