package org.example.programmers.lv_01.옹알이2;

import java.util.Arrays;

public class Solution2 {
    public int solution(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if(babblings[i].length()  == 0) answer++;

        }

        System.out.println(Arrays.toString(babblings));
        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        System.out.println("result: " + result);
    }

}
