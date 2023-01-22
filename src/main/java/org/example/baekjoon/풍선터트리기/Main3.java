package org.example.baekjoon.풍선터트리기;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main3 {
    static class Balloon {
        int num;
        int position;

        public Balloon(int num, int position) {
            this.num = num;
            this.position = position;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        Deque<Balloon> deque = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            deque.offer(new Balloon(sc.nextInt(), i));
        }


        Balloon curBalloon = deque.pollFirst();
        sb.append(curBalloon.position).append(" ");
        int num = curBalloon.num;

        while(!deque.isEmpty()) {
            // 좌측 이동
            if(num > 0) {
                for(int i = 0; i < num - 1; i++) {
                    Balloon balloon = deque.pollLast();
                    deque.offerFirst(balloon);
                }
            }
            // 우측 이동
            // 우측 이동은 X - 1만큼이 아닌 X만큼 이동
            else {
                for(int i = 0; i < Math.abs(num); i++) {
                    Balloon balloon = deque.pollFirst();
                    deque.offerLast(balloon);
                }
            }

            Balloon balloon = deque.pollFirst();
            sb.append(balloon.position).append(" ");
            num = balloon.num;
        }

        System.out.println(sb);
    }
}
