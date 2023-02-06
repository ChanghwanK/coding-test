package org.example.programmers.lv_02.스킬_트리;

public class Solution2 {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            String tree = skill_tree;
            for (int i = 0; i < tree.length(); i++) {
                String t = String.valueOf(tree.charAt(i));
                if (!skill.contains(t)) {
                    tree = tree.replaceAll(t, "");
                }
            }
            if (skill.indexOf(tree) == 0) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println("result: " + result);
    }
}
