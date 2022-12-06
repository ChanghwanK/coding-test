package org.example.baekjoon.블랙잭;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] blackJacks;

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        blackJacks = new int[N];

        for(int i = 0; i < N; i++) {
            blackJacks[i] = sc.nextInt();
        }
    }

    static int solve() {
        // M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합
        int sum = 0;
        int currentTotal = 0;

        // 3장의 합을 구함
        // 3장의 합이 M보다 작다면 sum을 변경 넘는다면 break;
        for(int i = 0; i < blackJacks.length; i++) {
            for(int j = i + 1; j < blackJacks.length; j++) {
                for(int k = j + 1; k < blackJacks.length; k++) {
                    currentTotal = blackJacks[i] + blackJacks[j] + blackJacks[k];
                    if (currentTotal == M) return currentTotal;
                    if ( currentTotal > sum && currentTotal < M) {
                        sum = currentTotal;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        input();
        int result = solve();
        System.out.println(result);
    }
}
