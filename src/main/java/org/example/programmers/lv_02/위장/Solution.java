package org.example.programmers.lv_02.위장;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 매일 다른 옷을 입어야함
     * - 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
     */
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (String [] cl : clothes) {
            map.put(cl[1], map.getOrDefault(cl[1], 0) + 1);
        }

        for(Integer integer : map.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        String [][] clothes = {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };

        var result = solution.solution(clothes);
        System.out.println("result: " + result);
    }
}
