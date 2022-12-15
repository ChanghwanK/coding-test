package org.example.programmers.lv_02.큰_수_만들기;

public class Solution {
    // 순서를 바꾸지 못함
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int limitLen = number.length() - k;
        int start = 0;

        while(start < number.length() && answer.length() != limitLen) {
            int leftNum = k + answer.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            answer.append(Integer.toString(max));
        }
        return answer.toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("1924", 2);
        System.out.println("result: " + result);
    }
}
