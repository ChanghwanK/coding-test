package org.example.programmers.자료구조_알고리즘_강의.올바른_괄호;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    // 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻
    boolean solution(String s) {
        boolean answer = true;
        List<String> queue =  new LinkedList<>();
        
        // 내가 접근한 방식
        // ( 들어갔다면 )있어야 하니 )

        if(s.startsWith(")")) return false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                queue.add(String.valueOf(s.charAt(i)));
            } else {
                queue.remove("(");
            }
        }
        return queue.isEmpty();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution("()()");
//        var result = solution.solution("((((");
        var result = solution.solution("))))()()"); // <- 예외 케이스
//        var result = solution.solution("(())()");
        System.out.println("result: " + result);
    }
}
