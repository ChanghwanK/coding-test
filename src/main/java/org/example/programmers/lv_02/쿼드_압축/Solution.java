package org.example.programmers.lv_02.쿼드_압축;

import java.util.Arrays;

public class Solution {
    int arr[][];
    int [] answer = new int[2];

    private void quad(int x, int y, int size) {
        if (isCompress(x, y, size, arr[x][y])) {
            int curValue = arr[x][y];

            if (curValue == 1) {
                answer[1] ++;
            } else {
                answer[0] ++;
            }

            return;
        }

        int newSize =  size / 2;
        quad(x, y, newSize);
        quad(x + newSize, y, newSize);
        quad(x, y + newSize, newSize);
        quad(x + newSize, y + newSize, newSize);
    }

    private boolean isCompress(int x, int y, int size, int currentValue) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != currentValue)
                    return false;
            }
        }

        return true;
    }

    public int[] solution(int[][] arr) {
        this. arr = arr;
        quad(0, 0, arr.length);
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[][] {
            {1,1,0,0},
            {1,0,0,0},
            {1,0,0,1},
            {1,1,1,1}
        });
        System.out.println("result: " + Arrays.toString(result));
    }
}
