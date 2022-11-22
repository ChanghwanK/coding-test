package org.example.programmers.lv_01.최소직사각형;

public class Solution {
    /**
     * 문제에서 세로 50이란 값은
     * 가로길이 보다 작은 것
     */
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;

        for(int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            row = Math.max(row, max);
            height = Math.max(height, min);
        }
        return row * height;
    }

    public static void main(String [] args) {
        int [][] sizes = new int [][] {{60,50}, {30,70}, {60,30}, {80,40}};
        Solution solution = new Solution();
        var result = solution.solution(sizes);
        System.out.println("result: " + result);
    }
}
