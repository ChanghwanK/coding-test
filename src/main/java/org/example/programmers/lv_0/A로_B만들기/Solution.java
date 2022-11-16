package org.example.programmers.lv_0.A로_B만들기;

import java.util.Arrays;

public class Solution {
    public int solution(String before, String after) {
        // 등장한 문자의 개수가 같다면 동일한 문자이다.
        // before after 문자열 길이는 같기 때문에 길이 비교는 고려하지 않아도 된다.

        int [] beforeArr = new int[26];
        int [] afterArr = new int[26];

        for(int i = 0; i < before.length(); i++) {
            beforeArr[before.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < after.length(); i++) {
            afterArr[after.charAt(i) - 'a'] += 1;
        }
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("olleh", "hello");
        System.out.println("Result: " + result);
    }

}
