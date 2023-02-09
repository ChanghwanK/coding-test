package org.example.programmers.lv_01.실패율;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    /**
     * 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
     */
    public int[] solution(int N, int[] stages) {
        int [] stageRemainUserCntArr = new int[N + 1]; // 완주가 있으니 + 1 0번은 제외이니 + 1
        Map<Integer, Double> stageFailRateMap = new HashMap<>(); // stage, 실패율

        for(int stage : stages) {
            if(stage <= N)
                stageRemainUserCntArr[stage] += 1;
        }

        int curTryCnt = stages.length; // 현재 stage 도전자 수
        // 스테이지별 실패율 구하기
        for(int stage = 1; stage <= N; stage++) {
            double remainNumber = stageRemainUserCntArr[stage];
            double failRate = remainNumber / curTryCnt;
            if(curTryCnt == 0) {
                stageFailRateMap.put(stage, 0.0);
            } else {
                stageFailRateMap.put(stage, failRate);
            }
            curTryCnt -= remainNumber;
        }

        System.out.println(stageFailRateMap);
        // 스테이지별 실패율 정렬
        int[] ans = stageFailRateMap.entrySet().stream()
            .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
            .mapToInt(Entry::getKey).toArray();

        return ans;
    }


    // 도달한 stage가 없다면 0으로
    // 3개의 스테이지 4명이 참석
    // 1번에 3명
    // 2번에 1명
    // 2 1 3
    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(3, new int[] {1, 1, 1, 2});
        var result = solution.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
        System.out.println("result: " + Arrays.toString(result));
    }
}
