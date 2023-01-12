package org.example.baekjoon.Z;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int n,r,c;
    static int res;
    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
    }

    static void solve(int n, int x, int y) {
        if(n == 2) {
            if(x == r && y == c) {
                System.out.println(res);
            }
            res++;
            if(x == r && y == c + 1) {
                System.out.println(res);
            }
            res++;
            if(x == r + 1 && y == c) {
                System.out.println(res);
            }
            res++;
            if(x == r + 1 && y == c + 1) {
                System.out.println(res);
            }
            return;
        }

        solve(n / 2, x, c);
        solve(n / 2, x + n / 2, c);
        solve(n / 2, x, c + n / 2);
        solve(n / 2, x + n / 2, c + n / 2);
    }

    public static void main(String[] args) throws Exception {
        input();
        solve(n * n, r, c);
    }
}
