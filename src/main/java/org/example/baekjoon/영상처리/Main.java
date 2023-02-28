package org.example.baekjoon.영상처리;

import java.util.Scanner;

public class Main {
    static void dfs(boolean[][] visited, int x, int y) {
        if(visited[x][y])
            return;

        visited[x][y] = true;
        dfs(visited, x + 1, y);
        dfs(visited, x, y + 1);
        dfs(visited, x - 1, y);
        dfs(visited, x, y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] originMap = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                originMap[i][j] = sc.nextInt();
            }
        }

        int standardVal = sc.nextInt();
        int [][] newMap = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(originMap[i][j] >= standardVal) {
                    newMap[i][j] = 255;
                } else {
                    newMap[i][j] = 0;
                }
            }
        }


        boolean [][] visited = new boolean[n][m];
        int ans = 0;
        // 새롭게 방문하면 + 1
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(newMap[i][j] == 255 && !visited[i][j]) {
                    ans++;
                    dfs(visited, i, j);
                }
            }
        }

        System.out.println(ans);

    }

}
