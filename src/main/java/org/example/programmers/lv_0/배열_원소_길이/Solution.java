package org.example.programmers.lv_0.배열_원소_길이;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] strs = new String[] {"We", "are", "the", "world!"};
        Solution solution = new Solution();
        var a = solution.solution(strs);
        System.out.println(Arrays.toString(a));
    }

}
