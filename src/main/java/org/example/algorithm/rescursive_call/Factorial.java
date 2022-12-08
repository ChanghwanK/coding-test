package org.example.algorithm.rescursive_call;

import java.util.Scanner;

public class Factorial {
    static int N;
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static int recursive(int n) {
        if (n == 1) return n;

        return n + recursive(n - 1);
    }

    public static void main(String[] args) {
        input();
        int result = recursive(N);
        System.out.println("result: " + result);
    }

}
