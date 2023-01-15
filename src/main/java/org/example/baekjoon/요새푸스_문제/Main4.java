package org.example.baekjoon.요새푸스_문제;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * LinkedList 방식
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            list.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 삭제할 인덱스
        int removedIdx = 0;
        while(list.size() > 1) {
            removedIdx = (removedIdx + k - 1) % list.size();
            sb.append(list.remove(removedIdx)).append(", ");
        }

        sb.append(list.remove(list.size() - 1)).append(">");
        System.out.println(sb);
    }
}
