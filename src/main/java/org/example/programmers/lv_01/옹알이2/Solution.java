package org.example.programmers.lv_01.옹알이2;

import java.util.Arrays;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        // 단어별 검사
        // 연속된 단어는 불가능함
        int idx = 0;
        String [] canWords = {"aya", "ye", "woo", "ma"};

        for(String target : babbling) {
            if(target.contains("ayaaya") || target.contains("yeye") || target.contains("woowoo") || target.contains("mama")) {
                continue;
            }

            for(String canWord : canWords) {
                target = target.replace(canWord, "");
            }

            babbling[idx] = target;
            idx++;
        }

        System.out.println(Arrays.toString(babbling));

        for(String s : babbling) if(s.length() == 0) answer++;
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        System.out.println("result: " + result);
    }

}
