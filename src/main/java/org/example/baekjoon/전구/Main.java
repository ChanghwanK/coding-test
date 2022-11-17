package org.example.baekjoon.전구;

import java.util.Scanner;

public class Main {
    public static int n, m; // 전구개수
    static int [] lights = new int[4001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // 전구 초기 셋팅
        for ( int i = 1; i <= n; i++ ) {
            lights[i] = sc.nextInt();
        }

        // 명령어 셋팅
        for ( int i = 0; i < m; i++ ) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            func(a,b,c);
        }

        for ( int i = 1; i <= n; i++ ) {
            System.out.print(lights[i] + " ");
        }
    }

    static void func(int a, int b, int c) {
        if (a == 1) {
            // b의 전구를 c 상태로 바꾼다.
            lights[b] = c;
        } else if (a == 2) {
            // b부터 c까지의 전구 상태를 바꾼다.
            for(int i = b; i <= c; i++) {
                if(lights[i] == 1) {
                    lights[i] = 0;
                } else {
                    lights[i] = 1;
                }
            }
        } else if (a == 3) {
            for(int i = b; i <= c; i++) {
                lights[i] = 0;
            }
        } else {
            for(int i = b; i <= c; i++) {
                lights[i] = 1;
            }
        }
    }

    static void func2(int a, int b, int c) {
        if ( a == 1 ) {
            // b전구의 상태를 c로 변경
            lights[b] = c;
        } else if ( a == 2 ) {
            // b번부터 c번까 전구상태 스위치
            for ( int i = b; i <= c ; i++ ) {
                if (lights[i] == 0) {
                    lights[i] = 1;
                } else {
                    lights[i] = 0;
                }
            }
        } else if ( a == 3 ) {
            // b번부터 c번까지 전구 끔
            for ( int i = b; i <= c ; i++ ) {
                lights[i] = 0;
            }
        } else {
            // b번부터 c번까지 전구 킴
            for ( int i = b; i <= c ; i++ ) {
                lights[i] = 1;
            }
        }
    }
}
