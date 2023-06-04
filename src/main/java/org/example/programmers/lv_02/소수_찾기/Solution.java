package org.example.programmers.lv_02.소수_찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private char [] CHARS;
    private Set<Integer> numberSet = new HashSet<>();

    private void combo(final String numbers, String cur) {
        numberSet.add(Integer.parseInt(cur));
    }

    public int solution(String numbers) {
        CHARS = numbers.toCharArray();
        int answer = 0;




        return answer;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("17");
        System.out.println("result: " + result);
    }
}
