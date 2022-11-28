package org.example.programmers.lv_01.두_정수_사이의_합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a,b);
        for(int i = start; i <= end ; i++) {
            answer+=i;
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(5,3);
        System.out.println("result: " + result);
    }
}
