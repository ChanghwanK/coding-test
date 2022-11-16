package org.example.programmers.lv_0.문자열_정렬하_2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var str = solution.solution("Bcad");
        System.out.println(str);
    }

}
