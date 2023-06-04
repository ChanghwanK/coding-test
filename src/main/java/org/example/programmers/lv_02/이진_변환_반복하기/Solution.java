package org.example.programmers.lv_02.이진_변환_반복하기;

import java.util.Arrays;

public class Solution {
    private int changeCnt;
    private int zeroCnt;

    public int[] solution(String s) {
        while (true) {
            if (s.equals("1")) {
                break;
            }

            s = changBinary(s);
            changeCnt++;
        }
        return new int[] {changeCnt, zeroCnt};
    }

    private String changBinary(String x) {
        //x의 모든 0을 제거합니다.
        String zeroRemovedValue = x.replaceAll("0","");
        zeroCnt += x.length() - zeroRemovedValue.length();

        // x의 길이를 c라고 하면,
        // x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.

        // 변경된 후? 아님 변경 전?
        int c = zeroRemovedValue.length();
        x = Integer.toString(c, 2);

        return x;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();

//        solution.changBinary("0111010");
        var result = solution.solution("01110");
        System.out.println("result: " + Arrays.toString(result));
    }

}
