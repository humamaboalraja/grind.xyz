package xyz.grind.coding.easy;

import java.util.Arrays;

public class ProductExceptSelf {

   public static int[] productOfArrayExceptSelfBruteForce(int[] nums) {
      int sumOfProducts = 1;

      for(int num : nums) {
         sumOfProducts = sumOfProducts * num;
      }

      int[] answer = new int[nums.length];
      for(int i = 0; i < nums.length; i++) {
         answer[i] = sumOfProducts / nums[i];
      }

      return answer;
   }

   public static int[] productExceptSelfLeftRightProducts(int[] nums) {

      int length = nums.length;

      int[] leftProduct = new int[length];
      int[] rightProduct = new int[length];

      int[] answer = new int[length];

      leftProduct[0] = 1;
      for (int i = 1; i < length; i++) {

         leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
      }

      rightProduct[length - 1] = 1;
      for (int i = length - 2; i >= 0; i--) {

         rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
      }

      for (int i = 0; i < length; i++) {
         answer[i] = leftProduct[i] * rightProduct[i];
      }

      return answer;
   }



   public static int[] productExceptSelf(int[] nums) {
      int length = nums.length;

      int[] answer = new int[length];

      answer[0] = 1;
      for (int i = 1; i < length; i++) {
         answer[i] = nums[i - 1] * answer[i - 1];
      }


      int rightProduct = 1;
      for (int i = length - 1; i >= 0; i--) {

         answer[i] = answer[i] * rightProduct;
         rightProduct *= nums[i];
      }

      return answer;
   }

}
