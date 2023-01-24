package org.example.programmers.lv_01.다트게임;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    static class Turn {
        String result;
        public Turn(String result) {this.result = result;}
    }

    public int solution(String dartResults) {
        int answer = 0;
        Stack<Integer> scores = new Stack<>();

        Map<Character, Integer> area = new HashMap<>();
        area.put('S', 1);
        area.put('D', 2);
        area.put('T', 3);

        int statIdx = 0;

        for(int i = 0; i < dartResults.length(); i++) {
            char word  = dartResults.charAt(i);
            if (area.containsKey(word)) {
                int val = Integer.parseInt(dartResults.substring(statIdx, i));
                int op = area.get(word);
                scores.push((int) Math.pow(val, op));
            } else if(word == '*') {
                if(scores.size() == 1) {
                    scores.push( scores.pop() * 2);
                } else {
                    int num1 = scores.pop();
                    int num2 = scores.pop();
                    scores.push( num2 * 2);
                    scores.push( num1 * 2);
                }
            } else if(word == '#') {
                scores.push(scores.pop() * -1);
            }

            if(! Character.isDigit(word)) {
                statIdx = i + 1;
            }
        }

        answer = scores.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("1S*2T*3S");
        System.out.println("result: " + result);
    }
}
