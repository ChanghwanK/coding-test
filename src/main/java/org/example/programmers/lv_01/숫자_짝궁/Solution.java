package org.example.programmers.lv_01.숫자_짝궁;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        List<String> list = new ArrayList<>();

        // 각 숫자가 몇번 등장했는지 맵핑해둠
        for(String key: X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0)+1);
        }

        for(String key: Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }

        // y에 공통으로 나오는 것들을 찾음
        for(String xkey: xMap.keySet()) {
            if(!yMap.containsKey(xkey)) continue;

            // 포함하고 있다면 최솟값을 찾음
            int length = Math.min(xMap.get(xkey), yMap.get(xkey));
            for(int i = 0; i < length; i++) {
                list.add(xkey);
            }
        }

        String result = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());

        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0", "").isEmpty()) return "0";
        return result;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("12321", "42531");
        System.out.println("result: " + result);
    }
}
