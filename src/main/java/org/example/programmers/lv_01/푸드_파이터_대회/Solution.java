package org.example.programmers.lv_01.푸드_파이터_대회;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        LinkedList<Integer> answers = new LinkedList<>();
        for(int i = 1; i < food.length; i++) {
            int foodCnt = food[i];
            if(foodCnt % 2 == 1) foodCnt -= 1;

            for(int j = 0; j < foodCnt/2; j++) {
                answers.add(i);
            }
        }

        answers.add(0);
        List<Integer> newArr = new ArrayList<>(answers);
        newArr.sort(Collections.reverseOrder());
        answers.addAll(newArr);
        answers.remove(answers.size() - 1);
        // System.out.println("====");
        // System.out.println(answers);
        StringBuilder sb = new StringBuilder();
        for(Integer integer : answers) {
            sb.append(integer);
        }

        return sb.toString();
    }
}
