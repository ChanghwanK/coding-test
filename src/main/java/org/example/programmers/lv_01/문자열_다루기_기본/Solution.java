package org.example.programmers.lv_01.문자열_다루기_기본;

import java.util.Arrays;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char [] array = s.toCharArray();
        if(array.length == 4 || array.length == 6) {
            for(char a: array) {
                if(Character.isAlphabetic(a)) {
                    return false;
                } else {
                    answer = true;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("abcd");
        System.out.println("result: " + result);
    }
}
