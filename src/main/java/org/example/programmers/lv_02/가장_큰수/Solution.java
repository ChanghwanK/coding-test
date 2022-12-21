package org.example.programmers.lv_02.가장_큰수;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        String [] strNums = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        // 만들 수 있는 조합 중 가장 큰 수를 만든다면
        // 앞의 자리수가 크게 시작되어야 함
        // 앞의 자리수가 더 크게 정렬하기 위해선 문자열로 합쳤을 때 값이 더 큰 경우가 위의 결과에 만족하게 정렬될 수 있음
        System.out.println("start: " + Arrays.toString(strNums));

        List<String> collect = Arrays.stream(strNums)
            .sorted((s1, s2) -> {
                System.out.println(s2 + s1);
                System.out.println(s1 + s2);
                System.out.println("========");
                return (s2 + s1).compareTo(s1 + s2);
            })
            .collect(Collectors.toList());

        System.out.println("==== result ====");
        System.out.println(collect);
        return String.join("", collect);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {6, 10, 2});
        System.out.println("result: " + result);
    }
}
