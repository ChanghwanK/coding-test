package org.example.baekjoon.N과M_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] nums;
    static boolean [] visit;
    static int [] selected;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        selected = new int[M];
        visit = new boolean[N];

        for(int i = 0; i < N; i++) {
           nums[i] = sc.nextInt();
        }
    }

    static void recur(int index) {
        if (index == M) {
            for(int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(visit[i]) continue;
            visit[i] = true;
            selected[index] = nums[i];
            recur(index + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) {
        input();
        Arrays.sort(nums);
        recur(0);
        System.out.println(sb);
    }
}
