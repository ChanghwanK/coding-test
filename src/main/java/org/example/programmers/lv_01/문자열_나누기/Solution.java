package org.example.programmers.lv_01.문자열_나누기;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++)
            queue.add(String.valueOf(s.charAt(i)));

        // 종료 조건
        int xCnt = 1;
        int otherCnt = 0;
        String x = queue.poll();
        while(! queue.isEmpty()) {
            if(Objects.equals(x, queue.poll())) {
                xCnt++;
            } else {
                otherCnt++;
            }

            /**
             * 남은 글자가 하나 있는 경우를 예외처리해줘야 함
             * 딱 맞게 끊길 때는 x는 어떻게 되는가?
             */
            if(xCnt == otherCnt) {
                // 분리
                answer++;
                x = queue.poll();
                xCnt = 1;
                otherCnt = 0;
            }
        }

        if(x != null) {
            answer += x.length();
        }

        return answer;
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("banana");
//        var result = solution.solution("abracadabra");
//        var result = solution.solution("aaabbaccccabba");
        System.out.println("result: " + result);
    }

}
