package org.example.programmers.lv_02;

public class Solution {
    int [] selectableNums = {1, 2};
    long ans = 0;

    public void dfs(int idx, int total, int limit) {
        if (total == limit) {
            ans++;
            return;
        }
        if (total > limit) return;

        for(int i = 0; i < 2; i++) {
            dfs(idx + 1, total + selectableNums[i], limit);
        }

    }

    public long solution(int n) {
        dfs(0, 0, n);
        long answer = ans % 1234567;
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(4);
        System.out.println("result: " + result);
    }
}
