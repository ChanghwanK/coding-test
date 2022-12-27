package org.example.baekjoon.N과M_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건
 *  - 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 */
public class Main {
    static int[] nums;
    static boolean[] visit;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strNums = br.readLine().split(" ");
        N = Integer.parseInt(strNums[0]);
        M = Integer.parseInt(strNums[1]);

        nums = new int[M];
        visit = new boolean[N];
    }

    static void dfs(int depth) {

        if (depth == M) {
            for(int i = 0; i < nums.length; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(visit[i]) continue;
            visit[i] = true;
            nums[depth] = i + 1;
            dfs(depth + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {

        input();

        dfs(0);

        System.out.println(sb.toString());
    }
}
