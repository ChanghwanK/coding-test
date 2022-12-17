package org.example.programmers.lv_02.피로도;

public class Solution {
    public int answer = 0;
    public boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [][] dungeons = {
            {80,20}, {50,40}, {30,10}
        };
        var result = solution.solution(80, dungeons);
        System.out.println("result: " + result);
    }
}
