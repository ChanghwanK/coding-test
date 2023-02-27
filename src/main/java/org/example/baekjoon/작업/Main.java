package org.example.baekjoon.작업;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    /**
     * BFS로 해결
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  노드 수, 작업해야할 개수
        int m = sc.nextInt();

        List<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        // graph 초기화
        // 노드의 개수가 n개 이기 때문에
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println(graph.size());
        graph.forEach(System.out::println);

        System.out.println();
        /**
         *  인덱스 번호가 Key 값이라고 보면 됨
         *  즉, 인덱스번 노드에 붙어있는 노드들은 무엇인지 표현하게 됨
         *
         *  e.g
         *  []
         *  []
         *  []
         *  []
         *  [2]
         *  [4]
         *  [1, 4]
         *
         *  6번 노드는 1번 4번이랑 연결되어있음을 나타냄
         *  5번 노드는 4번
         *  4번 노드는 2번
         */
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(b).add(a);
        }

        graph.forEach(System.out::println);

        Queue<Integer> q = new LinkedList<>();

        int x = sc.nextInt();
        q.add(x);
        visited[x] = true;

        int res = 0;
        while(!q.isEmpty()) {
            int now = q.poll();
            res++;

            for(int i = 0; i < graph.get(now).size(); i++) {
                int next = graph.get(now).get(i);
                if(visited[next]) continue;
                visited[next] = true;
                q.add(next);
            }
        }

        System.out.println(res - 1);
    }

}
