package org.example.programmers.lv_0.문자_반복_출력하기;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("hello", 3);
        System.out.println("Result: " + data);
    }

}
