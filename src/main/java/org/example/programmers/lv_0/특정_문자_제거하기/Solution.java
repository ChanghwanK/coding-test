package org.example.programmers.lv_0.특정_문자_제거하기;

public class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == letter.charAt(0)) {
                continue;
            }
            sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("BCBdbe", "B");
        System.out.println("Result: " + result);
    }

}
