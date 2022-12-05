package org.example.baekjoon.커트라인;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static int N, K; // 응시자 수, 상을 받는 사람
    static Integer [] scores;

    static void input() {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        scores = new Integer[N];
        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
    }

    static void solve() {
        // 정렬하고 k번째 값 출력
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[K - 1]);
    }
    public static void main(String[] args) {
        input();
        solve();
    }
}
