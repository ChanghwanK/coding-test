package org.example.programmers.lv_0.최대값_만들기_02;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[numbers.length - 1];
        int num4 = numbers[numbers.length - 2];

        int tempA = num1 * num2;
        int tempB = num3 * num4;
        return Math.max(tempA, tempB);
    }
    public static void main(String[] args) {

    }

}
