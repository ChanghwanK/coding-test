package org.example.programmers.lv_01.문자열을_정수로_바꾸기;

public class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("-1234");
        System.out.println("result: " + result);
    }
}
