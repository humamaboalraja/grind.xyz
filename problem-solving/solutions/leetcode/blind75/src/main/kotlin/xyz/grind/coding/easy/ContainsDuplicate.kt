package xyz.grind.coding.easy

import java.util.Arrays

object ContainsDuplicate {
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
        val duplicates = HashSet<Int>(nums.size)

        for (number in nums) {
            if (duplicates.contains(number)) return true
            duplicates.add(number)
        }
        return false
    }

    fun containsDuplicateFunctional(nums: IntArray): Boolean {
        val duplicates = HashSet<Int>(nums.size)
        nums.forEach {
            when {
                duplicates.contains(it) -> return true
                else -> duplicates.add(it)
            }
        }
        return false
    }
}
