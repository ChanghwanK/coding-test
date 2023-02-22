package org.example.baekjoon.부녀회장이될테야;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for(int i = 1; i <= TC; i++) {
            int floor = sc.nextInt();
            int number = sc.nextInt();
            int res = 0;


            if(floor == 1) {
                for(int j = 1; j <= number; j++) {
                    res += j;
                }
            } else {
                for(int j = 1; j <= number + 1; j++) {
                    res += j;
                }
            }
            System.out.println(res);
        }
    }
}
