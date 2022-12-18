package org.example.programmers.lv_01.콜라_문제;

public class Solution2 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            n = ((n / a) * b) +  (n % a);
            answer += ((n / a) * b);
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(2, 1, 20);
        System.out.println("result: " + result);
    }

}
