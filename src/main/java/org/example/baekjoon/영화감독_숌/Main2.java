package org.example.baekjoon.영화감독_숌;

import java.util.Scanner;

public class Main2 {
    static int N;
    static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
    }

    static void search() {
        int num = 0;
        int cnt = 0;

        while(cnt != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);
    }

    // 종말의 수는 6이 3번이상 연속으로 들어간 수를 의미함
    public static void main(String[] args) {
        input();
        search();
    }
}
