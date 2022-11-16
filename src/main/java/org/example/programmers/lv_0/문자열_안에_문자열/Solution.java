package org.example.programmers.lv_0.문자열_안에_문자열;

public class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        System.out.println(data);

    }

}
