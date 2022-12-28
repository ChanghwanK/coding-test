package org.example.baekjoon.암호만들기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean check(String pwd) {
        int ja = 0;
        int mo = 0;
        for (char x : pwd.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }

    public static void recur(int n, String [] alpha, String password, int index) {
        if (password.length() == n) {
            if(check(password)) {
                System.out.println(password);
            }
            return;
        }
        if (index >= alpha.length) return;

        recur(n, alpha, password + alpha[index], index + 1);
        recur(n, alpha, password, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] alpha = new String[m];
        for (int i=0; i<m; i++) {
            alpha[i] = sc.next();
        }

        Arrays.sort(alpha);

        recur(n, alpha, "", 0);
    }
}
