package org.example.programmers.lv_0.안전지대;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int mineX = 0;
        int mineY = 0;
        int boardWidth = board.length * board[0].length;
        ArrayList<int []> arr = new ArrayList<>(); // mine 좌표

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    arr.add(new int[] {i,j});
                }
            }
        }

        for(int [] mine :  arr) {

        }

        return answer;
    }

    public static void main(String[] args) {
        int [][] case1 = new int [][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        Solution solution = new Solution();
        solution.solution(case1);
    }

}
