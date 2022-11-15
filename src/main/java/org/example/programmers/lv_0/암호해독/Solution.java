package org.example.programmers.lv_0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i = code - 1; i < cipher.length(); i+=code) {
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        String cipher2 = "pfqallllabwaoclk";
        Solution solution = new Solution();
        var result = solution.solution(cipher, 4);
        System.out.println("result1: " + result);
        var result2 = solution.solution(cipher2, 2);
        System.out.println("result2: " + result2);
    }

}
