package org.example.baekjoon.퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int N;
    static List<String> strs = new ArrayList<>();
    static int answer = 0;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            strs.add(br.readLine());
        }
    }

    // 구하고자 하는 것 최대 수익
    static void solve(int day) {
        System.out.println("day: " + day);
        if (day > N) {
            return;
        }

        int startIndex = day;
        int sum = 0;
        int currentHavedDay = N;

        // 선택
        // 선택 가능한 조건은
        while(startIndex < strs.size()) {
            String[] s1 = strs.get(startIndex).split(" ");
            int t = Integer.parseInt(s1[0]);
            if(t < currentHavedDay) {
                sum += Integer.parseInt(s1[1]);
                startIndex += t;
                currentHavedDay -= t;
            }
        }

        answer = Math.max(sum, answer);
        solve(day + 1);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve(0);
        System.out.println(answer);
    }
}
