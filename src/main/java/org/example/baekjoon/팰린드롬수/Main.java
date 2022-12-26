package org.example.baekjoon.팰린드롬수;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();

            if(num == 0) break;

            String strNum = String.valueOf(num);

            Deque<Integer> deque = new LinkedList<>();

            for(char a : strNum.toCharArray())
                deque.add(Integer.parseInt(String.valueOf(a)));

            boolean flag = true;
            while(deque.size() > 1) {
                if(deque.remove() != deque.removeLast()) {
                    flag = false;
                }
            }

            if(flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
