package org.example.programmers.lv_0.다음에_올_숫자;

public class Solution {
    /**
     * 공비가 1, -1 인 경우와 2 이상인 경우를 나눠서 생각해야함
     *
     */
    public int solution(int[] common) {
        int num_01 = common[0];
        int num_02 = common[1];
        int num_03  = common[2];
        int lastNum = common[common.length - 1];

        if (num_02 - num_01 == num_03 - num_02) {
            return lastNum + num_02 - num_01;
        } else {
            return lastNum * (num_02 / num_01);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{-1, -2, -3, -4});
    }
}
