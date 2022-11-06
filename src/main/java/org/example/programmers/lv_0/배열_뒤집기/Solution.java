package org.example.programmers.lv_0.배열_뒤집기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = num_list.length-1; i >= 0; i--) {
            answer[num_list.length -1- i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(data));
    }
}
