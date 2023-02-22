package org.example.baekjoon.atm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] minits = new int[n];

        for(int i = 0; i < n; i++)
            minits[i] = sc.nextInt();

        Arrays.sort(minits);

        int total = 0;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            total += minits[i];
            ans += total;
        }

        System.out.println(ans);

    }

}
