package org.example.programmers.lv_01.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        // 수포자 패턴들 초기화
        int [] no1 = {1, 2, 3, 4, 5};
        int [] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3]; // 획득한 점수

        int no1Cnt = 0;

        for(int i = 0; i < no1.length; i++) {
            if(no1[i] == answers[i % answers.length]) no1Cnt++;
            scores[0] = no1Cnt;
        }

        int no2Cnt = 0;
        for(int i = 0; i < no2.length; i++) {
            if(no2[i] == answers[i % answers.length]) no2Cnt++;
            scores[1] = no2Cnt;
        }

        int no3Cnt = 0;
        for(int i = 0; i < no3.length; i++) {
            if(no3[i] == answers[i % answers.length]) no3Cnt++;
            scores[2] = no3Cnt;
        }

        System.out.println(Arrays.toString(scores));
        int maxScore = 0;
        for(int score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(scores[i] == maxScore) {
                ans.add(i + 1);
            }
        }

        ans.sort(Comparator.comparingInt(o -> o));

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [] ans = {1,2,3,4,5};
        var result = solution.solution(ans);
        System.out.println("result: " + Arrays.toString(result));
    }
}
