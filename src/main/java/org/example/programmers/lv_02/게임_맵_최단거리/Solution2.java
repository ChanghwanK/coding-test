package org.example.programmers.lv_02.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int mapWidth, int mapHeight) {
            if (x < 0 || x >= mapWidth) return false;
            if (y < 0 || y >= mapHeight) return false;
            return true;
        }
    }

    public int solution(int[][] maps) {
        int width = maps[0].length;
        int height = maps.length;

        Queue<Position> queue = new LinkedList<>();
        Position startPosition = new Position(0,0);
        queue.offer(startPosition);

        int [][] count = new int[height][width];
        boolean [][] visited = new boolean[height][width];

        count[0][0] = 1;
        visited[0][0] = true;


        while(!queue.isEmpty()) {
            Position currentPosition = queue.poll();
            int currentCount = count[currentPosition.y][currentPosition.x];
            // 4가지 경우를 시도
            final int [][] moving = {{0,1},{0, -1}, {1,0}, {-1,0}};

            for(int i = 0; i < moving.length; i++) {
                Position moved = new Position(currentPosition.x + moving[i][0], currentPosition.y + moving[i][1]);
                if(!moved.isValid(width, height)) continue;
                if(visited[moved.y][moved.x]) continue;
                if(maps[moved.y][moved.x] == 0) continue;

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        int answer = count[height - 1][width - 1];
        return (answer == 0) ? -1 : answer;
    }
}
