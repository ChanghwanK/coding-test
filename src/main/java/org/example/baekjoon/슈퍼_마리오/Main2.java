package org.example.baekjoon.슈퍼_마리오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
    static int [] scores = new int[10];
    static int ans = 0;

    static void input() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            scores[i] = sc.nextInt();
        }
    }

    // 100이 넘는 순간
    // 100이 넘기 직전
    static void solve() {
        int total = 0;
        int before = 0;

        for(int i = 0; i < 10; i++) {
            if (total <= 100) {
                before = total;
                total += scores[i];
            }
        }

        if (before == 100) {
            ans = before;
            return;
        }

        if ((100 - before) == (total - 100)) {
            ans = total;
            return;
        }

        ans = before;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = 0; // 누적값
        int res=0; // 추가 누적이전 값
        for(int i=0;i<10;i++) {
            int a = Integer.parseInt(br.readLine());
            if(s<100){
                s+=a; // 100이 넘어가도 더하기를 일단 함

                // 누적 합이 100보다 작을 경우에는 게속 tempA가 더 큼
                // 누적 합  (s)가 100보다 커지면 tempA가 더 커짐
                // result 갱신 조건은 100이하이니
                // res = 98 s: 103
                // 2, 3
                // tempB 더 커짐
                if(Math.abs(res-100) > Math.abs(s-100)) {
                    res = s; // 누적합이 100보다 더 크면 res를 갱신하지 않음
                }else if(Math.abs(res-100)==Math.abs(s-100)) {
                    res = Math.max(res, s);
                }
            }
        }
        System.out.println(res);
    }
}
