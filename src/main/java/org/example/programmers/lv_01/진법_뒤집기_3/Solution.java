package org.example.programmers.lv_01.진법_뒤집기_3;

import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String intString = new StringBuilder().append(Integer.toString(n, 3)).reverse().toString();
        int [] digits = Arrays.stream(intString.split("")).mapToInt(Integer::parseInt).toArray();

        // 몇 제곱이냐 len - 1
        // 2   2  1 1 1
        // 162 54 9 3 1 == 229
        int square = digits.length - 1;
        for(int digit : digits) {
            if(digit != 0) {
                int v = (int) (Math.pow(3, square) * digit);
                answer += v;
            }
            square--;
        }

        return answer;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(45);
        var result = solution.solution(125);
        System.out.println("result: " + result);
    }
}
