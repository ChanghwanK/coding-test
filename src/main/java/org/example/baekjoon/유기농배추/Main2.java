package org.example.baekjoon.유기농배추;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int [][] map;

        for(int i = 0; i < TC; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();
            map = new int[m][n];

            for(int j = 0; j < c; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }

            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    System.out.print(map[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
