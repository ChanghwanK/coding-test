package org.example.baekjoon.N과M_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] selected;
    static StringBuilder sb = new StringBuilder();
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        selected = new int[M + 1];
    }

    // 1부터 N까지 자연수 중에서 M개를 고른 수열
    // 같은 숫자 중복 가능
    static void solve(int k) {
        if (k == M + 1) {
            // 다고름 출력해주기
            for(int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            // 더 찾기
            for(int i = 1; i <= N; i++) {
                selected[k] = i;
                System.out.println(Arrays.toString(selected));
                solve(k + 1);
            }
        }
    }

    public static void main(String[] args) {
        input();

        System.out.println("init: " + Arrays.toString(selected));
        solve(1);
        System.out.println(sb.toString());
    }
}
