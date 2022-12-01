package org.example.programmers.lv_01.문자열_내림차순_정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for(char a : chars)
            sb.append(a);

        return sb.reverse().toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("Zbcdefg");
        System.out.println("result: " + result);
    }
}
