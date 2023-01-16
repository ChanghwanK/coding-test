package org.example.baekjoon.바이러스;

import java.util.*;

class Main2 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;
    static Queue<Integer> queue = new LinkedList<>();

    public static void bfs(int idx) {
        queue.offer(idx);
        visited[idx] = true;

        while(!queue.isEmpty()) {
            int value = queue.poll();
            for(int i = 1; i <= N; i++) {
                if(graph[value][i] && ! visited[i]) {
                    answer++;
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        int x, y;
        for (int i = 0; i < M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }

        bfs(1);

        System.out.println(answer);
        sc.close();
    }
}