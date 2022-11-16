package org.example.programmers.lv_0.직사각형_넓이_구하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xlen = 0, ylen = 0;
        int [] xArray = new int[dots.length];
        int [] yArray = new int[dots.length];
        for(int i = 0; i < 4; i++) {
            int [] a = dots[i];
            xArray[i] = a[0];
            yArray[i] = a[1];
        }

        System.out.println(Arrays.toString(xArray));
        System.out.println(Arrays.toString(yArray));

        xlen = Arrays.stream(xArray).max().getAsInt() - Arrays.stream(xArray).min().getAsInt();
        ylen = Arrays.stream(yArray).max().getAsInt() - Arrays.stream(yArray).min().getAsInt();

        return Math.abs(xlen * ylen);
    }

    public static void main(String[] args) {
        int [][] a = new int[][] {{1,1}, {2,1}, {2,2}, {1,2}};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.solution(a));
    }

}
