package org.example.baekjoon.유기농배추;

import java.util.Scanner;

public class Main {
    static int [][] graph;
    static boolean [][] visited;

    static void dfs(int y, int x) {
        // 벽 체크
        if (y < 0 || y >= graph.length || x < 0 || x >= graph[0].length) return;

        // 방문할 수 있는지 체크
        if (visited[y][x] || graph[y][x] != 1) return;

        // 방문
        visited[y][x] = true;
        dfs(y - 1, x);
        dfs(y + 1, x);
        dfs(y, x - 1);
        dfs(y, x + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int m = 0;
        int n = 0;
        int k = 0;
        for(int a = 0; a < T; a++) {
            m = sc.nextInt();  // 가로
            n = sc.nextInt();  // 세로
            k = sc.nextInt();

            graph = new int[n][m];
            visited = new boolean[n][m];


            for(int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                graph[y][x] = 1;
            }

            int ans = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if (graph[i][j] == 1 && ! visited[i][j]) {
                        dfs(i,j);
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
