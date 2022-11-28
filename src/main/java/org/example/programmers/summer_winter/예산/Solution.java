package org.example.programmers.summer_winter.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        // d[i]을 선택했을 때 남은 금액으로 더 구매할 수 있을 때까지 계속 구매 하고 cnt
        int answer = 0;
        Arrays.sort(d);
        int total = 0;

        for(int i = 0; i < d.length; i++) {
            total += d[i];
            if(total > budget) {
                answer = i;
                return answer;
            }
        }

        return d.length;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1,3,2,5,4}, 9);
//        var result = solution.solution(new int[] {2,2,3,3}, 10);
        System.out.println("result: " + result);
    }
}
