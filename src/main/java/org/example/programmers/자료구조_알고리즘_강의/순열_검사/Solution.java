package org.example.programmers.자료구조_알고리즘_강의.순열_검사;

import java.util.Arrays;

public class Solution {
    public boolean solution(int[] arr) {
        int [] answers = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            answers[i] = i + 1;
        }

        Arrays.sort(arr);

        return Arrays.equals(arr, answers);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[] {4, 1, 3, 2}));
        System.out.println(solution.solution(new int[] {4, 1, 3}));
    }

}
