package org.example.baekjoon.문자열;

import java.util.Scanner;

public class Main2 {
    static String A, B;
    static int ans; // 차이
    static char [] alphas = new char[26];

    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();
    }

    static void solve() {
        ans = A.length();
        for(int i = 0; i < B.length() - A.length(); i++) {
            int cnt = 0;
            for(int j = 0; j < A.length(); j++) {
                if(A.charAt(i) != B.charAt(j + i)) {
                    cnt++;
                }
            }

            ans = Math.min(ans,cnt);
        }
    }

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(ans);
    }
}
