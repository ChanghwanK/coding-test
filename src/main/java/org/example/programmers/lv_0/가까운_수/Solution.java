package org.example.programmers.lv_0.가까운_수;

import java.util.ArrayList;

public class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>(); // 차이를 저장
        for(int num : array) {
            arr.add(n - num);
        }

        System.out.println(arr);

        int index = 0;
        int min = arr.get(index);

        for(int i = 1; i < arr.size(); i++) {
            if (min > Math.abs(arr.get(i))) { // 절대값으로 해주면 m
                index = i;
                min = arr.get(index);
            }
        }

        for(int i = 0; i < arr.size(); i++) {
            if(Math.abs(min) == arr.get(i)) {
                index = i;
            }
        }
        answer = array[index];
        return answer;
    }

    public static void main(String[] args) {
        int [] testCase1 = new int[] {19, 21};
        int [] testCase2 = new int[] {3, 100, 97};
        int n = 20;
        Solution solution = new Solution();
////        var result0 = solution.solution(testCase1, n);
//        System.out.println(result0);
        var result = solution.solution(testCase2, n);
        System.out.println(result);

    }
}
