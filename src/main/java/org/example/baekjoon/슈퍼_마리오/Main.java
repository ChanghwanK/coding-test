package org.example.baekjoon.슈퍼_마리오;

import java.util.Scanner;

public class Main {
    static int [] scores = new int[10];
    static int ans = 0;

    static void input() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            scores[i] = sc.nextInt();
        }
    }

    // 100이 넘는 순간
    // 100이 넘기 직전
    static void solve() {
        int total = 0;
        int before = 0;

        for(int i = 0; i < 10; i++) {
            if (total <= 100) {
                before = total;
                total += scores[i];
            }
        }

        if (before == 100) {
            ans = before;
            return;
        }

        if ((100 - before) == (total - 100)) {
            ans = total;
            return;
        }

        // 틀린 원인: 100에 더 가까운 수 판단 로직이 빠져있었음
        if (Math.abs(total - 100) > Math.abs(before - 100)) {
            ans = before;
        } else {
            ans = total;
        }

    }

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(ans);
    }
}
