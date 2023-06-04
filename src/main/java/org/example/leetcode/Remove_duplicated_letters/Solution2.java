package org.example.leetcode.Remove_duplicated_letters;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    /**
     이후 재등장하면 제거
     그렇지 않다면 바로 압축
     이후 등장하지 않으면 제거할 수 없음
     등장 한다면 일단 제외
     */
    public String removeDuplicateLetters(String s) {
        // 문자열 등장 횟수 맵을 만듬
        // stack과 set을 활용
        char [] wordArray = s.toCharArray();

        Map<Character, Integer> counter = new HashMap<>();
        for (char c : wordArray)
            counter.put(c, counter.getOrDefault(c, 0) + 1);

        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> seen = new HashSet<>();

        for (char c : wordArray) {
            // 등장한 것 한번 사용한 것이기 때문에 감소
            counter.put(c, counter.get(c) - 1);

            // 처리된 것이면 skip
            if (seen.contains(c)) {
                continue;
            }

            // Stack이 비지 않고 스택의 마지막 값이 target보다 더 크면서(사전순) 스택의 마지막 값이 아직 더 존재할 경우
            // 제거
            while (! stack.isEmpty() && c < stack.peek() && counter.get(stack.peek()) > 0) {
                seen.remove(stack.pop());
            }

            stack.push(c);
            seen.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while (! stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.removeDuplicateLetters("bcacb");
        System.out.println("result: " + result);
    }
}
