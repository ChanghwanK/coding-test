package org.example.baekjoon.영화감독_숌;

import java.util.Scanner;

public class Main3 {
    static int N;
    static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
    }

    static void search() {
        // 탐색 범위를 못찾는 것이 현재 문제임
        // 내 방식은 1 ~ 쭉 탐색하면서 해당 숫자에 666이 포함되는지 체크하는 방식
        // 그렇기 때문에 N번째를 찾기 위한 탐색 범위를 정하지 못함
        int num = 666;
        int cnt = 1;

        while(cnt != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
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
