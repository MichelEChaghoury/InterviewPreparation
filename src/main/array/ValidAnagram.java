package main.array;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /*
     * LeetCode 242 | Valid Anagram
     * Level: Easy
     * 
     * Link: https://leetcode.com/problems/valid-anagram/
     * 
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     * 
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * 
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     * 
     * 
     * Constraints:
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     *
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char firstChar = s.charAt(i);
            char secondChar = t.charAt(i);

            firstMap.put(firstChar, firstMap.getOrDefault(firstChar, 0) + 1);
            secondMap.put(secondChar, secondMap.getOrDefault(secondChar, 0) + 1);
        }

        return firstMap.equals(secondMap);
    }
}
