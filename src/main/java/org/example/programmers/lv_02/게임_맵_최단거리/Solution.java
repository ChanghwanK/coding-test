package org.example.programmers.lv_02.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int mapWidth, int mapHeight) {
            if(x < 0 || x >= mapWidth) return false;
            if(y < 0 || y >= mapHeight) return false;
            return true;
        }
    }

    public int solution(int[][] maps) {
        // BFS: Queue
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, 0));

        int [][] count = new int[mapHeight][mapWidth];
        boolean [][] visited = new boolean[mapHeight][mapWidth];

        count[0][0] = 1;
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            Position current = queue.poll();

            int currentCount = count[current.y][current.x];

            final int [][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1,0}};

            for(int i = 0; i < moving.length; i++) {
                Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
                if(!moved.isValid(mapWidth, mapHeight)) continue;
                if(visited[moved.y][moved.x]) continue;
                if(maps[moved.y][moved.x] == 0)continue;

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        int answer = count[mapHeight - 1][mapWidth - 1];

        if(answer == 0) return -1;
        return answer;
    }
}
