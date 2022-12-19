package org.example.baekjoon.날짜_계산;

import java.util.Scanner;

public class Main {
    static int E; // 지구
    static int S; // 태양
    static int M; // 달
    static int year = 0;

    static void input() {
        Scanner sc = new Scanner(System.in);
        E = sc.nextInt();
        S = sc.nextInt();
        M = sc.nextInt();

        E -= 1;
        S -= 1;
        M -= 1;
    }

   static void solve() {
        while(year != 100000) {
            // 조건에 맞는지 검사
            if(getJunkyuPlanAge(year)) break;
            else year++;
        }
    }

    private static boolean getJunkyuPlanAge(int year) {
        int e = getEAge(year);
        int s = getSBge(year);
        int m = getMAge(year);

        return e == E && s == S && m == M;
    }

    private static int getMAge(int year) {
        if (!(year >= 0 && year < 19)) return year % 19;
        return year;
    }

    private static int getSBge(int year) {
        if (!(year >= 0 && year < 28)) return year % 28;
        return year;
    }

    private static int getEAge(int year) {
        if (!(year > 0 && year < 15)) return year % 15;
        return year;
    }

    // 1 <= E <= 15
    // 1 <= S <= 28
    // 1 <= M <= 19
    public static void main(String[] args) {
//        input();
//        solve();
//        System.out.println(year + 1);

        System.out.println(7890 % 15);
        System.out.println(7890 % 28);
        System.out.println(7890 % 19);
    }
}
