package org.example.programmers.lv_02.스킬_트리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class OtherSolution {
    public int solution(String skill, String[] skill_trees) {
        int answer;
        ArrayList<String> skillTrees = new ArrayList<>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();

//        while (it.hasNext()) {
//            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                it.remove();
//            }
//        }

        while (it.hasNext()) {
            var a = it.next().replaceAll("[^" + skill + "]", "");
            System.out.println("valid word: " + a);
            System.out.println("skill: " + skill);
            System.out.println("index of: " + skill.indexOf(a));
            System.out.println();
            // index of는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환한다.
            if (skill.indexOf(a) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

    public static void main(String [] args) {
        OtherSolution solution = new OtherSolution();
        var result = solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println("result: " + result);
    }
}
