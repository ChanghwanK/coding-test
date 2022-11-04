package org.example.programmers.lv_0.중앙값_구하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mid = array.length / 2;
        Arrays.sort(array);
        answer = array[mid];
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {1, 2, 7, 10 ,11};
        int [] arr2 = {9,-1,0};
        System.out.println("result: " + solution.solution(arr2));
    }
}
