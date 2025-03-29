package DSA_by_Java.Arraydsaques.java;

public class rotate_array {
    class Solution {
        public void rotate(int[] nums, int k) {
            Rotate(nums, k);
        }
        public static void Rotate(int []nums, int k){
         reverse(nums,0,nums.length-1);
         reverse(nums,k,nums.length-1);
        reverse(nums,0,k-1);
    
    
            
        }
         public static void reverse(int []arr, int i, int j){
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
