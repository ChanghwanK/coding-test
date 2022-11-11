package org.example.programmers.lv_0.배열_자르기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        // 1 ~ 3 인덱스의 값들을 가져와야 함

        for(int i = 0; i < num2 - num1 + 1 ; i++) {
            answer[i] = numbers[i + num1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        Solution solution = new Solution();
        var result = solution.solution(numbers, 1,3);
        System.out.println(Arrays.toString(result));
    }

}
