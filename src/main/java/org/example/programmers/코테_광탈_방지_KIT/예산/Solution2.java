package org.example.programmers.코테_광탈_방지_KIT.예산;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {
    // 정해진 총액 이하에서 가능한 한 최대의 총 예산을 다음과 같은 방법으로 배정합니다.

    /**
     * 방법
     * 1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정합니다.
     * 2. 모든 요청이 배정될 수 없는 경우에는 특정한 정수 상한액을 계산하여 그 이상인 예산요청에는 모두 상한액을 배정합니다.
     *    상한액 이하의 예산요청에 대해서는 요청한 금액을 그대로 배정합니다.
     */
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int min = 0;
        int max = 0;
        int mid;


        for (int budget : budgets) {
            if (budget > max) max = budget;
        }

        while (min <= max) {
            mid = (min + max) / 2; // 상한선
            int total = 0;

            for (int budget : budgets) {
                total += Math.min(budget, mid);
            }

            if (total > M) {
                max = mid - 1;
            } else {
                answer = mid;
                min = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[] {120, 110, 140, 150}, 485);
        System.out.println("result: " + result);
    }
}
