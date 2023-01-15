package main.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    /*
     * LeetCode 155 | Min Stack
     * Level: Medium
     * 
     * Link: https://leetcode.com/problems/min-stack/
     * 
     * Design a stack that supports push, pop, top, and retrieving the minimum
     * element in constant time.
     * 
     * Implement the minValStack class:
     * 
     * minValStack() initializes the stack object.
     * void push(int val) pushes the element val onto the stack.
     * void pop() removes the element on the top of the stack.
     * int top() gets the top element of the stack.
     * int getMin() retrieves the minimum element in the stack.
     * 
     * You must implement a solution with O(1) time complexity for each function.
     * 
     * Example 1:
     * Input
     * ["minValStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     * 
     * Output
     * [null,null,null,null,-3,null,0,-2]
     * 
     * Explanation:
     * minValStack.push(-2);
     * minValStack.push(0);
     * minValStack.push(-3);
     * minValStack.getMin(); // return -3
     * minValStack.pop();
     * minValStack.top(); // return 0
     * minValStack.getMin(); // return -2
     * 
     * Constraints:
     * -231 <= val <= 231 - 1
     * Methods pop, top and getMin operations will always be called on non-empty
     * stacks.
     * At most 3 * 104 calls will be made to push, pop, top, and getMin.
     * 
     */

    private Deque<Integer> stack;
    private Deque<Integer> minValStack;

    public MinStack() {
        stack = new LinkedList<>();
        minValStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addLast(val);

        if (minValStack.isEmpty() || minValStack.getLast() >= val) {
            minValStack.addLast(val);
        }

    }

    public void pop() {
        int peek = stack.removeLast();

        if (minValStack.getLast() == peek) {
            minValStack.removeLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minValStack.getLast();
    }
}
