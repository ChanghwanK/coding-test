package org.example.programmers.lv_02.짝지어_제거하기;

import java.util.Stack;

public class Solution2 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()) {
            if(stack.isEmpty()) stack.push(a);
            else {
                if(stack.peek() == a) {
                    stack.pop();
                } else {
                    stack.push(a);
                }

            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("baabaa");
//        var result = solution.solution("cdcd");
        System.out.println("result: " + result);
    }
}
