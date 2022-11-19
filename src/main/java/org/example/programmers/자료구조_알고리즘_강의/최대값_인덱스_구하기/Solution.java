package org.example.programmers.자료구조_알고리즘_강의.최대값_인덱스_구하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> indexs = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == max) indexs.add(i);
        }

        int [] answer = new int[indexs.size()];

        for(int i = 0; i < indexs.size(); i++) {
            answer[i] = indexs.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[] {1, 3, 5, 4, 5, 2, 1})));
    }

}
