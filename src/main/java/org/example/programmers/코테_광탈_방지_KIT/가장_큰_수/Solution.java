package org.example.programmers.코테_광탈_방지_KIT.가장_큰_수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        // 앞자리가 큰 수로 정렬

        String [] strNums = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        System.out.println(Arrays.toString(strNums));

        Arrays.sort(
            strNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2)
        );

        System.out.println(Arrays.toString(strNums));
        return "";
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {6,10,2});
        System.out.println("result: " + result);
    }
}
