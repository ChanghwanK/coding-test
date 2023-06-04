package org.example.programmers.lv_02.멀리_뛰기;

public class Solution {
    int [] jumpCase = {1, 2};
    long answer = 0;
    private void recursive(int target, int total) {
        if (total > target)
            return;

        if (total == target) {
            answer++;
            return;
        }

        for (int i = 0; i < jumpCase.length; i++) {
            recursive(target, total + jumpCase[i]);
        }
    }

    public long solution(int n) {
        recursive(n, 0);
        return answer % 1234567;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(3);
        System.out.println("result: " + result);
    }
}
