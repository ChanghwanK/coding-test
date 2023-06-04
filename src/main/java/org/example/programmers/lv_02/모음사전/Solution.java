package org.example.programmers.lv_02.모음사전;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<String> wordList = new ArrayList<>();
    private static final char[] CHARS = "AEIOU".toCharArray();

    private void combo(String cur, List<String> wordList) {
        System.out.println(cur);
        wordList.add(cur);

        if (cur.length() == 5)
            return;

        for (char c : CHARS) {
            combo(cur + c, wordList);
        }
    }

    public int solution(String word) {
        List<String> wordList = new ArrayList<>();
        combo("", wordList);
        return wordList.indexOf(word);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("AAAAE");
        System.out.println("result: " + result);
    }

}
