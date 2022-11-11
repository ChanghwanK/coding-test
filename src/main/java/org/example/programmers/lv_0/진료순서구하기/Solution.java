package org.example.programmers.lv_0.진료순서구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        ArrayList<Integer> arr = new ArrayList<>();

        for(int num : emergency) {
            arr.add(num);
        }

        arr.sort(Collections.reverseOrder());

        for(int i = 0; i < emergency.length; i++) {
            System.out.println(arr.get(i));
            for(int j = 0; j < emergency.length; j++) {
//                System.out.println(emergency[i]);
                if(arr.get(i) == emergency[j]) {
                    answer[j] = i + 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        var result = solution.solution(new int[] {30, 10, 23, 6, 100});
        var result = solution.solution(new int[] {3,76,24});
        System.out.println("Result >>> " + Arrays.toString(result));
    }

}
