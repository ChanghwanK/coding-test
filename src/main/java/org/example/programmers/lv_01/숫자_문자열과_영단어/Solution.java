package org.example.programmers.lv_01.숫자_문자열과_영단어;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    final static Map<String, String> numberMap = new HashMap<>();

    void init() {
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
    }

    public int solution(String s) {
        // one4seveneight -> 1478
        init();
        Set<String> keys = numberMap.keySet();

        for(String key : keys) {
            while(s.contains(key)) {
                s = s.replace(key, numberMap.get(key));
            }
        }

        return Integer.parseInt(s);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("23four5six7");
        System.out.println("result: " + result);
    }
}
