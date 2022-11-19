package org.example.programmers.자료구조_알고리즘_강의.자연수_뒤집_배열로_만들기;

import java.util.ArrayList;

public class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = {};
        for(int i = s.length() -1; i >= 0; i--) {
            arr.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(12345);
    }

}
