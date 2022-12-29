package org.example.baekjoon.수_이어_쓰기_1;

import java.util.Scanner;

public class Main {
    static int N;
    static long ans;
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static void solve() {
        for(int i = 1; i <= N; i*= 10) {
            ans += N - i + 1;
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        input();
        solve();
    }
}
