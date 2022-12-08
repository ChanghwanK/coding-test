package org.example.programmers.lv_02.할인_행사;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        //치킨, 사과, 사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            int end = i + 10;
            for(int j = i; j < end; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            if(isEqual(wantMap, discountMap)) answer++;
        }

        return answer;
    }

    public boolean isEqual(Map<String, Integer> wantMap, Map<String, Integer> compareMap) {
        for (String key : wantMap.keySet()) {
            if (!compareMap.containsKey(key) || ! wantMap.get(key).equals(compareMap.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        String [] want = {"banana", "apple", "rice", "pork", "pot"};
        int [] number = {3,2,2,2,1};
        String  [] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        var result = solution.solution(want, number, discount);
        System.out.println("result: " + result);
    }
}
