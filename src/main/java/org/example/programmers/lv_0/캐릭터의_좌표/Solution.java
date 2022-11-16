package org.example.programmers.lv_0.캐릭터의_좌표;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int [] answer = {0,0};
        for(String s : keyinput) {
            switch(s) {
                case "left":
                    if(answer[0] <= -(board[0] / 2)) {
                        continue;
                    }
                    answer[0] -= 1;
                case "right":
                    if(answer[0] >= (board[0] / 2)) {
                        continue;
                    }
                    answer[0] += 1;
                case "up":
                    if(answer[1] >= board[1] / 2) {
                        continue;
                    }
                    answer[1] += 1;
                default:
                    if (answer[1] <= -(board[1] / 2)) {
                        continue;
                    }
                    answer[1] -= 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] strs = new String[]{"left", "right", "up", "right", "right"};
        int [] case1 = solution.solution(strs, new int[]{11,11});
        System.out.println("result: " + Arrays.toString(case1));
    }
}
