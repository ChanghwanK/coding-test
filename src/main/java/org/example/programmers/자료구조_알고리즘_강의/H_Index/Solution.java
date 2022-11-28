package org.example.programmers.자료구조_알고리즘_강의.H_Index;

import java.util.ArrayList;

public class Solution {

    /**
     *
     * @param citations: 논문 인용 횟수 배열
     * @return: h- index
     */
    public int solution(int[] citations) {
        int answer = 0;
        // 3, 0, 6, 1, 5
        // h index는 n이상이 n개 이상인 케이스를 찾아야함
        // h index를 6이라 하면 인용된 논문이 6편이상이 없음

        // citations를 돌면서 hindex 조건에 충족하는지 검사 충족한다면 return
        ArrayList<Integer> answers = new ArrayList<>();

        for(int citation : citations) {
            int hIndex = citation; // 첫번째 숫자부터 hindex 조건에 맞는지 검사
            int largeCnt = 0;    // 이상 체크 카운트
            int smallCnt = 0;    // 이하 체크 카운트

            for(int i = 0; i < citations.length ; i++) {
                if(hIndex >= citations[i]) largeCnt++;

                if(hIndex <= citations[i]) smallCnt++;
            }

            if(largeCnt >= hIndex && smallCnt <= hIndex) answers.add(hIndex);
        }

        return  answers.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {3, 0, 6, 1, 5});
        System.out.println("result: " + result);
    }
}
