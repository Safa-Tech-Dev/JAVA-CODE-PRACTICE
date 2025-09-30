package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch;

/**
 * 69. Sqrt(x)
 */
public class SquarRoot {

    /**
     *  Brute force
     *  T.C = O(n), S.C = O(1)
     * @param x
     * @return
     */
    public static int sqrt1(int x){

        int result = 0;

        for(long i = 1; i <= x; i++){

            long value = i * i;

            if(value <= (long) x){

                result = (int)i;
            }else{
                break;
            }
        }
        return result;
    }

    /**
     * using built-in sqrt method
     * @param x
     * @return
     */
    public static int sqrt2(int x){

        return (int) Math.sqrt(x);
    }

    /**
     * Binary Search approach
     * T.C = O(log n), S.C = O(10
     * @param x
     * @return
     */
    public static int sqrt3(int x){

        int start = 0,
                end = x,
                result = -1;

        while(start <= end){

            long mid = start + (end - start)/2;

            long value = mid * mid;
            if(value == x){

                return (int) mid;
            }else if(value > x){
                // eliminate right
                // mid ko or small krna hoga
                end = (int)(mid - 1);
            }else{
                result = (int) mid;
                start = (int) (mid + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(sqrt1(8));
        System.out.println(sqrt2(8));
        System.out.println(sqrt3(8));

    }
}
