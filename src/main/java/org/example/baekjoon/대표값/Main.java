package org.example.baekjoon.대표값;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int [] arr = new int[5];
    public static void input() {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void solve() {
        // 평균값 출력
        int avg = (int) Arrays.stream(arr).average().orElse(0);
        System.out.println(avg);

        // 중간값 출력
        // 정렬
        Arrays.sort(arr);
        int mid = arr.length / 2;
        System.out.println(arr[mid]);
    }

    public static void main(String[] args) {
        // 입력
        input();
        // 해결
        solve();
    }
}
