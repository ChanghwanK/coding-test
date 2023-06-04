package org.example.programmers.lv_02.쿼드압축_후_개수_세기;

import java.util.Arrays;

public class Solution2 {
    private static final int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        quad(arr, 0, 0, arr.length);
        return answer;
    }

    private void quad(int[][] arr, int x, int y, int size) {
        if (zip(arr, x, y, size, arr[x][y])) {
            if (arr[x][y] == 1)
                answer[1] ++;
            else
                answer[0] ++;

            return;
        }

        int h = size / 2;
        quad(arr, x, y, h);
        quad(arr, x + h, y, h);
        quad(arr, x, y + h, h);
        quad(arr, x + h, y + h, h);
    }

    private boolean zip(int[][] arr, int x, int y, int size, int currentValue) {
        System.out.println("currentValue: " + currentValue);
        for (int i = x; i < x + size ; i++)
            for (int j = y; j < y + size; j++)
                if (arr[i][j] != currentValue)
                    return false;
        return true;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[][] {
            {1,1,0,0},
            {1,0,0,0},
            {1,0,0,1},
            {1,1,1,1}
        });
        System.out.println("result: " + Arrays.toString(result));
    }
}
