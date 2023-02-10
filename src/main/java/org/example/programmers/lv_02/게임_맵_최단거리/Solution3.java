package org.example.programmers.lv_02.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while(! queue.isEmpty()) {

        }
    }

    public int solution(int[][] maps) {
        int answer = 0;
        return answer;
    }
}
