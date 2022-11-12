package org.example.programmers.lv_0.최대값_만들기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length -2];
        return answer;
    }

    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,3,4,5};
        int [] numbers2 = new int[]{0, 31, 24, 10, 1, 9};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
        System.out.println(solution.solution(numbers2));
    }

}
