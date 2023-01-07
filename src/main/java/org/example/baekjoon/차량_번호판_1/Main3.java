package org.example.baekjoon.차량_번호판_1;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        Stack<Character> processed =  new Stack<>();
        int ans = 1;
        int numberCnt = 10;
        int wordCnt = 26;

        for(int i = 0; i < commands.length(); i++) {
            char curCommand = commands.charAt(i);
            // processed가 비엇다면 로직 진행
            if(! processed.isEmpty()) {
                char prev = processed.peek();
                if(curCommand == 'c') {
                    if(prev == curCommand) {
                        wordCnt--;
                    } else {
                        wordCnt = 26;
                    }
                    ans *= wordCnt;
                }

                if(curCommand == 'd') {
                    if(prev == curCommand) {
                        numberCnt--;
                    } else {
                        numberCnt = 10;
                    }
                    ans *= numberCnt;
                }
                processed.push(curCommand);
            }
            // 비엇다면 최초는 push
            else {
                if(curCommand == 'c') ans *= wordCnt;
                if(curCommand == 'd') ans *= numberCnt;
                processed.push(curCommand);
            }
        }

        // 출력
        System.out.println("result: " + ans);
    }
}
