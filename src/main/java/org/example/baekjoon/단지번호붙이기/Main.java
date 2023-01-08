package org.example.baekjoon.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 핵심은
 *  - 이중 반복문 돌면서 방문할 것인지 아닌지 판단하는 것
 *  - 방문을 할 때는  방문할 수 있는 인접 노드들을 모두 방문하고 로직에 맞게 변경하고 방문 종료
 */
public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int countPerDanji;

    /**
     * 체크
     * - 현재 방문 하고자 하는 좌표가 벽인지
     * - 이미 방문한 곳인지?
     * - 방문하고자 하는 곳이 방문 조건에 부합한지? (문제에선 아파트가 있는지)
     *
     * 다 통과했다면 새롭게 방문할 곳이니 방문처리하고 count 증가 후
     * 다음 인접노드들 방문
     */
    static void dfs(int x, int y) {
        if (x < 0 || x >= graph.length || y < 0 || y >= graph[0].length) return;
        if(visited[x][y] || graph[x][y] != 1) return;

        visited[x][y] = true;
        countPerDanji++;
        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++)
                graph[i][j] = s.charAt(j) - '0';
        }

        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (graph[i][j] == 1 && !visited[i][j]) {
                    countPerDanji = 0;
                    dfs(i, j);
                    countList.add(countPerDanji);
                }

        System.out.println(countList.size());
        Collections.sort(countList);
        for (int i = 0; i < countList.size(); i++)
            System.out.println(countList.get(i));
        br.close();
    }
}
