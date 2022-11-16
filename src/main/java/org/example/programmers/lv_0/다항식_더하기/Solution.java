package org.example.programmers.lv_0.다항식_더하기;

import java.util.Arrays;

public class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] splits = polynomial.split(" ");
        int result = 0;
        int num = 0;
        for(String s : splits) {
            if(s.contains("x")) {
                int a = 1;
                String x = s.replace("x", "");
                if(!x.equals("")) {
                    a = Integer.parseInt(x);
                }
                result += a;
            } else {
                if(s.equals("+")) continue;
                num += Integer.parseInt(s);
            }
        }

        if(result == 0) {
            answer = String.valueOf(num);
            return answer;
        }

        if(num == 0){
            if(result == 1) {
                answer = "x";
            } else {
                answer = result + "x";
            }
        } else {
            StringBuilder sb = new StringBuilder();
            if (result == 1) {
                sb.append("x");
                sb.append(" + ");
                sb.append(num);
            } else {
                sb.append(result).append("x");
                sb.append(" + ");
                sb.append(num);
            }
            answer = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("3x + 7 + x");
//        var result = solution.solution("x + x + x");
//        var result = solution.solution("x");
//        var result = solution.solution("7");
        System.out.println("result: " + result);
    }

}
