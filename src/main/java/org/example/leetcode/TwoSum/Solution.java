package org.example.leetcode.TwoSum;

import java.util.Arrays;

public class Solution {

    /**
     *Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int [] answers = new int[2];
        for (int i = 0; i < len; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < len; j++) {
                int num2 = nums[j];

                if (num1 + num2 == target) {
                    answers[0] = i;
                    answers[1] = j;
                }

            }
        }


        return answers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[] {2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(ints));

    }

}
