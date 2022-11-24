package org.example.programmers.자료구조_알고리즘_강의.주식_가격;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int seconds = 0;
            for(int j = i + 1; j < prices.length; j++) {
                seconds++;
                if(price > prices[i]) break;
            }
            answer[i] = seconds;
        }

        return answer;
    }

    public static void main(String [] args) {
        int [] prices = new int[] {1, 2, 3, 2, 3};
        Solution solution = new Solution();
        var result = solution.solution(prices);
        System.out.println("result: " + Arrays.toString(result));
    }
}
