package org.example.programmers.lv_01.과일_장수;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        // 코드의 핵심은 i - m
        // i - m 인 이유는 총 개수에서 m만큼 빼니까
        for(int i = score.length; i >= m; i -= m){
            // 최소 점수 *
            answer += score[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        var result = solution.solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1});
        var result = solution.solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("result: " + result);
    }

}
