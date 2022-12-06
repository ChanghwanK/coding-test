package org.example.baekjoon.나이순_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int N;
    static String[][] userInfo;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        userInfo = new String[N][2];

        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String [] split = sc.nextLine().split(" ");
            String age= split[0];
            String name = split[1];

            userInfo[i][0] = age;
            userInfo[i][1] = name;
        }
    }

    static void sort() {
        Arrays.sort(userInfo, Comparator.comparingInt(s -> Integer.parseInt(s[0])));
    }

    public static void main(String[] args) {
        input();
        sort();

        // 출력
        for(String [] info : userInfo)
            System.out.println(info[0] + " " + info[1]);
    }
}
