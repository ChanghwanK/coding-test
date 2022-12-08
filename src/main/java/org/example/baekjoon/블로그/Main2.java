package org.example.baekjoon.블로그;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static int N, X; // 일수 M 공백기
    static int [] visitCnts;
    static int resultMaxSum = 0;
    static int sum = 0;
    static int cnt = 1;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();

        visitCnts = new int[N];

        for(int i = 0; i < N; i++) {
            visitCnts[i] = sc.nextInt();
            if (i < X) sum += visitCnts[i];
        }
        int cnt = 0, max = 0, sum = 0;
        for(int s = 0, e = 0; e < N;) {}
    }

    static void solve() {
//        int sum = 0;
//        for(int i = 0; i < X; i++) {
//            sum += visitCnts[i];
//        }

        int start = 1;
        int end = X;

        while(true) {
            start++;
            end++;

            if (end > N) break;

            sum = sum + visitCnts[end] - visitCnts[start - 1];
            if (resultMaxSum == sum) {
                cnt++;
            } else if (resultMaxSum < sum) {
                resultMaxSum = sum;
                cnt = 1;
            }
        }
    }


    public static void main(String[] args) {
        input();
        solve();

        if(resultMaxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(resultMaxSum);
            System.out.println(cnt);
        }
    }
}
