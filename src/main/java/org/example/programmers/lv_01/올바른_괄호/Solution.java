package org.example.programmers.lv_01.올바른_괄호;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new LinkedList<>();

        for(char a : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                if(stack.peek() == '(' && a == ')') {
                    stack.pop();
                } else {
                    stack.push(a);
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("(())()");

        System.out.println("result: " + result);
    }
}
