package xyz.grind.coding.easy

import java.util.PriorityQueue
import java.util.Queue
import kotlin.collections.MutableList
import kotlin.collections.set

object TopKFrequentElements {

    fun topKFrequentElementsHeap(nums: IntArray, k: Int): IntArray {
        if (k == nums.size) {
            return nums
        }
        val count = mutableMapOf<Int, Int>()
        for (n in nums) { count[n] = count.getOrDefault(n, 0) + 1 }

        // when initializing the heap we keep the less frequent element first
        val heap: Queue<Int> = PriorityQueue { n1, n2 -> count[n1]!! - count[n2]!! }
        for (n in count.keys) {
            heap.add(n)
            if (heap.size > k) heap.poll()
        }
        val top = IntArray(k)
        for (i in k - 1 downTo 0) top[i] = heap.poll()
        return top
    }

    fun topKFrequentElements(nums: IntArray, k: Int): IntArray {
        val count = hashMapOf<Int, Int>()
        val freq = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        for (n in nums) count[n] = count.getOrDefault(n, 0) + 1
        for ((n, c) in count) { freq[c].add(n) }

        val res = mutableListOf<Int>()
        for (i in freq.size - 1 downTo 0) {
            for (n in freq[i]) {
                res.add(n)
                if (res.size == k) return res.toIntArray()
            }
        }
        return intArrayOf()
    }
}
