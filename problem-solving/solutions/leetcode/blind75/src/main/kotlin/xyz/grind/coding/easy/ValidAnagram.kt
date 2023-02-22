package xyz.grind.coding.easy

import java.util.Arrays

object ValidAnagram {
    fun isAnagramSortingBruteForce(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val sCharArray = s.toCharArray()
        val tCharArray = t.toCharArray()
        Arrays.sort(sCharArray)
        Arrays.sort(tCharArray)
        return sCharArray.contentEquals(tCharArray)
    }

    fun isAnagramHashSet(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val sCharArray = s.toCharArray()
        val tCharArray = t.toCharArray()
        val set = hashSetOf<Char>()
        for (sChar in sCharArray) set.add(sChar)
        for (tChar in tCharArray) {
            if (set.add(tChar)) return false
        }
        return true
    }

        fun isAnagramAdjusted(s: String, t: String): Boolean {
            if (s.length != t.length) return false
            val counts = IntArray(26)
            for (i in s.indices) {
                counts[s[i].code - 'a'.code]++
                counts[t[i].code - 'a'.code]--
            }
            for (count in counts) {
                if (count != 0) return false
            }
            return true
        }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val counts = IntArray(26)
        for(char in s.indices) {
            counts[s[char] - 'a']++
            counts[t[char] - 'a']--
        }
        return counts.all { it == 0 }
    }
}
