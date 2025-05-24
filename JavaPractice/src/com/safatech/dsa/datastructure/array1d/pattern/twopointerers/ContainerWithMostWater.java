package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

public class ContainerWithMostWater {

    // Brute force
    public static int getMostWater(int[] height){


        int mostWater = 0;
        for(int i = 0; i < height.length; i++){

            for (int j = i + 1; j < height.length; j++){

                int width = j - i;
                int ht = Math.min(height[i], height[j]);
                int currentWater = width * ht;
                mostWater = Math.max(mostWater, currentWater);
            }
        }
        return mostWater;
    }

    // Two Pointer approach(Optimal)

    public static int getMostWater1(int[] height){

        int n = height.length;
        int left = 0, right = n - 1;
        int mostWater = 0;
        while (left < right){

            int w = right - left;
            int h = Math.min(height[right], height[left]);
            int curWater = w * h;
            mostWater = Math.max(mostWater, curWater);

            if (height[left] < height[right]){

                left++;
            }else{
                right--;
            }
        }
        return mostWater;
    }

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(getMostWater(height));
        System.out.println(getMostWater1(height));
    }
}
