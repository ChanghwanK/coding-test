package org.example.programmers.lv_02.타겟넘버;

public class Solution {
    static int ans;
    static boolean [] selected;

    private void dfs(final int [] numbers, final int target, int idx, int total) {
        if(idx == numbers.length) {
            if(total == target) ans ++;
            return;
        }

        dfs(numbers, target, idx + 1, total + numbers[idx]);
        dfs(numbers, target, idx + 1, total - numbers[idx]);
    }

    public int solution(int[] numbers, int target) {
        selected = new boolean[numbers.length];
        dfs(numbers, target, 0, 0);
        return ans;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1,1,1,1,1}, 3);
        System.out.println("result: " + result);
    }
}
