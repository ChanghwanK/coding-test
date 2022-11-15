package org.example.programmers.lv_0.약수_구하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n ; i++) {
            if(n % i == 0) arr.add(i);
        }
        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(24)));
        System.out.println(Arrays.toString(solution.solution(29)));
    }

}
