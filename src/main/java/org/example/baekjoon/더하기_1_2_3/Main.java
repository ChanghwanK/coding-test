package org.example.baekjoon.더하기_1_2_3;

import java.util.Scanner;

public class Main {
    static int t;
    static int [] arr;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        arr = new int[t];

        for(int i = 0; i < t; i++)
            arr[i] = sc.nextInt();

    }


    static int recursive(int count, int total, int goal) {
        int cnt = 0;

        if (total > goal)
            return 0;

        if (total == goal)
            return 1;

        for(int i = 1; i <= 3; i++) {
            cnt += recursive(count + 1, total + i, goal);
        }

        return cnt;
    }

    public static void main(String[] args) {
        input();

        for(int num : arr) {
            int i = recursive(0, 0, num);
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
