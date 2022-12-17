package org.example.baekjoon.퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    static int N;
    static String[] strs;
    static int answer = 0;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        strs = new String[N + 1];

        for(int i = 1; i <= N; i++) {
            strs[i] = br.readLine();
        }
    }

    // 구하고자 하는 것 최대 수익
    static void solve(int day, int havedDay) {
        int startIndex = day;
        int sum = 0;
        int currentHavedDay = havedDay;

        while(startIndex <= N) {
            String[] s1 = strs[startIndex].split(" ");
            int t = Integer.parseInt(s1[0]);
            if(t <= currentHavedDay) {
                sum += Integer.parseInt(s1[1]);
                startIndex += t;
                currentHavedDay -= t;
                answer = Math.max(answer, sum);
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        input();
        for(int day = 1; day <= N; day++) {
            solve(day, N + 1 - day);
            System.out.print("day: " + day + " ");
            System.out.println(answer);
        }

    }
}
