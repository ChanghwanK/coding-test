package org.example.programmers.lv_02.최솟값_만들기;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A, int[] B) {
        int ans = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            ans += A[i] * B[B.length - 1 - i];

        }

        return ans;
    }



    public static void main(String[] args) {
        Solution solution = new Solution(); var result = solution.solution(
            new int[]{1,4,2}, new int[]{5,4,4}
        );
        System.out.println("result: " + result);
    }
}
