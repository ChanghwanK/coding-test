package org.example.baekjoon.풍선터트리기;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();
//        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            deque.offer(num);
//            arr.add(num) ;
        }

        StringBuilder sb = new StringBuilder();
        int num = deque.pollFirst();
        int total = 1;
        sb.append(total).append(" ");

        while(! deque.isEmpty()) {
            if(num < 0) {
                for(int i = 0; i < Math.abs(num) - 1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            } else {
                for(int i = 0; i < Math.abs(num) - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            }
            int target = deque.pollFirst();
            System.out.println("total: " + total);
        }

//        System.out.println(sb);
    }
}
