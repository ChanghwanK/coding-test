package org.example.programmers.자료구조_알고리즘_강의.게임맵최단거리;

import java.util.Stack;

public class Solution {

    static class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location left() {
            return new Location(x, y - 1);
        }

        public Location right() {
            return new Location(x, y + 1);
        }

        public Location up() {
            return new Location(x + 1, y);
        }
        public Location down() {
            return new Location(x - 1, y);
        }
    }

    static class Space {
        Location location;
        int step;

        public Space(Location location, int step) {
            this.location = location;
            this.step = step;
        }

        public boolean equals(Space other) {
            return this.location.x == other.location.x && this.location.y == other.location.y;
        }
    }
    // 가장 먼저 도착하는 방법이 최단거리임
    public int solution(int[][] maps) {
        int xSize = maps.length;
        int ySize = maps[0].length;
        boolean [][] visit = new boolean[xSize][ySize];

        Space target = new Space(new Location(xSize - 1, ySize - 1), 0);

        Stack<Space> stack = new Stack<>();
        stack.add(new Space(new Location(0,0), 1)); // 시작

        while(! stack.isEmpty()) {
            Space now = stack.pop();

//            if(now.location.x < 0 || now.location.x >= xSize || now.location.y  < 1 || now.location.y >= ySize) continue; // 벽체크
            if (now.location.x < 0) continue;
            if (now.location.x >= xSize) continue;
            if (now.location.y < 0) continue;
            if (now.location.y >= ySize) continue;

            if(maps[now.location.x][now.location.y] == 0) continue;


            if(now.equals(target)) {
                return now.step;
            }

            if(visit[now.location.x][now.location.y]) continue; // 방문한 곳이면 넘어감
            visit[now.location.x][now.location.y] = true;

            stack.add(new Space(now.location.down(), now.step + 1));
            stack.add(new Space(now.location.left(), now.step + 1));
            stack.add(new Space(now.location.up(), now.step + 1));
            stack.add(new Space(now.location.right(), now.step + 1));
        }

        return -1;
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        int [][] map = new int[][] {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,1},
            {0,0,0,0,1}
        };
        var result = solution.solution(map);
        System.out.println("result: " + result);
    }
}
