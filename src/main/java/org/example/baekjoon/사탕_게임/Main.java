package org.example.baekjoon.사탕_게임;

import java.util.Scanner;

public class Main {
    static int N;
    static String [] strs;

    void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        strs = new String[N];

        for(int i = 0; i < N; i++) {
            strs[i] = sc.next();
        }
    }

    public static void main(String[] args) {
        // input

    }
}
