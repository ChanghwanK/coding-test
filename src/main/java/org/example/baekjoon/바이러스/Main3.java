package org.example.baekjoon.바이러스;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    static boolean [][] graph;
    static boolean [] visited;
    static Stack<Integer> stack = new Stack<>();
    static int N, M;
    static int ans;

    private static void dfs(int idx) {
        // 방문할 인덱스를 담는다.
        stack.push(idx);
        visited[idx] = true;

        while(! stack.isEmpty()) {
            Integer value = stack.pop();
            // 방문할 인덱스를 꺼내고 체크
            // 방문할 인덱스에 연결된 노드가 있는가? graph[value][i] == true
            // 방문할 인덱스가 방문한적이 없는가? ! visited[i]
            for(int i = 1; i <= N; i++) {
                if(! visited[i] && graph[value][i]) {
                    ans++;
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        // 그래프 정보 입력
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        int x, y;
        for(int i = 0; i < M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }

        dfs(1);

        System.out.println(ans);
    }
}
