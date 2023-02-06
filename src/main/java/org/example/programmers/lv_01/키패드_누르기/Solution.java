package org.example.programmers.lv_01.키패드_누르기;

public class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int lCurPosition = 10;
        int rCurPosition = 12;

        /**
         * int leftdist = Math.abs(tmp - left) / 3 + Math.abs(tmp - left) % 3;
         * int rightdist = Math.abs(tmp - right) / 3 + Math.abs(tmp - right) % 3;
         * int leftdist = Math.abs(temp - left) % 3 + Math.abs(temp - left) / 3
         * int rightdist = Math.abs(temp - right) % 3 + Math.abs(temp - right) / 3
         */
        for(int num : numbers) {
            if(num == 1 || num == 4 || num == 7) {
                lCurPosition = num;
                sb.append("L");
            } else if(num == 3 || num == 6 || num == 9) {
                rCurPosition = num;
                sb.append("R");
            } else {
                if(num == 0) num = 11;
                int leftdist = Math.abs(num - lCurPosition) % 3 + Math.abs(num - lCurPosition) / 3;
                int rightdist = Math.abs(num - rCurPosition) % 3 + Math.abs(num - rCurPosition) / 3;

                if(leftdist < rightdist) {
                    sb.append("L");
                    lCurPosition = num;
                } else if(rightdist < leftdist ) {
                    sb.append("R");
                    rCurPosition = num;
                } else {
                    if(hand.equals("left")) {
                        sb.append("L");
                        lCurPosition = num;
                    } else {
                        sb.append("R");
                        rCurPosition = num;
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        var result = solution.solution(numbers, hand);
        System.out.println("result: " + result);
    }

}
