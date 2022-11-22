package org.example.programmers.lv_01.콜라_문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            int remain = n % a;
            answer += (n / a) * b;
            n = (n / a) * b + remain;
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(2, 1, 20);
        System.out.println(result);
    }
}
