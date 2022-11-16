package org.example.programmers.lv_0.세균_증식;

public class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 0; i < t; i++) {
            answer *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2, 10));

    }

}
