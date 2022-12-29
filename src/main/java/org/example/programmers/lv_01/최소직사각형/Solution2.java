package org.example.programmers.lv_01.최소직사각형;

public class Solution2 {
    public int solution(int[][] sizes) {
        int finalXMax = 0;
        int finalYMax = 0;

        for(int [] size:sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            finalXMax = Math.max(finalXMax, max);
            finalYMax = Math.max(finalYMax, min);
        }
        return finalXMax * finalYMax;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        var result = solution.solution(sizes);
        System.out.println("result: " + result);
    }
}
