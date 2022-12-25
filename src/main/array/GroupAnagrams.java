package main.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    /*
     * LeetCode 49 | Group Anagrams
     * Level: Medium
     * 
     * Link: https://leetcode.com/problems/group-anagrams/
     * 
     * Given an array of strings strs, group the anagrams together. You can return
     * the answer in any order.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     * 
     * Example 1:
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * 
     * Example 2:
     * Input: strs = [""]
     * Output: [[""]]
     * 
     * Example 3:
     * Input: strs = ["a"]
     * Output: [["a"]]
     * 
     * 
     * Constraints:
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] consists of lowercase English letters.
     * 
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (final String str : strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String sortedKey = String.valueOf(key);

            if (map.containsKey(sortedKey)) {
                map.get(sortedKey).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(sortedKey, list);
            }
        }

        anagrams.addAll(map.values());

        return anagrams;
    }
}