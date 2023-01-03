package org.example.programmers.lv_0.겹치는_선분의_길이;

public class Solution2 {
    public int solution(int[][] lines) {
        int answer = 0;
        int [] arr = new int[200];

        for(int[] line : lines) {
            for(int i = line[0] + 100; i < line[1] + 100; i++) {
                arr[i] += 1;
            }
        }

        for(int a : arr) {
            if (a > 1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr [][] = new int[][] {{0, 1}, {2, 5}, {3, 9}};
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(arr));
    }
}
