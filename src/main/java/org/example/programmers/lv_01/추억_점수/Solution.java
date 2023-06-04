package org.example.programmers.lv_01.추억_점수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다.
 *  예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 [5점, 10점, 1점]일 때
 *  해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다.
 *
 *  return  사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요
 *
 */
public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 이름 점수
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String s : photo[i]) {
                try {
                    score += map.get(s);
                } catch (NullPointerException ex) {
                    score += 0;
                }
            }

            answer[i] = score;
        }


        return answer;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        String [] name = {"may", "kein", "kain", "radi"};
        int [] yearing = {5,10, 1, 3};
        String [][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };

        var result = solution.solution(name, yearing, photo);
        System.out.println("result: " + Arrays.toString(result));
    }
}
