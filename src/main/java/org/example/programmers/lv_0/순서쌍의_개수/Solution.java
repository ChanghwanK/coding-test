package org.example.programmers.lv_0.순서쌍의_개수;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += 1;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(20);
        System.out.println("result >>> " + result);
    }
}
