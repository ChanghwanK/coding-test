package org.example.baekjoon.회전하는_큐;

import java.util.LinkedList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] idxs = new int[m];

        for(int i = 0; i < m; i++) {
            idxs[i] = sc.nextInt();
        }
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++)
            queue.offer(i);

        // 왼쪽으로 이동할지 혹은 오른쪽으로 이동할지
        // size() / 2보다 작다면 왼쪽으로 한 칸씩 이동 반대로 크다면 오른쪽으로 이동
        int cnt = 0;
        for(int wantedIdx : idxs) {
            int halfIdx;
            int targetIdx = queue.indexOf(wantedIdx);
            if(queue.size() % 2 == 0) {
                halfIdx = queue.size() / 2 - 1;
            } else {
                halfIdx = queue.size() / 2;
            }

            // 왼쪽으로 이동
            if(targetIdx <= halfIdx) {
                for(int i = 0; i < targetIdx; i++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    cnt++;
                }
            }
            // 오른쪽으로 이동
            else {
                for(int i = 0; i < queue.size() - targetIdx; i++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    cnt++;
                }
            }
            queue.pollFirst();
        }

        System.out.println(cnt);
    }
}
