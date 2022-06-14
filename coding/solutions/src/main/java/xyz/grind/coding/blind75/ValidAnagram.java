package xyz.grind.coding.blind75;

import java.util.Arrays;
import java.util.HashSet;

public class ValidAnagram {

   public static boolean isAnagramSortingBruteForce(String s, String t){
      if(s.length() != t.length()) return false;
      char[] sCharArray = s.toCharArray();
      char[] tCharArray = t.toCharArray();

      Arrays.sort(sCharArray);
      Arrays.sort(tCharArray);

      return Arrays.equals(sCharArray, tCharArray);
   }

   public static boolean isAnagramHashSet(String s, String t) {
      if(s.length() != t.length()) return false;

      char[] sCharArray = s.toCharArray();
      char[] tCharArray = t.toCharArray();
      HashSet<Character> set = new HashSet<>();

      for(char sChar : sCharArray) set.add(sChar);
      for(char tChar : tCharArray) {
         if(set.add(tChar)) return false;
      }
      return true;
   }

   public static boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) return false;

      int[] counts = new int[26];

      for(int i = 0; i < s.length(); i++){
         counts[s.charAt(i) - 'a']++;
         counts[t.charAt(i) - 'a']--;
      }

      for(int count : counts) {
         if(count != 0) return false;
      }
      return true;
   }

}
