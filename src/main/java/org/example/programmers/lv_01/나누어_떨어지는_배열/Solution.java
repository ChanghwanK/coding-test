package org.example.programmers.lv_01.나누어_떨어지는_배열;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if (i % divisor == 0) list.add(i);
        }

        if (list.size() == 0)
            return new int[] {-1};

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] { 5, 9, 7, 10}, 5);
        System.out.println("result: " + result);
    }
}
