package org.example.programmers.lv_01.정수_내림차순으로_배치하기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        List<Integer> arr = new ArrayList<>();
        for(char a : num.toCharArray()) {
            arr.add(Integer.parseInt(String.valueOf(a)));
        }

        arr.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Integer a : arr) {
            sb.append(a);
        }

        return Long.parseLong(sb.toString());
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(118372);
        System.out.println("result: " + result);
    }
}
