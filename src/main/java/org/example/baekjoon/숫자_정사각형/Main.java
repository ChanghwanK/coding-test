package org.example.baekjoon.숫자_정사각형;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] map;
    static int ans;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];

        for(int i = 0; i < N; i++) {
            String s = sc.next();
            for(int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
    }

    static void solve(int distance) {
        while (distance > 1) {
            for(int i = 0; i <= N - distance ; i++) {
                for(int j = 0; j <= M - distance; j++) {
                    int value = map[i][j];
                    if(value == map[i][j+distance-1] && value == map[i+distance-1][j] && value == map[i+distance-1][j+distance-1]) {
                        ans = distance * distance;
                        return;
                    }
                }
            }
            distance--;
        }

        ans = distance * distance;
    }

    public static void main(String[] args) {
        input();
        solve(Math.min(N, M));
        System.out.println(ans);
    }
}
