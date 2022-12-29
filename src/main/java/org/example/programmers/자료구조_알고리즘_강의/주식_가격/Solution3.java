package org.example.programmers.자료구조_알고리즘_강의.주식_가격;

import java.util.Arrays;

public class Solution3 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int sec = 0;
            for(int j = i + 1; j < prices.length; j++) {
                sec++;
                if (price > prices[j]) break;
            }
            answer[i] = sec;
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution3 solution = new Solution3();
        var result = solution.solution(new int[] {1, 2, 3, 2, 3});
        System.out.println("result: " + Arrays.toString(result));
    }

}
