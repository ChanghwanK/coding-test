package org.example.programmers.lv_01.과일_장수;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    private int getMinValueInList(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr)
            if(min > num) min = num;
        return min;
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 1, 2, 3, 1, 2, 3, 1
        // 3, 3, 2, 2, 1, 1, 1
        // 2 * 4
        int totalCnt = score.length;
        List<Integer> scoreList = Arrays.stream(score)
            .boxed()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());

        int curIndex = 0;

        while(totalCnt >= m) {
            List<Integer> subedScoreList = scoreList.subList(curIndex, curIndex + m);
            curIndex += m;
            int min = getMinValueInList(subedScoreList);
            answer += (min * m);
            totalCnt -= m;
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(3, 4, new int[]{1,2,3,1,2,3,1});
        var result = solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("result: " + result);
    }
}
