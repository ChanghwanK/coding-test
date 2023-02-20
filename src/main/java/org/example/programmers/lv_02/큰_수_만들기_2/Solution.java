package org.example.programmers.lv_02.큰_수_만들기_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    char [] pieceOfInputNumber;
    char [] selected;
    List<String> nums = new ArrayList<>();

    public String solution(String number, int k) {
        String answer = "";
        pieceOfInputNumber = number.toCharArray();
        selected = new char[pieceOfInputNumber.length - k];

        // 조합 찾기
        createNumCombo(k, 0, 0);

        nums.sort(Comparator.reverseOrder());

        // nums에서 가장 큰 값 찾기
        answer = nums.get(0);
        return answer;
    }

    private void createNumCombo(final int k, int idx, int start) {
        if(idx == pieceOfInputNumber.length - k) {
            StringBuilder sb = new StringBuilder();
            for(char num : selected) {
                sb.append(num);
            }

            nums.add((sb.toString()));
            return;
        }

        for(int i = start; i < pieceOfInputNumber.length; i++) {
            selected[idx] = pieceOfInputNumber[i];
            createNumCombo(k, idx + 1, i + 1);
        }
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("4177252841", 4);
        System.out.println("result: " + result);
    }
}
