package org.example.baekjoon.리모컨;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String channel;
    static int N; // 고장난 숫자
    static List<String> brokens = new ArrayList<>();
    static int cnt;

    static void input() {
        Scanner sc = new Scanner(System.in);
        channel = sc.next();

        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            brokens.add(sc.next());
        }
    }

    static void solve() {
        // 채널 문자리스트로 변환
        List<String> ch = new ArrayList<>();

        for (char a : channel.toCharArray()) {
            if(!brokens.contains(String.valueOf(a))) ch.add(String.valueOf(a));
        }

        System.out.println(ch);
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
