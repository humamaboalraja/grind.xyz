package xyz.grind.coding.easy

object ProductExceptSelf {
    fun productOfArrayExceptSelfBruteForce(nums: IntArray): IntArray {
        var sumOfProducts = 1
        for (num in nums) {
            sumOfProducts *= num
        }
        val answer = IntArray(nums.size)
        for (i in nums.indices) {
            answer[i] = sumOfProducts / nums[i]
        }
        return answer
    }

    fun productExceptSelfLeftRightProducts(nums: IntArray): IntArray {
        val length = nums.size
        val leftProduct = IntArray(length)
        val rightProduct = IntArray(length)
        val answer = IntArray(length)
        leftProduct[0] = 1
        for (i in 1 until length) {
            leftProduct[i] = nums[i - 1] * leftProduct[i - 1]
        }

        rightProduct[length - 1] = 1
        for (i in length - 2 downTo 0) {
            rightProduct[i] = nums[i + 1] * rightProduct[i + 1]
        }

        for (i in 0 until length) {
            answer[i] = leftProduct[i] * rightProduct[i]
        }
        return answer
    }

    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        answer[0] = 1
        for (i in 1 until nums.size) {
            answer[i] = nums[i - 1] * answer[i - 1]
        }
        var rightProduct = 1
        for (i in nums.size - 1 downTo 0) {
            answer[i] *= rightProduct
            rightProduct *= nums[i]
        }
        return answer
    }

    fun productExceptSelfTwo(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var prefix = 1

        for (i in nums.indices) {
            result[i] = prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] *= postfix
            postfix *= nums[i]
        }

        return result
    }
}
