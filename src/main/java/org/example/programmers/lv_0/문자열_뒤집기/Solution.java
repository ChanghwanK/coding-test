package org.example.programmers.lv_0.문자열_뒤집기;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0 ; i--) {
            sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("bread");
        System.out.println("Result: " + data);
    }
}
