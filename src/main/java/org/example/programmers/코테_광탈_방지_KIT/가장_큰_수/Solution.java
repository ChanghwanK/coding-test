package org.example.programmers.코테_광탈_방지_KIT.가장_큰_수;

import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        // 앞자리가 큰 수로 정렬

        String [] strNums = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(
            strNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2)
        );

        if (String.join("", strNums).startsWith("0")) return "0";

        return String.join("", strNums);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {6,10,2});
        System.out.println("result: " + result);
    }
}
