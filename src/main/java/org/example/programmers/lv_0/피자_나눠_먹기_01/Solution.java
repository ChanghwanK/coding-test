package org.example.programmers.lv_0.피자_나눠_먹기_01;

public class Solution {
    public int solution(int n) {
        int quotient = n / 7;
        int temp = n % 7;

        if (temp > 0) return quotient + 1;

        return quotient;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(15);
        System.out.println("Result: " + result);
    }
}
