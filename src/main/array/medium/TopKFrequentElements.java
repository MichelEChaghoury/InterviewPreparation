package main.array.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    /*
     * 347. Top K Frequent Elements
     * 
     * Level: Medium
     * Link: https://leetcode.com/problems/top-k-frequent-elements/
     * 
     * Given an integer array nums and an integer k, return the k most frequent
     * elements. You may return the answer in any order.
     * 
     * Example 1:
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * 
     * Example 2:
     * Input: nums = [1], k = 1
     * Output: [1]
     * 
     * Constraints:
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     * k is in the range [1, the number of unique elements in the array].
     * It is guaranteed that the answer is unique.
     * 
     * Follow up: Your algorithm's time complexity must be better than O(n log n),
     * where n is the array's size.
     * 
     */

    /**
     * Returns the k most frequent elements from the given array.
     *
     * @param nums the integer array
     * @param k    the number of elements to return
     * @return an array containing the k most frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] topKFrequentElements = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            queue.add(key);
        }

        for (int i = 0; i < k; i++) {
            topKFrequentElements[i] = queue.poll();
        }

        return topKFrequentElements;
    }

}