package org.example.baekjoon.약수_구하기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();

        int cnt = 0;
        for(int i = 1; i <= p; i++) {
            if(p % i == 0) {
                cnt++;

                if(cnt == q) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }

}
