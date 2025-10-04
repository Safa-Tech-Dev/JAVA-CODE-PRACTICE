package JavaPractice.src.com.safatech.corejava;

/**
 * When checking if a number num is prime, we want to see if it has any divisors other than 1 and itself.
 * Instead of checking all numbers from 2 to num - 1, we only need to check up to √num.
 *
 * 🧠 The Logic:
 * If num has a factor greater than √num, then it must also have a corresponding factor less than √num.
 *
 * For example, if num = 36, and you find that 6 divides it, then 36 ÷ 6 = 6 — both factors are equal to √36.
 *
 * If num = 49, and you check up to 7 (√49), you’ll find 7 × 7 = 49. No need to check beyond 7.
 */
public class PrimeNumber {

    public static boolean checkPrime(int num){

        if(num <= 1){

            return false;
        }

        for(int i = 2; i < Math.sqrt(num); i++){

            if( num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 29;
        if(checkPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
