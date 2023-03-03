package org.example.programmers.lv_01.가장_가까운_글자_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] solution(String s) {
        int [] ans = new int[s.length()];
        HashMap<Character, Integer> wordIndexMap = new HashMap<>();
        List<Character> wordContainer = new ArrayList<>();
        int index = 0;

        for(char word : s.toCharArray()) {
            if(wordContainer.contains(word)) {
                int oldIdx = wordIndexMap.get(word);
                wordIndexMap.put(word, index);
                ans[index] = index - oldIdx;
            } else {
                wordContainer.add(word);
                ans[index] = -1;
                wordIndexMap.put(word, index);
            }

            index++;
        }

        return ans;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("foobar");
        System.out.println("result: " + Arrays.toString(result));
    }
}
