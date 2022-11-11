package org.example.programmers.lv_0.가위_바위_보;

public class Solution {
    static final char ROCK = '0';
    static final char PAPER = '5';
    static final char SCISSORS = '2';
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++) {
            var data = rsp.charAt(i);
            if(data == ROCK) {
                answer.append(PAPER);
            }

            if (data == PAPER) {
                answer.append(SCISSORS);
            }

            if (data == SCISSORS) {
                answer.append(ROCK);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("205");
        System.out.println("result: " + result);

    }

}
