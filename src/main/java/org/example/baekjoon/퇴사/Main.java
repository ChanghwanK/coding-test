package org.example.baekjoon.퇴사;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int N;
    static int [] t;
    static int [] p;
    static int ans;

    static void input() throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        t = new int[N + 1];
        p = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
    }

    static void solve(int day, int sum) {
        if(day == N + 1) {
            ans = Math.max(ans, sum);
            return;
        }

        if(day > N + 1) return;

        solve(day, sum);
        solve(day + t[day], sum + p[day]);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve(1, 0);
        System.out.println(ans);
    }
}
