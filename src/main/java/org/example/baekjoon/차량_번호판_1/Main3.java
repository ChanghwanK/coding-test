package org.example.baekjoon.차량_번호판_1;

import java.util.Scanner;

public class Main3 {
    static String inputValue;

    static int recursive(int idx, char last) {
        if (idx == inputValue.length()) return 1;

        char start = inputValue.charAt(idx) == 'c' ? 'a' : '0';

        char end = inputValue.charAt(idx) == 'c' ? 'z' : '9';
        int ans = 0;
        for (char i = start; i <= end; i++) {
            if (i != last)
                ans += recursive(idx + 1, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputValue = sc.next();

        recursive(0, ' ');
    }

}
