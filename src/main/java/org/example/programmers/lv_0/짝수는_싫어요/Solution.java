package org.example.programmers.lv_0.짝수는_싫어요;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int n) {

        // array는 고정된 길이를 가지기 때문에 크기가 동적으로 변할 현재 문제에 적합하지 않음
        // array를 List로 List를 배열로 바꿔주면 될 듯

        ArrayList<Integer> arr = new ArrayList<>();
        // 1은 무조건 포함됨
        arr.add(1);

        for(int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }

        int [] answer = new int[arr.size()];
        int i = 0;
        for (int num : arr) {
            answer[i] = num;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        Solution solution = new Solution();
        var data = solution.solution(b);

        for(int i = 0; i < data.length; i++) {
            System.out.println("Result: " + data[i]);
        }

    }

}
