package org.example.programmers.자료구조_알고리즘_강의.끝말_잇기;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public boolean solution(String[] words) {
        boolean answer = true;
        Set<String> wordsSet = new LinkedHashSet<>(Arrays.asList(words));

        // 중복된 단어가 있는지 검사
        if(words.length != wordsSet.size()) return false;

        // set
        var wordList = wordsSet.stream().map(String::new).collect(Collectors.toList());

        for(int i = 1; i < wordList.size(); i++) {
            String s = wordList.get(i - 1);
            char lastChar = s.charAt(s.length() - 1);

            if(!wordList.get(i).startsWith(String.valueOf(lastChar))) return false;
        }

        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"tank", "kick", "know", "wheel", "land", "dream"});
    }
}
