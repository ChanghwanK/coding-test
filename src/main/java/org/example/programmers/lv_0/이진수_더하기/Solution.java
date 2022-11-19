package org.example.programmers.lv_0.이진수_더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int i = Integer.parseInt(bin1, 2);
        int j = Integer.parseInt(bin2, 2);

        int result = i + j;
        answer = Integer.toBinaryString(result);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution("10", "11"));
    }
}
