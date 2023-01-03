package org.example.baekjoon.체스판다시칠하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int row, col;
    static String [][] board;
    static int ans;

    static void input() {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();

        board = new String[row][col];

        for(int i = 0; i < row; i++) board[i] = sc.next().split("");

        for(String[] bo : board) {
            System.out.println(Arrays.toString(bo));
        }

    }

    /**
     * 흰색 판으로 칠하기
     */
    public static int getWhiteSolution(int startRow, int startCol) {
        String [][] originWhite = {
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"}
        };
        return 0;
    }

    /**
     * 검정 판으로 칠하기
     */
    public static int getBlackSolution(int startRow, int startCol) {
        return 0;
    }

    public static void main(String[] args) {
        input();
        // 8 * 8 체스판에서 바꿔야하는 좌표 개수

    }

}
