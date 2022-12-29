package org.example.baekjoon.N과M_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 조건
 *  - 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 */
public class Main2 {
    static int[] nums;
    static boolean[] visit;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        nums = new int[N + 1];
        visit = new boolean[N + 1];
    }

    static void dfs(int depth) {
        // 종료조건
        if (depth == M + 1) {
            for(int i = 1; i <= M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(visit[i]) continue;
            visit[i] = true;
            nums[depth] = i;
            dfs(depth + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        dfs(1);
        System.out.println(sb.toString());
    }
}
