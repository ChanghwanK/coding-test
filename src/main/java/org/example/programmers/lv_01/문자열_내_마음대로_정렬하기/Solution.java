package org.example.programmers.lv_01.문자열_내_마음대로_정렬하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            return s1.charAt(n) - s2.charAt(n);
        });
        return strings;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new String[] {"sun", "bed", "car"}, 1);
        System.out.println("result: " + result);
    }
}
