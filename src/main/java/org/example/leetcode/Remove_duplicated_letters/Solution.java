package org.example.leetcode.Remove_duplicated_letters;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    /**
     이후 재등장하면 제거
     그렇지 않다면 바로 압축
     이후 등장하지 않으면 제거할 수 없음
     등장 한다면 일단 제외
     */
    public String removeDuplicateLetters(String s) {
        // 문자열 등장 횟수 맵을 만듬
        Map<Character, Integer> counter = new HashMap<>();

        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> seen = new HashSet<>();


        for (char c : s.toCharArray()) {
            // 처음 나오는 Counter를 감소
            // 카운터를 사용하는 이유? 등장 횟수를 체크하기 위함인 것 같음
            // 즉, 1번이면 바로 사용하고 N번이면 계속 없애기 위함인듯?
            // 왜 ? 감소시키
            // 하나 소모를 했다는 의미
            counter.put(c, counter.get(c) - 1);
            boolean res = seen.contains(c);
            if (seen.contains(c)) {
                continue;
            }

            while (!stack.isEmpty() && c < stack.peek() && counter.get(stack.peek()) > 0) {
                seen.remove(stack.pop());
            }

            stack.push(c);
            seen.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.removeDuplicateLetters("bcacb");
        System.out.println("result: " + result);
    }
}
