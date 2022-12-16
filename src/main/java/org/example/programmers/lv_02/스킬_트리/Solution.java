package org.example.programmers.lv_02.스킬_트리;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // 스킬 트리속 스킬들이 스킬 트리와 같은지 검사
        for (String skillTree : skill_trees) {
            if (isValidOrder(skill, getValidWord(skill, skillTree))) answer++;
        }
        return answer;
    }

    String getValidWord(String answers, String skillTree) {
        StringBuilder sb = new StringBuilder();
        for(char s : skillTree.toCharArray()) {
            if (answers.contains(String.valueOf(s))) sb.append(s);
        }

        return sb.toString();
    }

    boolean isValidOrder(String skill, String validWord) {
        for(int i = 0; i < validWord.length(); i++) {
            if (validWord.charAt(i) != skill.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println("result: " + result);
    }
}
