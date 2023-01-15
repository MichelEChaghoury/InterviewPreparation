package main.stack;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    /*
     * LeetCode 20 | Valid Parentheses
     * Level: Easy
     * 
     * Link: https://leetcode.com/problems/valid-parentheses/
     * 
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and
     * ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * 
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * 
     * Example 1:
     * Input: s = "()"
     * Output: true
     * 
     * Example 2:
     * Input: s = "()[]{}"
     * Output: true
     * 
     * Example 3:
     * Input: s = "(]"
     * Output: false
     * 
     * Constraints:
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     * 
     */

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && (c == ']' || c == '}' || c == ')')) {
                return false;
            }

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                char top = stack.peek();

                if ((top == '{' && c != '}') || (top == '[' && c != ']') || (top == '(' && c != ')')) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
