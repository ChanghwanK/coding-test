package org.example.programmers.lv_01.명예의_전당;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static class HallOfFame {
        private List<Integer> scores = new ArrayList<>();

        public void sortByASC() {
            this.scores.sort(Comparator.naturalOrder());
        }

        public void sortByDSC() {
            this.scores.sort(Comparator.reverseOrder());
        }

        public int getKIndexScore(int k) {
            return scores.get(k);
        }

        public void addScoreInHallOfFame(int score) {
            this.scores.add(score);
        }

        public void removeKIndexHallOfFame(int k) {
            this.scores.remove(k);
        }

        public int getMinScoreInHallOfFame() {
            this.sortByASC();
            return this.scores.get(0);
        }
    }

    public int[] solution(int k, int[] score) {
        HallOfFame hallOfFame = new HallOfFame();
        List<Integer> minScores = new ArrayList<>();

        for(int i = 1; i <= score.length; i++) {
            int curScore = score[i - 1];
            if(i <= k) {
                hallOfFame.addScoreInHallOfFame(curScore);
            } else {
                hallOfFame.sortByDSC();
                int kIndexScore = hallOfFame.getKIndexScore(k - 1);
                if(curScore > kIndexScore) {
                    hallOfFame.removeKIndexHallOfFame(k - 1);
                    hallOfFame.addScoreInHallOfFame(curScore);
                }
            }

            minScores.add(hallOfFame.getMinScoreInHallOfFame());
        }

        return minScores.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200});
        System.out.println("result: " + Arrays.toString(result));
    }
}
