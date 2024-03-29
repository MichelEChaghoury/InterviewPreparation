package main.array.easy;

public class IsSubsequence {
    /*
     * 392. Is Subsequence
     * Level: Easy
     * Link: https://leetcode.com/problems/is-subsequence/description/
     * 
     * Given two strings s and t, return true if s is a subsequence of t, or false
     * otherwise.
     * 
     * A subsequence of a string is a new string that is formed from the original
     * string by deleting some (can be none) of the characters without disturbing
     * the relative positions of the remaining characters. (i.e., "ace" is a
     * subsequence of "abcde" while "aec" is not).
     * 
     * Example 1:
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * 
     * Example 2:
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     * 
     * Constraints:
     * 0 <= s.length <= 100
     * 0 <= t.length <= 104
     * s and t consist only of lowercase English letters.
     * 
     * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k
     * >= 109, and you want to check one by one to see if t has its subsequence. In
     * this scenario, how would you change your code?
     */

    public boolean isSubsequence(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] == second[secondIndex]) {
                firstIndex += 1;
            }

            secondIndex += 1;
        }

        return firstIndex == first.length;
    }
}
