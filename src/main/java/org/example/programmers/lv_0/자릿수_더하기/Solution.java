package org.example.programmers.lv_0.자릿수_더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            int c = n % 10;
            answer += c;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(1234);
        System.out.println(data);
    }

}
