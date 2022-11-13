package org.example.programmers.lv_0.문자열_정렬하기_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (isNumber(a)) {
                int num = Integer.parseInt(String.valueOf(a));
                arr.add(num);
            }
        }

        Collections.sort(arr);
        answer = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    private boolean isNumber(char a) {
        if (a == 0) return true;
        for(int i = 0; i < 10 ; i++) {
            if(a == i + 49) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("abcde0");
        System.out.print("result: ");
        System.out.println(Arrays.toString(data));
    }
}
