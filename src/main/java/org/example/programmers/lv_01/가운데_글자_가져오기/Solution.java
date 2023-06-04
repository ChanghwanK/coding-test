package org.example.programmers.lv_01.가운데_글자_가져오기;

public class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer += s.charAt(s.length() / 2 - 1);
            answer += s.charAt(s.length() / 2);
        } else {
            answer = String.valueOf(s.charAt(s.length() / 2));
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("qwer");
        System.out.println("result: " + result);
    }

}
