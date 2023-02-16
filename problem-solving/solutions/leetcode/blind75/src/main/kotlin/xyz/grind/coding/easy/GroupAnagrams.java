package xyz.grind.coding.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagramsBruteForce(String[] strs){
        if(strs.length == 0) return new ArrayList<>();
        List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
        Map<String, List<String>> computedAnagrams = new HashMap<String, List<String>>();
        for(String str : strs) {
            char[] strCharArray = str.toCharArray(); // because strings in java are immutable
            Arrays.sort(strCharArray);
            String anagramKey = new String(strCharArray);
            if(!computedAnagrams.containsKey(anagramKey)) computedAnagrams.put(anagramKey, new ArrayList());
            computedAnagrams.get(anagramKey).add(str);
        }
        groupedAnagrams.addAll(computedAnagrams.values());
        return groupedAnagrams;
    }

    public static List<List<String>> groupAnagramsBruteForceTwo(String[] strs){
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> computedAnagrams = new HashMap<>();
        for(String str : strs) {
            char[] strCharArray = str.toCharArray(); // because strings in java are immutable
            Arrays.sort(strCharArray);
            String anagramKey = new String(strCharArray);
            if(!computedAnagrams.containsKey(anagramKey)) computedAnagrams.put(anagramKey, new ArrayList());
            computedAnagrams.get(anagramKey).add(str);
        }
        return new ArrayList(computedAnagrams.values());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 ) return new ArrayList<>();
        List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
        Map<String, List<String>> computedAnagram = new HashMap<String, List<String>>();
        for(String arrayAnagramElement : strs) {
            char[] strCounterCharArray = new char[26];
            for(char character : arrayAnagramElement.toCharArray()){
                strCounterCharArray[character - 'a']++;
            }
            String keyAnagram = new String(strCounterCharArray);
            if(!computedAnagram.containsKey(keyAnagram)) computedAnagram.computeIfAbsent(keyAnagram, k -> new ArrayList<>());
            computedAnagram.get(keyAnagram).add(arrayAnagramElement);
            System.out.println(computedAnagram);
        }

        groupedAnagrams.addAll(computedAnagram.values());
        return groupedAnagrams;
    }


}
