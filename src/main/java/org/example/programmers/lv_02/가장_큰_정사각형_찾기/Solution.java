package org.example.programmers.lv_02.가장_큰_정사각형_찾기;

class Solution {

    public int solution(int[][] board) {
        int[][] map = new int[board.length + 1][board[0].length + 1];

        int maxLen = 0;
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if(board[i-1][j-1] != 0) {
                    int resultA = Math.min(map[i - 1][j], map[i][j - 1]);
                    int min = Math.min(resultA, map[i - 1][j - 1]);
                    map[i][j] = min + 1;

                    maxLen = Math.max(maxLen, min + 1);
                }
            }
        }

        return maxLen * maxLen;
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        int [][] board = new int[][] {
            {0,2,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {0,0,1,0}
        };

        var result = solution.solution(board);
        System.out.println("result: " + result);
    }
}
