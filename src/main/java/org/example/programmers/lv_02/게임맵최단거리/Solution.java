package org.example.programmers.lv_02.게임맵최단거리;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> arr = new ArrayList<>(); // 몇번만에 도달했는지 횟수 저장
    public void dfs(int x, int y, int cnt, int[][] maps) {
        // 맵 이동 가능 체크
        if (x < 0 || x > maps.length  - 1|| y < 0 || y > maps.length - 1) return;

        // 끝에 도착
        if (x == 4 && y == 4) {
            arr.add(cnt);
        }

        // 방문 여부 체크
        if(maps[x][y] == 1) {
            maps[x][y] = 0;
            dfs(x, y+1, cnt + 1, maps);
            dfs(x + 1, y, cnt + 1, maps);
            dfs(x-1,y, cnt + 1, maps);
            dfs(x,y-1, cnt + 1, maps);
        };
    }
    
    public int solution(int[][] maps) {
        dfs(0,0, 1, maps);
        return arr.isEmpty() ? -1 : arr.get(0);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
        // {1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}
        var result = solution.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}});
        System.out.println("result: " + result);
    }

}
