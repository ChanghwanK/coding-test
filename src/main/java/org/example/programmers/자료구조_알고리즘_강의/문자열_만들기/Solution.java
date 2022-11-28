package org.example.programmers.자료구조_알고리즘_강의.문자열_만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String smallCaseS = s.toLowerCase();
        char last = ' ';
        for(char word : smallCaseS.toCharArray()) {
            if(last == ' ') word = Character.toUpperCase(word);
            sb.append(word);
            last = word;
        }

        return sb.toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution("3people unFollowed me");
        var result = solution.solution("A Aa");
        System.out.println("result: " + result);
    }
}
