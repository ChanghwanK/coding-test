package org.example.이것이_코딩_테스트다.그리디.큰_수의_법칙;

import java.util.Scanner;

public class Main {
    static int N, M, K;
    static int [] arr;

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

    }

    // 배열에서 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙
    // 특정 인덱스 수가 K번을 초과해서 더할 수 없다.
    // 특정 인덱스의 수가 몇번 활용되었는지 체크할 수 이 었어야 함

    /**
     * 함수 스케치
     * - 한 턴에서
     * 1. 배열에서 가장 큰 값들을 K번 더한다.
     * 2. 배열에서 두 번째로 큰 값을 한 번 더한다
     * 3. 두 번째 큰 값을 한 번 더했다면 K는 다시 초기화된다.
     * 4. 다시 가장 큰 값을 K번 더한다.
     */
    static void solve() {

    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
