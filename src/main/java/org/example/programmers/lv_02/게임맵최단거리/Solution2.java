package org.example.programmers.lv_02.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x; this.y = y;
        }

        Location left() {
            return new Location(x, y - 1);
        }

        Location right() {
            return new Location(x, y + 1);
        }

        Location up() { return new Location(x + 1, y);}

        Location down() { return new Location(x - 1, y);}
    }

    public class Space {
        int step;
        Location location;

        public Space(int step, Location location) {
            this.step = step; this.location = location;
        }

        public boolean equals(Space other) {
            return this.location.x == other.location.x && this.location.y == other.location.y;
        }
    }

    public int solution(int[][] maps) {
        Queue<Space> queue = new LinkedList<>();
        int xMaxSize = maps.length;
        int yMaxSize = maps[0].length;
        final Space target = new Space(0, new Location(xMaxSize - 1, yMaxSize - 1));

        queue.offer(new Space(1, new Location(0, 0)));// 시작점
        boolean[][] visit = new boolean[xMaxSize][yMaxSize];

        while(! queue.isEmpty()) {
            Space now = queue.poll();

            if (now.location.x < 0) continue;
            if (now.location.x >= xMaxSize) continue;
            if (now.location.y < 0) continue;
            if (now.location.y >= yMaxSize) continue;
            if (maps[now.location.x][now.location.y] == 0) continue;

            if(now.equals(target))
                return now.step;

            if (visit[now.location.x][now.location.y])
                continue;

            visit[now.location.x][now.location.y] = true;
            queue.offer(new Space(now.step + 1, now.location.up()));
            queue.offer(new Space(now.step + 1, now.location.down()));
            queue.offer(new Space(now.step + 1, now.location.left()));
            queue.offer(new Space(now.step + 1, now.location.right()));
        }

        return - 1;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        // {1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}
        var result = solution.solution(
            new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}}); System.out.println("result: " + result);
    }

}
