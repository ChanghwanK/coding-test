package org.example.programmers.lv_01.크기가_작은_부분_문자열;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> strNums = new ArrayList<>();

        for(int i = 0; i < t.length() - p.length() + 1; i++)
            strNums.add(t.substring(i, i+p.length()));

        for (String num : strNums)
            if(p.compareTo(num) >= 0) answer++;

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution("3141592", "271");
        var result = solution.solution("500220839878", "7");
//        var result = solution.solution("10203", "15");
        System.out.println("result: " + result);
    }
}
