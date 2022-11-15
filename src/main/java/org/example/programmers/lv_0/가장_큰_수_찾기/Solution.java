package org.example.programmers.lv_0.가장_큰_수_찾기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[] {max, index};
    }

    public static void main(String[] args) {
        int [] arr = new int[] {1,8,3};
        int [] arr2 = new int[] {9, 10, 11, 8};
        Solution solution = new Solution();
        var data = solution.solution(arr);
        System.out.println(Arrays.toString(data));
    }

}
