package org.example.programmers.lv_01.자연수_뒤집어_배열만들기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String a = sb.reverse().toString();

        int [] answer = new int[a.length()];

        int index = 0;
        for(String ss : a.split("")) {
            answer[index] = Integer.parseInt(ss);
            index++;
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(12345);
        System.out.println("result: " + Arrays.toString(result));
    }
}
