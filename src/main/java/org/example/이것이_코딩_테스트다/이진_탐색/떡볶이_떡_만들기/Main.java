package org.example.이것이_코딩_테스트다.이진_탐색.떡볶이_떡_만들기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] riceCake;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        riceCake = new int[N];

        for(int i = 0; i < N; i++)
            riceCake[i] = sc.nextInt();
    }

    static void solve() {
        int start = 0;
        int end = riceCake[riceCake.length - 1];
        int mid;
        int result = 0;

        while(start <= end) {
            long total = 0;
            mid = (start + end) / 2;

            // mid 값으로 짜른 나머지 값들의 합이 M인지 확인
            for(int j : riceCake) {
                if(j > mid)
                    total += j - mid;
            }

            // 부족하다면 더 많이 짤라야함
            if (total < M) end = mid - 1;

            // 충분하다면 덜 짤라야 함
            else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        input();
        solve();
    }

}
