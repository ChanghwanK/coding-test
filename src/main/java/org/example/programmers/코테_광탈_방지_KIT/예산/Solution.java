package org.example.programmers.코테_광탈_방지_KIT.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] budgets, int M) {
        int min = 0;
        int max = 0;

        for(int i : budgets) {
            if (i > max) max = i;
        }

        int answer = 0;
        while(min <= max) {
            int mid = (min + max) / 2;
            int total = 0;

            for(int budget : budgets) {
                total += Math.min(budget, mid);
            }

            if (total <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {120, 110, 140, 150}, 485);
        System.out.println("result: " + result);
    }
}
