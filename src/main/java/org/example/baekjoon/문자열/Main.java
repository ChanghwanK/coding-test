package org.example.baekjoon.문자열;

import java.util.Scanner;

public class Main {
    static String A, B;
    static int ans; // 차이
    static char [] alphas = new char[26];

    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();

        for(int i = 0; i < 26; i++) alphas[i] = (char) (i + 97);
    }

    static int diff(String a) {
        int cnt = 0;
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != B.charAt(i)) cnt++;
        }

        return cnt;
    }

    static void recursive(String a) {
        if(a.length() == B.length()) {
            // 차이구하기
            if (ans == 0) {
                ans = diff(a);
            } else {
                ans = Math.min(ans, diff(a));
            }
            return;
        }

        if(a.length() > B.length()) return;

        for(int i = 0; i < 25; i++) {
            recursive(alphas[i] + a);
            recursive(a + alphas[i]);
        }
    }

    public static void main(String[] args) {
        input();
        recursive(A);
        System.out.println(ans);
    }
}
