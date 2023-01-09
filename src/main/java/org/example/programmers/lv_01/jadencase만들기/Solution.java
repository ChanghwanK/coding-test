package org.example.programmers.lv_01.jadencase만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String smallS = s.toLowerCase();
        char prev = ' ';

        for(char word : smallS.toCharArray()) {
            if (prev == ' ') {
                word = Character.toUpperCase(word);
            }
            sb.append(word);
            prev = word;
        }

        return sb.toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("3people unFollowed me");
        System.out.println("result: " + result);
    }
}
