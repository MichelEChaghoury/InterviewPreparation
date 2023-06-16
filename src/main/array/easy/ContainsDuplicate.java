package main.array.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
     * 217. Contains Duplicate
     * Level: Easy
     * Link: https://leetcode.com/problems/contains-duplicate/
     * 
     * Given an integer array nums, return true if any value appears at least twice
     * in the array, and return false if every element is distinct.
     * 
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * 
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * 
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * 
     * Constraints:
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     */

    /**
     * Checks if the given integer array contains any duplicate values.
     * 
     * @param nums The integer array to check for duplicates.
     * @return true if any value appears at least twice, false otherwise.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

}
