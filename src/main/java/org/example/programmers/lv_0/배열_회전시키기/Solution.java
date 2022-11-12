package org.example.programmers.lv_0.배열_회전시키기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        // todo 자바에서 shift 연산이 따로 있는지 알아보기
        if (direction.equals("right")) {
            // 우측으로 쉬프트 연산
            int lastNum = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i >= 1; i--) {
                answer[i] = numbers[i-1];
            }
            answer[0] = lastNum;

        } else {
            // 좌측으로 쉬프트 연산
            int firstNum = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length - 1] = firstNum;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int [] data1 = new int[] {1,2,3};
        int [] data2 = new int[] {4, 455, 6, 4, -1, 45, 6};
        Solution solution = new Solution();

        var result = solution.solution(data1, "right");
//        var result2 = solution.solution(data2, "left");

//        System.out.println("result: " + result);
//        System.out.println("result2: " + result2);
    }
}
