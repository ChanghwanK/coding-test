package org.example.baekjoon.풍선터트리기;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            deque.offer(num);
            arr.add(num) ;
        }

        StringBuilder sb = new StringBuilder();
        int num = deque.pollFirst();
        sb.append(arr.indexOf(num) + 1).append(" ");

        while(! deque.isEmpty()) {
            if(num < 0) {
                for(int i = 0; i < Math.abs(num); i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for(int i = 0; i < Math.abs(num); i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
            num = deque.pollFirst();
            sb.append(arr.indexOf(num)).append(" ");
        }

        System.out.println(sb);
    }
}
