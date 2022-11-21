package org.example.programmers.lv_01.푸드파이터_대회;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public String solution(int[] food) {
        String answer = "0";
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
                System.out.println("ans: " + answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] food = new int[]{1,3,4,6};
        Solution2 solution = new Solution2();
        System.out.println("result: " + solution.solution(food));
    }

}
