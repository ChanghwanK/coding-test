package org.example.이것이_코딩_테스트다.그리디.거스름돈_그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static int [] coins;
    static int N;
    static int fee;
    static int total;


    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("코인 개수 입력");
        N = sc.nextInt();

        coins = new int[N];

        System.out.println("코인 입력 입력");
        for(int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println("요금 입력");
        fee = sc.nextInt();
    }


    static void solve() {
        List<Integer> sortedCoins = Arrays.stream(coins).boxed().sorted((c1, c2) -> c2 - c1)
            .collect(Collectors.toList());
        // 500 100 50 10 1
        // 1260
        // 500 2개 100 2개 50 1개 10원 1개
        for(int coin : sortedCoins) {
            total += (fee / coin);
            fee = fee % coin;
        }

        System.out.println("total: " + total);
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
