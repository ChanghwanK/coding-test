package org.example.baekjoon.동전_0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static int N,K;
    static int [] coins;
    static int cnt; // 동전 개ㅅ

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        coins = new int[N];

        // 동전은 값이 작은 것부터 들어옴
        for(int i = 0; i < N; i++)
            coins[i] = sc.nextInt();
    }

    // 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
    // 동전은 매우 많음
    static void solve() {
        // 동전 배열에서 가능한 최댓값을 우선적으로 선택한다.

        // 어떤 동전을 선택할 것인가?
        List<Integer> reversedCoins = Arrays.stream(coins).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(reversedCoins);

        for (Integer coin : reversedCoins) {
            if (coin > K) {
                continue;
            }
            cnt += (K / coin);
            K %= coin;
        }

        // 가능한 이유
        // K를 무조건 딱 나누어떨어지도록 하는 수가 없기 때문 즉, 800원인 경우 400원짜리 동전이 없기 때문에 500원 * 1 + 100 * 3이 최적의 해가 됨
    }

    public static void main(String[] args) {
        input();
        solve();

        System.out.println(cnt);
    }
}
