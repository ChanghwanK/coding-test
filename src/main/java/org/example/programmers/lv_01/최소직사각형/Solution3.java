package org.example.programmers.lv_01.최소직사각형;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int solution(int[][] sizes) {
        List<Integer> maxArr = new ArrayList<>();
        List<Integer> minArr = new ArrayList<>();

        for(int [] size : sizes) {
            maxArr.add(Math.max(size[0], size[1]));
            minArr.add(Math.min(size[0], size[1]));
        }

        int maxLenInMaxArr = maxArr.stream().mapToInt(Integer::intValue).max().getAsInt();
        int maxLenInMinArr = minArr.stream().mapToInt(Integer::intValue).max().getAsInt();

        return maxLenInMaxArr * maxLenInMinArr;
    }

    public static void main(String [] args) {
        Solution3 solution = new Solution3();
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        var result = solution.solution(sizes);
        System.out.println("result: " + result);
    }
}
