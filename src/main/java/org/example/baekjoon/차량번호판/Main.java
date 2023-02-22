package org.example.baekjoon.차량번호판;

import java.util.Scanner;

public class Main {

    private static int go(String pattern, int index, char last) {
        if(index == pattern.length()) {
            return 1;
        }

        char start = pattern.charAt(index) == 'c' ? 'a': '0';
        char end = pattern.charAt(index) == 'c' ? 'z' : '9';
        int ans = 0;

        for(char i = start; i <= end; i++) {
            if(i != last) {
                ans += go(pattern, index + 1, i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        System.out.println(go(val, 0, ' '));
    }
}
