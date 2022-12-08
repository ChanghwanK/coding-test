package org.example.baekjoon.블로그;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, X; // 일수 M 공백기
    static int [] visitCnts;
    static int resultMaxSum = 0;
    static int cnt;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();

        visitCnts = new int[N];

        for(int i = 0; i < N; i++) {
            visitCnts[i] = sc.nextInt();
        }
    }

    static void solve() {
        // 입력받은 X칸씩 이동 (배열의 끝까지)
        // 14 / 42 / 25 / 51
        int start = 0;
        int end = X - 1;

        while(end < N) {
//            int currentSum = getSum(Arrays.copyOfRange(visitCnts, start, end + 1));
            int currentSum = getCurrentArraySum(start, end);

            if(currentSum == resultMaxSum) {
                cnt++;
            } else if(currentSum > resultMaxSum) {
                resultMaxSum = currentSum;
                cnt = 1;
            }

            start++;
            end++;
        }
    }

    static int getCurrentArraySum(int start, int end) {
        int sum = 0;
        for(int i = start; i < end + 1; i++) {
            sum += visitCnts[i];
        }
        return sum;
    }

    static int getSum(int [] arr) {
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        input();
        solve();

        if(resultMaxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(resultMaxSum);
            System.out.println(cnt);
        }
    }
}
