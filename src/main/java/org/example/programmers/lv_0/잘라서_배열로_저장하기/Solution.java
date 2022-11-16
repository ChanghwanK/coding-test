package org.example.programmers.lv_0.잘라서_배열로_저장하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length()); // 최대가 length 만큼 가야하니 비교함
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Result: "+ Arrays.toString(solution.solution("abc1Addfggg4556b", 6)));
//        System.out.println("Result: "+ Arrays.toString(solution.solution("abcdef123", 3)));
//        solution.solution("abcdef123", 3);
    }

}
