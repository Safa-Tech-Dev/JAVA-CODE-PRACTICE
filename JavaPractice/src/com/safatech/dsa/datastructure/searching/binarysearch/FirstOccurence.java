package JavaPractice.src.com.safatech.dsa.datastructure.searching.binarysearch;

public class FirstOccurence {

     public static int firstOccurence(int[] nums, int x){

         int n = nums.length;
         int start = 0, end = n - 1;
         int result = -1;

         while (start <= end){

             int mid = start + (end - start)/2;

             if(x == nums[mid]){

                 result = mid;
                 end = mid - 1;
             } else if (x < nums[mid]) {
                 end = mid - 1;
             }else{
                 start = mid + 1;
             }
         }
         return result;
     }
    public static void main(String[] args) {

         int[] nums = {3,4, 13,13,13,20,40};
         int target = 13;
        System.out.println(firstOccurence(nums, target));
    }
}
