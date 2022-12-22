package org.example.baekjoon.N과M_2;

import java.util.Scanner;
public class Main2 {
    static boolean[] visited = new boolean[10];
    static int[] nums;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth, int start) {
        if (depth == M) {
            for(int num : nums) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=start; i < N; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            nums[depth] = i + 1;
            dfs(depth+1, i+1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N =  sc.nextInt();
        M = sc.nextInt();

        nums = new int[M];
        visited = new boolean[N + 1];

        dfs(0,0);
        System.out.println(sb.toString());
    }
}