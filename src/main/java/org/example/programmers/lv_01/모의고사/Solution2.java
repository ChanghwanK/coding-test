package org.example.programmers.lv_01.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int [] no1 = {1, 2, 3, 4, 5};
        int [] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == no1[i % 5]) scores[0]++;
            if(answers[i] == no2[i % 8]) scores[1]++;
            if(answers[i] == no3[i % 10]) scores[2]++;
        }


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
        Solution2 solution = new Solution2();
        int [] ans = {1,2,3,4,5};
        var result = solution.solution(ans);
        System.out.println("result: " + Arrays.toString(result));
    }
}
