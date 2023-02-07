package org.example.baekjoon.새;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 0;

        int remainBirdCnt = sc.nextInt();
        int doSingingBirdCnt = 1;

        while(remainBirdCnt > 0) {
            sec ++;
            if(remainBirdCnt < doSingingBirdCnt) {
                doSingingBirdCnt = 1;
            }
            remainBirdCnt -= doSingingBirdCnt;
            doSingingBirdCnt++;
        }

        System.out.println(sec);
    }
}
