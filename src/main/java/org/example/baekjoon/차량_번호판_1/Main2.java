package org.example.baekjoon.차량_번호판_1;

import java.util.Scanner;

public class Main2 {
    static String input;

    public static int recursive(int idx, char prev) {
        if (idx == input.length()) return 1;

        char start = input.charAt(idx) == 'c' ? 'a' : '0';
        char end = input.charAt(idx) == 'c' ? 'z' : '9';
        int ans = 0;

        for(char i = start; i <= end; i++) {
            if(i != prev) ans += recursive(idx + 1, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        System.out.println(recursive(0, ' '));
    }
}
