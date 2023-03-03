package org.example.programmers.lv_01.가장_가까운_글자_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public int[] solution(String s) {
        int len = s.length();
        List<Character> container = new ArrayList<>();
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            char curWord = s.charAt(i);
            String tempWord = s.substring(0, i);

            if(container.contains(curWord)) {
                answer[i] = i - tempWord.lastIndexOf(curWord);
            } else {
                answer[i] = -1;
            }

            container.add(curWord);

        }

        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("banana");
        System.out.println("result: " + Arrays.toString(result));
    }
}
