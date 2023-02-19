package main.stack;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {

    /*
     * LeetCode 22 | Generate Parentheses
     * Level: Medium
     * 
     * Link: https://leetcode.com/problems/generate-parentheses/
     * 
     * Given n pairs of parentheses, write a function to generate all combinations
     * of well-formed parentheses.
     * 
     * Example 1:
     * Input: n = 3
     * Output: ["((()))","(()())","(())()","()(())","()()()"]
     * 
     * Example 2:
     * Input: n = 1
     * Output: ["()"]
     * 
     * 
     * Constraints:
     * 1 <= n <= 8
     */

    public List<String> generateParenthesis(int n) {
        List<String> results = new LinkedList<>();

        backtrack(results, n, 0, 0, "");

        return results;
    }

    private static void backtrack(List<String> results, int n, int opened, int closed, String state) {

        if (opened + closed == n * 2) {
            results.add(state);
        }

        if (closed < opened) {
            backtrack(results, n, opened, closed + 1, state + ")");
        }

        if (opened < n) {
            backtrack(results, n, opened + 1, closed, state + "(");
        }

    }

}
