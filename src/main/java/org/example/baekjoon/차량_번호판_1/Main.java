package org.example.baekjoon.차량_번호판_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int total = 1;
        char prev = input.charAt(0);

        if (prev == 'd') {
            total *= 10;
        } else {
            total *= 26;
        }

        for(int i = 1; i < input.length(); i++) {
            int dCnt = 0;
            int cCnt = 0;
            char currentChar = input.charAt(i);
            if(currentChar == 'd' && prev == currentChar) {
                dCnt++;
                total *= (10 - dCnt);
            } else if(currentChar == 'c' && prev == currentChar) {
                cCnt++;
                total *= (26 - cCnt);
            } else {
                // 연속되지 않는 경우
                if (currentChar == 'd') total *= 10;
                if (currentChar == 'c') total *= 26;
            }

            prev = currentChar;
        }

        System.out.println(total);
    }
}
