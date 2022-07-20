package xyz.grind.coding.blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

   public static int[] topKFrequentElementsBruteForce(int[] nums, int k) {
      if(nums.length == k) return nums;

      Map<Integer, Integer> map = new HashMap<>();
      for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

      List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

       list.sort(Map.Entry.comparingByValue((a, b) -> b - a));

       int[] top = new int[k];
       for (int i=0; i < k; i++) {
          top[i] = list.get(i).getKey();
       }

      return top;
   }

   public static int[] topKFrequentElementsHeap(int[] nums, int k){
      // O(1) time
      if (k == nums.length) {
         return nums;
      }

      // 1. build hash map : character and how often it appears
      // O(N) time
      Map<Integer, Integer> count = new HashMap();
      for (int n: nums) {
         count.put(n, count.getOrDefault(n, 0) + 1);
      }

      // init heap 'the less frequent element first'
      Queue<Integer> heap = new PriorityQueue<>(
              (n1, n2) -> count.get(n1) - count.get(n2));

      // 2. keep k top frequent elements in the heap
      // O(N log k) < O(N log N) time
      for (int n: count.keySet()) {
         System.out.println("keyset " + n);
         heap.add(n);
         if (heap.size() > k) heap.poll();
      }

      // 3. build an output array
      // O(k log k) time
      int[] top = new int[k];
      for(int i = k - 1; i >= 0; --i) {
         top[i] = heap.poll();
      }
      return top;
   }



   public static int[] topKFrequentElements(int[] nums, int k) {
      if(k == nums.length) return nums;

      Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
      for(int num : nums) {
         counts.put(num, counts.getOrDefault(num, 0) + 1);
      }


      List<Integer>[] buckets = new List[nums.length + 1];
      for(int i = 0; i < buckets.length; i++) {
         buckets[i] = new ArrayList<>();
      }


      for(int count: counts.keySet()) {
         buckets[counts.get(count)].add(count);
      }

      List<Integer> flattened = new ArrayList<>();
      for(int i = buckets.length - 1; i >= 0; i--) {
         for(int element : buckets[i]) {
            flattened.add(element);
         }
      }

      int[] top = new int[k];
      for(int i = 0; i < k; i++) {
         top[i] = flattened.get(i);
      }

      return top;
   }


}