package org.example.baekjoon.재귀의_귀재;

import java.util.Scanner;

public class Main {
    static int N;
    static String [] strs;
    static int cnt;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        strs = new String[N];

        for(int i = 0; i < strs.length; i++)
            strs[i] = sc.next();

    }

    static int recursive(String s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursive(s, l+1, r-1);
    }

    static int solve(String s) {
        return recursive(s, 0, s.length() - 1);
    }
    
    public static void main(String[] args) {
        input();
        for(String s : strs) {
            cnt = 0;
            System.out.print(solve(s) + " ");
            System.out.println(cnt);
        }
    }
}
