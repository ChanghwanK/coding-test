package org.example.programmers.lv_0.종이_자르기;

public class Solution {
    public int solution(int M, int N) {
        int answer = 0;
//        if (M == 1 || N == 1) return 0;
        int width = M * N;
        answer = width - 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(2,2);
        System.out.println("result: " + result);
    }
}
