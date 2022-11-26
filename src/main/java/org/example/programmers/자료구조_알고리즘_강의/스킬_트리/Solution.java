package org.example.programmers.자료구조_알고리즘_강의.스킬_트리;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    static String mySkill;
    static List<String> skillArray;
    public int solution(String skill, String[] skill_trees) {
        // 핵심은 skill 과 관련된 word를 빼고 지우는 것인데
        // 나는 반복문으로 하려고 했고
        // 강의에선 regex로 치환함
        // regex를 생각하지 못한 것이 아쉽
        return (int) Arrays.stream(skill_trees)
            .map(s -> s.replaceAll("[^"+skill+"]", ""))
            .filter(skill::startsWith)
            .count();
    }

    private void checkTree(String tree) {
        // tree
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println("result: " + result);
    }
}
