package org.example.programmers.lv_0.배열_두_배_만들기;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        solution.solution(a);
    }

}
