package org.example.baekjoon.날짜_계산;

import java.util.Scanner;

public class Main2 {
    static int E; // 지구
    static int S; // 태양
    static int M; // 달
    static int year = 0;

    static void input() {
        Scanner sc = new Scanner(System.in);
        E = sc.nextInt();
        S = sc.nextInt();
        M = sc.nextInt();
    }

   static void solve() {
        int e = 0;
        int s = 0;
        int m = 0;
        while(true) {
            year++;
            e++;
            s++;
            m++;

            if(e == 16) e = 1;
            if(s == 29) s = 1;
            if(m == 20) m = 1;
            if (e == E && m == M && S == s) break;
        }

       System.out.println(year);
    }

//    private static boolean getJunkyuPlanAge(int year) {
//        int a = getAAge(year);
//        int b = getBBge(year);
//        int c = getCAge(year);
//
//        return a == E && b == S && c == M;
//    }
//
//    private static int getCAge(int year) {
//        if (!(year >= 1 && year <= 19)) return year % 19;
//        return year;
//    }
//
//    private static int getBBge(int year) {
//        if (!(year >= 1 && year <= 28)) return year % 28;
//        return year;
//    }
//
//    private static int getAAge(int year) {
//        if (!(year >= 1 && year <= 15)) return year % 15;
//        return year;
//    }

    // 1 <= E <= 15
    // 1 <= S <= 28
    // 1 <= M <= 19
    public static void main(String[] args) {
        input();
        solve();
//        System.out.println(year);
    }
}
