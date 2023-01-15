package main.stack;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {

    /*
     * LeetCode 150 | Evaluate Reverse Polish Notation
     * Level: Easy
     * 
     * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
     * 
     * You are given an array of strings tokens that represents an arithmetic
     * expression in a Reverse Polish Notation.
     * 
     * Evaluate the expression. Return an integer that represents the value of the
     * expression.
     * 
     * Note that:
     * 
     * The valid operators are '+', '-', '*', and '/'.
     * Each operand may be an integer or another expression.
     * The division between two integers always truncates toward zero.
     * There will not be any division by zero.
     * The input represents a valid arithmetic expression in a reverse polish
     * notation.
     * The answer and all the intermediate calculations can be represented in a
     * 32-bit integer.
     * 
     * Example 1:
     * Input: tokens = ["2","1","+","3","*"]
     * Output: 9
     * Explanation: ((2 + 1) * 3) = 9
     * 
     * Example 2:
     * Input: tokens = ["4","13","5","/","+"]
     * Output: 6
     * Explanation: (4 + (13 / 5)) = 6
     * 
     * Example 3:
     * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
     * Output: 22
     * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
     * = ((10 * (6 / (12 * -11))) + 17) + 5
     * = ((10 * (6 / -132)) + 17) + 5
     * = ((10 * 0) + 17) + 5
     * = (0 + 17) + 5
     * = 17 + 5
     * = 22
     * 
     * Constraints:
     * 1 <= tokens.length <= 104
     * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the
     * range [-200, 200].
     * 
     */

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                stack.addLast(stack.removeLast() + stack.removeLast());
            } else if (token.equals("-")) {
                int first = stack.removeLast();
                int second = stack.removeLast();

                stack.addLast(second - first);
            } else if (token.equals("/")) {
                int first = stack.removeLast();
                int second = stack.removeLast();

                stack.addLast(second / first);
            } else if (token.equals("*")) {
                stack.addLast(stack.removeLast() * stack.removeLast());
            } else {
                stack.addLast(Integer.parseInt(token));
            }
        }

        return stack.removeLast();
    }

}
