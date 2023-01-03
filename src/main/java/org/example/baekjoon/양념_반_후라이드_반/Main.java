package org.example.baekjoon.양념_반_후라이드_반;

import java.util.Scanner;

public class Main {
    static int friedChickenPrice,  seasonedChickenPrice, halfChickenPrice, X, Y;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = Integer.MAX_VALUE;

        friedChickenPrice = sc.nextInt();
        seasonedChickenPrice = sc.nextInt();
        halfChickenPrice = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        for(int i = 0; i <= 100000 ; i++) {
            int price = 2 * i * halfChickenPrice + Math.max(0, X - i) * friedChickenPrice + Math.max(0, Y - i) * seasonedChickenPrice;
            if (price < ans) ans = price;
        }

        System.out.println(ans);
    }
}
