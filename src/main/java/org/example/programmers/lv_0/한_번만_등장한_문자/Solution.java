package org.example.programmers.lv_0.한_번만_등장한_문자;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int [] a = new int[26];
        for(int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcabcadc"));
        System.out.println(solution.solution("abdc"));
        System.out.println(solution.solution("hello"));
    }

}
