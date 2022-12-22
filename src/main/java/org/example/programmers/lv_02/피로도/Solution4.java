package org.example.programmers.lv_02.피로도;

public class Solution4 {
    boolean [] visited;
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return answer;
    }

    void dfs(int depth, int k, int [][] dungeon) {
        for(int i = 0; i < dungeon.length; i++) {
            if(!visited[i] && dungeon[i][0] <= k) {
                visited[i] = true;
                dfs(depth + 1, k - dungeon[i][1], dungeon);
                visited[i] = false;
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
