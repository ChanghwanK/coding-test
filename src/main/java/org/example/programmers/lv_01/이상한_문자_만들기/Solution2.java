package org.example.programmers.lv_01.이상한_문자_만들기;

import java.util.Arrays;

public class Solution2 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String [] strs = s.split(" ", -1);

        for(int i = 0; i < strs.length; i++) {
            if (i != strs.length - 1) {
                sb.append(strConverter(strs[i]));
                sb.append(" ");
            } else {
                sb.append(strConverter(strs[i]));
            }
        }

        if(isStringArrLastStrContainBlank(strs)) sb.append(" ");
        return sb.toString();
    }

    public boolean isStringArrLastStrContainBlank(String [] strings) {
        return strings[strings.length - 1].equals("");
    }

    public String strConverter(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            if(i % 2 ==0) sb.append(String.valueOf(a).toUpperCase());
            else sb.append(String.valueOf(a).toLowerCase());
        }
        return sb.toString();
    }

    public static void main(String [] args) {
        String s = "try hello world";
        Solution2 solution = new Solution2();
        System.out.println("result: "+ solution.solution(s));
    }
}
