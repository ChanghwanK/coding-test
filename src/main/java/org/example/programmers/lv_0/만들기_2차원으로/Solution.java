package org.example.programmers.lv_0.만들기_2차원으로;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for(int i = 0; i < num_list.length / n; i++) {
            int [] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = num_list[i * n + j]; // 나는 자꾸 초기값으로 돌아갔기에 123 123 123 와 같은 형태로만 됨 n만큼 점프가 되었어야 하는데 그러기 위해선 곱하기를 해주면 됨
                // 반복은 + 1 씩하고 싶지만 내부에서 값을 n 만큼 점프하고 싶다면 곱하기 i * n 해주면됨
            }
            answer[i] = arr;
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8};
        int n1 = 2;
        int [] arr2 = new int[] {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;

        Solution solution = new Solution();
        System.out.println("result1: " + Arrays.toString(solution.solution(arr, n1)));
        System.out.println("result1: " + Arrays.toString(solution.solution(arr2, n2)));
    }

}
