package org.example.programmers.lv_01.이상한_문자_만들기;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        var data = s.split(" ", -1);
        System.out.println(Arrays.toString(data));
        int index = 1;
        for(String str : data) {
            String convertedStr = strConverter(str);
            if(index != data.length) {
                sb.append(convertedStr);
                sb.append(" ");
            } else {
                sb.append(convertedStr);
            }
            index++;
        }

        return sb.toString();
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
        String s = "try hello world ";
        Solution solution = new Solution();
        System.out.println("result: "+ solution.solution(s));
    }
}
