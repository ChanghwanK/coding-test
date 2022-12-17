package org.example.baekjoon.영화감독_숌;

import java.util.Scanner;

public class Main {
    static int N;
    // 10000이 넘어간 수 가 없어서 100번째 수를 못찾음
    static String [] nums = new String[10001];
    static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        // 숫자 초기화
        for(int i = 1; i < 10001; i++) {
            nums[i] = String.valueOf(i);
        }
    }

    // N까지의 모든 종말수의를 찾는다.
    static void search() {
        // 순회 하면서 666이 cotain 되어 있는지 검사
        // 있다면 cnt++
        // cnt가 == N이 되면 스탑
        int cnt = 0;

        for(int i = 1; i < 10001; i++) {
            if (cnt == N) {
                System.out.println(nums[i - 1]);
                break;
            } else {
                if(nums[i].contains("666")) cnt++;
            }
        }
    }

    // 종말의 수는 6이 3번이상 연속으로 들어간 수를 의미함
    public static void main(String[] args) {
        input();
        search();
    }
}
