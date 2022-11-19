package org.example.programmers.lv_0.등수_매기기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    // 영어, 수학
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Double> oneStudentAvgs = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            System.out.println(Arrays.toString(score[i]));
            double avg = (double) (score[i][0] + score[i][1]) / 2;
            oneStudentAvgs.add(avg);
        }
        // 정렬전
        System.out.println("정렬 전");
        System.out.println(oneStudentAvgs);
        return getRank(oneStudentAvgs.size(), oneStudentAvgs.stream().mapToDouble(Double::doubleValue).toArray());
    }

    private int[] getRank(int size, double [] avgScores) {
        int [] answers = new int[size];
        for(int i = 0; i < size; i++) {
            int cnt = 1;
            for(int j = 0; j < size; j++) {
                if(avgScores[i] < avgScores[j]) {
                    cnt++;
                }
            }
            answers[i] = cnt;
        }
        return answers;
    }

    public static void main(String[] args) {
//        int [][] scores = new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int [][] scores = new int[][] {{1,2}, {1,1}, {1,1}};
        Solution solution = new Solution();
        System.out.println("result: " + Arrays.toString(solution.solution(scores)));
    }
}
