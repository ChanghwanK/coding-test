package org.example.baekjoon.N과M_4;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] selected;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int index, int start) {
        if (index == M + 1) {
            for(int i = 1; i < selected.length; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");

            return;
        }

        // 비내림차순
        for(int i = start; i <= N; i++) {
            selected[index] = i;
            dfs(index + 1, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];

        dfs(1, 1);
        System.out.println(sb);
    }
}
