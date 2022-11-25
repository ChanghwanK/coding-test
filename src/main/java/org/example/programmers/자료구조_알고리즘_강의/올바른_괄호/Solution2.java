package org.example.programmers.자료구조_알고리즘_강의.올바른_괄호;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    // 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻
    boolean solution(String s) {
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        int stack = 0;
        for(char c : s.toCharArray()) {
            if (c == '(') {
                stack++;
            } else {
                if(stack == 0) return false;
                stack--;
            }
        }

        return stack == 0;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
//        var result = solution.solution("()()");
//        var result = solution.solution("((((");
        var result = solution.solution("))))()()"); // <- 예외 케이스
//        var result = solution.solution("(())()");
        System.out.println("result: " + result);
    }
}
