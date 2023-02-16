package xyz.grind.coding.easy

import java.util.*

object _ContainsDuplicate {
    // Time: O(n), Space: O(1)
    fun containsDuplicateBruteForce(nums: IntArray): Boolean {
        for (i in nums.indices) {
            for (j in 0 until i) {
                if (nums[i] == nums[j]) return true
            }
        }
        return false
    }

    // Time: O(nlogn), Space: O(1)
    fun containsDuplicateSorting(nums: IntArray): Boolean {
        Arrays.sort(nums)
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) return true
        }
        return false
    }

    // Time: O(n), Space: O(n)
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>(nums.size)
        for (number in nums) {
            if (set.contains(number)) return true
            set.add(number)
        }
        return false
    }
}
