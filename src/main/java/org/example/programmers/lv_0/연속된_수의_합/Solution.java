package org.example.programmers.lv_0.연속된_수의_합;

import java.util.*;

public class Solution {

    /**
     *  연속된 정수 N개를 합쳐서 total
     */
    public int[] solution(int num, int total) {
        int[] answer = {};
        List<Integer> arr = new LinkedList<>();

        int a = (((2 * total) / num) - (num - 1)) / 2;
        System.out.println("a: " + a);
        for(int i = a; i < a+num ; i++) {
            arr.add(i);
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3,12);
    }

}
