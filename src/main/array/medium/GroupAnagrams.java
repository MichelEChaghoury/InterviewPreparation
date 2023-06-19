package main.array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    /*
     * 49. Group Anagrams
     * Level: Medium
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
     * Constraints:
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] consists of lowercase English letters.
     * 
     */

    /**
     * Groups the anagrams together from the given arrays of Strings
     *
     * @param strs an array of Strings
     * @return a list of lists containing the grouped anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] current = str.toCharArray();
            Arrays.sort(current);
            String key = Arrays.toString(current);

            if (!map.containsKey(key)) {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            } else {
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }
        }

        results.addAll(map.values());

        return results;
    }
}
