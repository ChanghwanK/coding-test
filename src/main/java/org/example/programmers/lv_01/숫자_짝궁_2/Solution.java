package org.example.programmers.lv_01.숫자_짝궁_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
     *
     * 예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다.
     * 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
     *
     * 짝꿍을 return하는 solution 함수를 완성해주세요.
     */
    public String solution(String X, String Y) {
        String answer = "";
        // x,y 공통으로 나오는 문자를 찾아야 함
        List<Character> common = new ArrayList<>();
        Map<Character, Integer> xWordMap = new HashMap<>();
        Map<Character, Integer> yWordMap = new HashMap<>();

        for (int i = 0; i < X.length(); i++) {
            char key = X.charAt(i);
            xWordMap.put(key, xWordMap.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < Y.length(); i++) {
            char key = Y.charAt(i);
            yWordMap.put(key, yWordMap.getOrDefault(key, 0) + 1);
        }

        for (Character key : xWordMap.keySet()) {
            if (! yWordMap.containsKey(key))
                continue;

            int minCnt = Math.min(xWordMap.get(key), yWordMap.get(key));

            for (int i = 0; i < minCnt; i++) {
                common.add(key);
            }
        }

        if (common.size() == 0)
            return "-1";

        common.sort((o1, o2) -> o2 - o1);
        StringBuilder sb = new StringBuilder();

        for (Character a : common)
            sb.append(a);

        String a = sb.toString();

        if (a.replaceAll("0","").isEmpty())
            return "0";

        return a;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        String x = "100";
//        String y = "2345";
        String x = "12321";
        String y = "42531";
        var result = solution.solution(x, y );
        System.out.println("result: " + result);
    }

}
