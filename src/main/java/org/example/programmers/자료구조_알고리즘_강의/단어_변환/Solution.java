package org.example.programmers.자료구조_알고리즘_강의.단어_변환;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public static class Word {
        String word;
        int depth;
        public Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }

    public int solution(String begin, String target, String[] words) {
        if(! Arrays.asList(words).contains(target)) return 0;
        Stack<Word> stack = new Stack<>();
        stack.add(new Word(begin, 0));
        Set<String> visited = new HashSet<>();

        while(! stack.isEmpty()) {
            Word now = stack.pop();

            if(now.word.equals(target)) return now.depth;

            for(String w : words) {
                if(! changeable(now.word, w)) continue;
                if(visited.contains(w)) continue;
                visited.add(w);
                stack.add(new Word(w, now.depth + 1));
            }
        }

        return 0;
    }

    private boolean changeable(String origin, String target) {
        int len = Math.min(origin.length(), target.length());
        int cnt = 0;
        for(int i = 0; i < len; i++) if(origin.charAt(i) != target.charAt(i)) cnt++;
        return cnt == 1;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println("result: " + result);
    }
}
