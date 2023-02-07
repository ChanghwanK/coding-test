package org.example.programmers.lv_0.문자열_밀기_2;

public class Solution2 {
    
    public int solution(String A, String B) {
        String tempB = B.repeat(3);
        // hello
        // ohell
        // lohel
        // llohe
        // elloh
        return tempB.indexOf(A);
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("hello", "ohell");
        System.out.println("result: " + result);
    }
}
