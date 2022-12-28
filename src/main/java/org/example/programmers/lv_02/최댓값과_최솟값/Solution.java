package org.example.programmers.lv_02.최댓값과_최솟값;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String [] strs = s.split(" ");
        List<Integer> collect = Arrays.stream(strs).mapToInt(Integer::parseInt).sorted().boxed()
            .collect(Collectors.toList());

        int min = collect.get(0);
        int max = collect.get(collect.size() - 1);
        return min + " " + max;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("1 2 3 4");
//        var result = solution.solution("-1 -2 -3 -4");
        System.out.println("result: " + result);
    }
}
