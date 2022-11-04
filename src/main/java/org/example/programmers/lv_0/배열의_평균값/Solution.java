package org.example.programmers.lv_0.배열의_평균값;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer / numbers.length;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution solution = new Solution();
        solution.solution(a);
    }
}
