package xyz.grind.coding.easy

import java.util.Arrays

object GroupAnagrams {

    fun groupAnagramsBruteForce(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return ArrayList()
        val groupedAnagrams: MutableList<List<String>> = ArrayList()
        val computedAnagrams: MutableMap<String, MutableList<String>> = HashMap()
        for (str in strs) {
            val strCharArray = str.toCharArray() // because strings in java are immutable
            Arrays.sort(strCharArray)
            val anagramKey = String(strCharArray)
            if (!computedAnagrams.containsKey(anagramKey)) computedAnagrams[anagramKey] = arrayListOf()
            computedAnagrams[anagramKey]?.add(str)
        }
        groupedAnagrams.addAll(computedAnagrams.values)
        return groupedAnagrams
    }

    fun groupAnagramsBruteForceTwo(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return ArrayList()
        val computedAnagrams: MutableMap<String, MutableList<String>> = HashMap()
        for (str in strs) {
            val strCharArray = str.toCharArray() // because strings in java are immutable
            Arrays.sort(strCharArray)
            val anagramKey = String(strCharArray)
            if (!computedAnagrams.containsKey(anagramKey)) computedAnagrams[anagramKey] = ArrayList()
            computedAnagrams[anagramKey]!!.add(str)
        }
        return ArrayList(computedAnagrams.values)
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return ArrayList()
        val groupedAnagrams: MutableList<List<String>> = ArrayList()
        val computedAnagram: MutableMap<String, MutableList<String>> = HashMap()
        for (arrayAnagramElement in strs) {
            val strCounterCharArray = CharArray(26)
            for (character in arrayAnagramElement.toCharArray()) {
                strCounterCharArray[character.code - 'a'.code]++
            }
            val keyAnagram = String(strCounterCharArray)
            if (!computedAnagram.containsKey(keyAnagram)) computedAnagram.computeIfAbsent(keyAnagram) { ArrayList() }
            computedAnagram[keyAnagram]?.add(arrayAnagramElement)
            println(computedAnagram)
        }
        groupedAnagrams.addAll(computedAnagram.values)
        return groupedAnagrams
    }
}
