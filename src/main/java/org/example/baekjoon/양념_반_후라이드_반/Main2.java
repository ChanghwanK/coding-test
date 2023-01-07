package org.example.baekjoon.양념_반_후라이드_반;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int A, B, C, X, Y;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        /**
         * 반반을 10만까지 다해봄
         */
        for(int i = 0; i <= 2 * (X + Y); i++) {
            int price = 2 * i * C + Math.max(0, X - i) * A + Math.max(0, Y - i) * B;
            ans = Math.min(ans, price);
        }

        System.out.println(ans);
    }
}
