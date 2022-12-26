package org.example.programmers.lv_02.짝지어_제거하기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Solution {
    static final HashMap<String, Integer> wordMap = new LinkedHashMap<>();
    public int solution(String s) {
        Set<String> wordSet = new HashSet<>();
//        mapInit();
        for (char a : s.toCharArray()) {
            wordSet.add(String.valueOf(a));
        }


        // 포함된 문자만 검사하도록 변경
        for (String key : wordSet) {
            s = s.replaceAll(key.repeat(2), "");
        }

        if (s.equals("")) return 1;
        return 0;
    }

    void mapInit() {
        List<String> words = new ArrayList<>();

        for(int i = 97; i <= 122; i++)
            words.add(String.valueOf((char) i).repeat(2));

        for (String word : words)
            wordMap.put(word, 0);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("baabaa");
//        var result = solution.solution("cdcd");
        System.out.println("result: " + result);
    }
}
