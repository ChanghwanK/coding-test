package org.example.baekjoon.나누기;

import java.util.Scanner;

public class Main {
    static int N, F;
    static int ans;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();
    }

    // 뒤 두 자리를 가능하면 작게 만드는 것이 목표
    // 뒷 두자리를 구하는 것
    static void solve() {

        // 문제 핵심은 두 자리를 바꿔서 케이스를 찾는 것인데
        // 나는 그냥 나누어떨어지면 바로 리턴하고자 했음
        // 문제 핵심을 제대로 파악하지 못함
//        if (N % F == 0) {
//            ans = 0;
//            return;
//        }

        String strNum = String.valueOf(N);
        int num = Integer.parseInt(strNum.substring(0, strNum.length() - 2)); // 10의 자리수를 제외한 숫자
        int temp = num * 100;

        while(temp % F != 0) {
            temp++;
        }

        // 바로 나누어 떨어지는 경우가 있음


        ans = temp - (num * 100);

    }

    public static void main(String[] args) {
        input();
        solve();

        if(ans == 0) {
            System.out.println("00");
            return;
        }


        if (ans < 10) {
            System.out.println("0"+ans);
            return;
        }

        System.out.println(ans);
    }
}
