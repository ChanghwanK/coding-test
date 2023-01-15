package org.example.baekjoon.요새푸스_문제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * K 번째 사람 제거 방법
 * 1. Queue를 이용해 K번 앞으로 이동하고 제거
 *  - 앞으로 이동된 멤버는 큐의 뒤에다 다시 넣어줌
 *  - 이 과정을 큐가 빌 떄까지 진행
 * 2. LinkedList를 이용해 삭제할 갱신
 *  - 삭제할 인덱스는 현재 인덱스 + K 를 LinkedList 길이로 % 해줘야함
 *
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++)
            queue.offer(i);

        int count = 1;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            if(count == k) {
                ans.add(temp);
                count = 1;
                continue; // count == k 일 경우 continue하여 아래 단계는 생략
            }
            queue.offer(temp);
            count++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 0; i < ans.size() - 1; i++) {
            sb.append(ans.get(i)).append(", ");
        }

        sb.append(ans.get(ans.size() - 1)).append(">");

        System.out.println(sb);

    }

}
