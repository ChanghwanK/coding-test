package org.example.baekjoon.회전하는_큐;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int [] targets;
    static LinkedList<Integer> dequeue = new LinkedList<>();

    private static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        targets = new int[M];

        for(int i = 1; i <= N; i++)
            dequeue.add(i);


        for(int i = 0; i < M; i++)
            targets[i] = sc.nextInt();
    }

    private static int solve(int target) {
        int targetIdx = dequeue.indexOf(target);
        int halfIdx;
        int cnt = 0;

        if(dequeue.size() % 2 == 0) {
            halfIdx = dequeue.size() / 2 - 1;
        } else {
            halfIdx = dequeue.size() / 2;
        }

        if(targetIdx <= halfIdx) {
            for(int i = 0; i < targetIdx; i++) {
                dequeue.offerLast(dequeue.pollFirst());
                cnt++;
            }
        } else {
            for(int i = 0; i < dequeue.size() - targetIdx; i++) {
                dequeue.offerFirst(dequeue.pollLast());
                cnt++;
            }
        }

        dequeue.pollFirst();
        return cnt;
    }

    public static void main(String[] args) {
        input();
        int ans = 0;

        for(int i = 0; i < M; i++) {
            ans += solve(targets[i]);
        }

        System.out.println(ans);
    }
}
