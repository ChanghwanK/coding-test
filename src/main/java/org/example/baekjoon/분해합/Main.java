package org.example.baekjoon.분해합;

import java.util.Scanner;

public class Main {
    static int N;
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static int solve() {
        int result = 0;
        for(int i = 0; i < N; i++) {
            int num = i;
            int sum = 0;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        input();
        System.out.println(solve());
    }

    public static void test01() {
        int num = 123;
        int total = 0;
        while(num != 0) {
            total += num % 10;
            num /= 10;
        }

        System.out.println(total);
    }
}
