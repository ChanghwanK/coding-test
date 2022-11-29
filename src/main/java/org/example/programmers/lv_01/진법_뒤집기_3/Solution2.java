package org.example.programmers.lv_01.진법_뒤집기_3;

import java.util.Arrays;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int [] digits = Arrays.stream(new StringBuilder().append(Integer.toString(n, 3)).reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
        int square = digits.length - 1;
        for(int digit : digits) {
            if(digit != 0) {
                answer += (int) (Math.pow(3, square) * digit);
            }
            square--;
        }

        return answer;
    }
    public static void main(String [] args) {
        Solution2 solution = new Solution2();
//        var result = solution.solution(45);
        var result = solution.solution(125);
        System.out.println("result: " + result);
    }
}
