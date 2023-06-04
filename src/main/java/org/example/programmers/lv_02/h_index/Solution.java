package org.example.programmers.lv_02.h_index;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 정리
     * 1. N개의 논문중 H번 이상 인용된 논문이 H편 이상이고 나머지 논문이 H번 이하 인용될 경우 H의 최댓값이 H-INDEX
     *  즉,
     *
     *  citations <- 논문 인용 횟수 배열
     *
     *  1. 배열을 돌면서 각 인덱스의 value 이상인 value를 찾고 인덱스 별로 인용 횟수가 인덱스 value보다 큰 경우를 map에 기록
     *  2.
     */
    public int solution(int[] citations) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < citations.length; i++) {
            int cnt = 0; // 더 크다면 Up
            int citation = citations[i];

            for (int j = 0; j < citations.length; j++) {
                if (i == j) continue;
                int targetCitation = citations[j];

                if (citation >= targetCitation)
                    cnt++;
            }

            map.put(citation, cnt);

        }

        System.out.println(map);

        return answer;
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {3,0,6,1,5});
        System.out.println("result: " + result);
    }

}
