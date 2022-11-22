package org.example.programmers.lv_01.과일_장수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    // k: 1 ~ k점 (최고등급)
    // 사과 한 상자의 가격

    /**
     * 사고 한 상자의 가격
     * - 한 상자에 사과 m개씩 담는다.
     * - 담긴 사과 중 가장 낮은 점수가 p인 경우 한 상자 가격은 p * m
     * 구하고자 하는 것
     * - 가능한 많은 사과를 팔았을 때 얻을 수 있는 최대이익
     * - 사과는 상자 단위로 남는 사과는 버린다.
     *
     * 1,2,3,1,2,3,1 인 경우 [2,3,2,3]으로 구상된 사과 상자 1개를 만들어 판매 했을 떄 최대 이익
     * - 2 * 4 * 1
     */
    public int solution(int k, int m, int[] score) {
        // 핵심은 최저 점수가 높을수록 가격이 높아짐
        int answer = 0;
        // 몇 상자를 만들 수 있는지 구하기
        int boxCnt = score.length / m; // 몇 상자를 만들 수 있는지// ?

        Set<Integer> scoreSet = new HashSet<>();

        for(int num : score) {
            scoreSet.add(num);
        }

        for(int i = 0; i < boxCnt; i++) {
            // 박스가 만들어짐
            int [] box = new int[m];
            // 박스에 데이터를 넣을 것
            for(int j = 0; j < m; j++) {
                // 여기서 score의 값을 가져오는 것이 안되네
                // 왜냐 최대 점수를 담아야하는데 이를 위해선 배열을 순회해야 함
                // 근데 현재 for문 에선 score 배열을 순회하기 할 수 없는 구조 (길이가 다르기 때문)
//                box[j] = score.getMax
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println("result: " + result);
//        solution.solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }

}
