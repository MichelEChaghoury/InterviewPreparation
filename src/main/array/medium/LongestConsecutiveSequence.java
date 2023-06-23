package main.array.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /*
     * 128. Longest Consecutive Sequence
     * 
     * Level: Medium
     * Link: https://leetcode.com/problems/longest-consecutive-sequence/
     * 
     * Given an unsorted array of integers nums, return the length of the longest
     * consecutive elements sequence.
     * 
     * You must write an algorithm that runs in O(n) time.
     * 
     * Example 1:
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
     * Therefore its length is 4.
     * 
     * Example 2:
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     * 
     * Constraints:
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * 
     */

    /**
     * Returns the length of the longest consecutive elements sequence in the given
     * array.
     * 
     * @param nums the input array of integers
     * @return the length of the longest consecutive elements sequence
     */
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentLength = 1;
                while (set.contains(current + 1)) {
                    current++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
