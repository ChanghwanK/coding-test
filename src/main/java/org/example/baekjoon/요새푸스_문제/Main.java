package org.example.baekjoon.요새푸스_문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n명
        int k = sc.nextInt(); // k번째 사람

        // k번째 사람들 찾아서 없애기 위해 index를 활요할 수 있는
        // LinkedList 사용
        LinkedList<Integer> peoples = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();

        // 참여자 초기화
        for(int i = 1; i <= n; i++)
            peoples.offer(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int removeIdx = 0;
        while(peoples.size() > 1) {
            removeIdx = (removeIdx + (k - 1)) % peoples.size();
            sb.append(peoples.remove(removeIdx)).append(", ");
        }


        sb.append(peoples.remove()).append(">");
        System.out.println(sb);
    }
}
