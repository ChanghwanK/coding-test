package org.example.programmers.lv_01.숫자_짝궁;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution2 {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        for (String key : X.split("")) {
            xMap.put(key, xMap.getOrDefault(key,0) + 1);
        }

        for (String key : Y.split("") ) {
            yMap.put(key, yMap.getOrDefault(key, 0) + 1);
        }

        List<String> arr = new ArrayList<>();

        for (String xKey : xMap.keySet()) {
            if(! yMap.containsKey(xKey))
                continue;

            int range = Math.min(xMap.get(xKey), yMap.get(xKey)); //
            // 공통으로 등장한 것을 찾는 것이기 때문에 min 값을 찾음
            System.out.println("cnt" + range);
            for (int i = 0; i < range; i++) {
                arr.add(xKey);
            }
        }

        System.out.println(arr);

        String result = arr.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());

        if (result.isEmpty())
            return "-1";

        if (result.replaceAll("0", "").isEmpty())
            return "0";

        return result;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("12321", "42531");
        System.out.println("result: " + result);
    }
}
