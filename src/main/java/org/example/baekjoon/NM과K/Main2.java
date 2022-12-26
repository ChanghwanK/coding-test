package org.example.baekjoon.NM과K;

import java.util.Scanner;

public class Main2 {
    static int N, M, K;
    static boolean [][] visit;
    static int [][]  map;
    static int answer;
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};


    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        map = new int[N][M];
        visit = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
    }

    static void dfs(int cnt, int sum) {
        if (cnt == K) {
            if (answer < sum) answer = sum;
            return;
        }

        for(int x = 0; x < N; x++) {
            for(int y = 0; y < M; y++) {
                if(visit[x][y]) continue;
                boolean OK = true;
                for(int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                        if (visit[nx][ny]) OK = false;
                    }
                }

                if (OK) {
                    visit[x][y] = true;
                    dfs(cnt + 1, sum + map[x][y]);
                    visit[x][y] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        dfs(0,0);
        System.out.println(answer);
    }
}
