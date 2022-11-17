package org.example.programmers.lv_0.저주의_숫자;

public class Solution {
    public int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(40));
    }
}
