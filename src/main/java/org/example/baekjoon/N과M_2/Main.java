package org.example.baekjoon.N과M_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] nums;
    static boolean[] visit;
    static int N;
    static int M;
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strNums = br.readLine().split(" ");
        N = Integer.parseInt(strNums[0]);
        M = Integer.parseInt(strNums[1]);

        nums = new int[M];
        visit = new boolean[N];
    }

    static void dfs(int depth, int start) {
        if(depth == M) {
            for(int num : nums) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < N; i++) {
            if(visit[i])
                continue;

            visit[i] = true;
            nums[depth] = i + 1;
            dfs(depth + 1, i + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        dfs(0, 0);
        System.out.println(sb.toString());
    }
}
