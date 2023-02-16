package xyz.grind.coding.easy;

import java.util.Arrays;
import java.util.HashSet;

public class _ContainsDuplicate {

    // Time: O(n), Space: O(1)
    public static boolean containsDuplicateBruteForce(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    // Time: O(nlogn), Space: O(1)
    public static boolean containsDuplicateSorting(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    // Time: O(n), Space: O(n)
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for(int number : nums) {
            if(set.contains(number)) return true;
            set.add(number);
        }
        return false;
    }
}
