package org.example.programmers.lv_0.짝수의_합;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(10);
    }
}
