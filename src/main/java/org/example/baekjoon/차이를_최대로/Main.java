package org.example.baekjoon.차이를_최대로;

import java.util.Scanner;

public class Main {
    static int [] numbers; // 주어진 숫자들
    static int [] selected; // 선택한 숫자들
    static boolean [] used;  // 사용여부
    static int ans = 0;

    static int calculateArray(int [] arr) {
        int total = 0;
        for(int i = 1; i < arr.length; i++) {
            total += Math.abs(arr[i] - arr[i - 1]);
        }
        return total;
    }

    /**
     * 순열을 만들고
     * 만들어진 순열의 합을 구한다.
     */
    static void permutation(int idx) {
        if(idx == numbers.length) {
            ans = Math.max(ans, calculateArray(selected));
        }

        for(int i = 0; i < numbers.length; i++) {
            if(used[i]) continue;
            used[i] = true;
            selected[idx] = numbers[i];
            permutation(idx + 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        numbers = new int[N];
        used = new boolean[N];
        selected = new int[N];

        for(int i = 0; i < N; i++)
            numbers[i] = sc.nextInt();


        permutation(0);

        System.out.println(ans);
    }
}
