package org.example.algorithm.dfs;

import java.util.Scanner;

public class FloodFill {
    static int N;
    static int [][] map;
    static int X, Y, C; // x y color

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        X = sc.nextInt();
        Y = sc.nextInt();
        C = sc.nextInt();
    }

    static void dfs(int r, int c) {
        if (r < 0 || r >= N || c < 0 || c >= N) return;
        if (map[r][c] != 0) return;

        map[r][c] = 1;
        dfs(r - 1, c);
        dfs(r + 1, c);
        dfs(r, c + 1);
        dfs(r, c - 1);
    }

    public static void main(String[] args) {
        input();
        System.out.println("input done");
        dfs(X, Y);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.println(map[i][j] + " ");
            }
        }
    }

}
