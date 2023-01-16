package org.example.baekjoon.바이러스;

import java.util.Scanner;

public class Main {
    static boolean [][] graph;
    static boolean [] visited;
    static int N, M;
    static int ans;

    public static void dfs(int idx) {
        visited[idx] = true;
        ans++;
        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        // 그래프 정보 입력
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        int x, y;
        for(int i = 0; i < M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }

        // 탐색
        dfs(1);

        System.out.println(ans - 1);
        sc.close();
    }


}
