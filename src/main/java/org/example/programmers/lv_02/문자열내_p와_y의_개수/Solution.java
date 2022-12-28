package org.example.programmers.lv_02.문자열내_p와_y의_개수;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();

        List<String> pArr = new ArrayList<>();
        List<String> yArr = new ArrayList<>();

        for (char a : s.toCharArray()) {
            if (a == 'p') pArr.add(String.valueOf(a));
            else if (a == 'y') {
                yArr.add(String.valueOf(a));
            }
        }

        return pArr.size() == yArr.size();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("pPoooyY");
        System.out.println("result: " + result);
    }
}
