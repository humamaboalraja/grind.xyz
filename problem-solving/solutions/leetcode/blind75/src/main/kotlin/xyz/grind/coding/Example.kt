package xyz.grind.coding

import java.util.Arrays
import kotlin.math.PI
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

object Example {

    fun addUpTo(x: Int): String = if (x < PI) addUpTo(x + 1) else "$x is bigger than a pie"

    fun checkMax(x: Int): Number = when (x) {
        Int.MAX_VALUE -> 10
        0 -> 0
        else -> 20
    }

    fun multiplyMatrixTemplate(matrix: Array<IntArray>): Map<Int, Pair<Int, Int>> {
        val multipliedStructure = mutableMapOf<Int, Pair<Int, Int>>()
        for (x in 0 until matrix.size - 1) {
            for (j in 0 until matrix[x].size) {
                println("${matrix[x][j]} * ${matrix[x + 1][j]}")
                multipliedStructure[x] = x to j
            }
        }
        return multipliedStructure
    }

    private fun iterateTwoMillionTimes(repeatTime: Int): Any = repeat(repeatTime) {
        val theMap = mutableMapOf<Double, Double>().apply {
            this[Int.MAX_VALUE * 34536342 / PI] = (Int.MAX_VALUE * 34536342 / PI - 1) * 100
        }.also {
            println(it.toSortedMap())
        }
    }

    @OptIn(ExperimentalTime::class)
    fun measureIterateTwoMillionTimesPerformance(repeatTime: Int): Any {
        return measureTimedValue { iterateTwoMillionTimes(repeatTime) }.duration
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        val duplicates = HashSet<Int>(nums.size)
        nums.forEach {
            when {
                duplicates.contains(it) -> return true
                else -> duplicates.add(it)
            }
        }

        return false
    }

    fun isAnagramSorted(s: String, t: String): Boolean {
        val sString = s.toCharArray()
        val tString = t.toCharArray()
        Arrays.sort(sString)
        Arrays.sort(tString)
        return sString contentEquals tString
    }

    fun isAnagramAlphabet(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val alphabetCharArray = IntArray(26)

        for (character in s.indices) {
            println(alphabetCharArray[s[character] - 'a'])
            alphabetCharArray[s[character] - 'a']++
            alphabetCharArray[t[character] - 'a']--
        }

        alphabetCharArray.forEach { if (it != 0) return false }

        return true
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val counts = IntArray(26)
        for (char in s.indices) {
            counts[s[char] - 'a']++
            counts[t[char] - 'a']--
        }
        return counts.all { it == 0 }
    }

    fun search(nums: IntArray, target: Int): Int {

        var leftPointer = 0
        var rightPointer = nums.size - 1

        while (leftPointer <= rightPointer) {
            val middlePointer = leftPointer + (rightPointer - leftPointer) / 2
            when {
                nums[middlePointer] == target -> return middlePointer
                nums[middlePointer] > target -> rightPointer = middlePointer - 1
                else -> leftPointer = middlePointer + 1
            }
        }
        return -1
    }

    fun recursiveSearch(nums: IntArray, target: Int, leftPointer: Int, rightPointer: Int): Int {

        var lPointer = leftPointer
        var rPointer = rightPointer

        while (lPointer <= rPointer) {
            val middlePointer = leftPointer + (rPointer - lPointer) / 2
            when {
                nums[middlePointer] == target -> return middlePointer
                nums[middlePointer] > target -> {
                    rPointer = middlePointer - 1
                    return recursiveSearch(nums, target, lPointer, rPointer)
                }
                else -> {
                    lPointer = middlePointer + 1
                    return recursiveSearch(nums, target, lPointer, rPointer)
                }
            }
        }
        return -1
    }

    fun searchRecursively(nums: IntArray, target: Int): Int {
        return recursiveSearch(nums, target, 0, nums.size - 1)
    }
}
