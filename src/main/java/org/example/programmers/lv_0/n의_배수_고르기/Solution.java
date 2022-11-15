package org.example.programmers.lv_0.n의_배수_고르기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) arr.add(numlist[i]);
        }
        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int [] arr = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Solution solution = new Solution();
        System.out.println("result: " + Arrays.toString(solution.solution(n, arr)));
    }

}
