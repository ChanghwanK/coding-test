package org.example.programmers.자료구조_알고리즘_강의.문자열_내_p와_의_개수;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        List<String> queue = new LinkedList<>();
        String lowerS = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        // 뒤에 등장한 y를
        for(char word : lowerS.toCharArray()) {
            if(word == 'p') {
                pCnt++;
            } else if(word == 'y') {
                yCnt++;
            }
        }
        System.out.println(pCnt);
        System.out.println(yCnt);

        return pCnt == yCnt;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("pPoooyY");
//        var result = solution.solution("abcd");
        System.out.println("result: " + result);
    }
}
