package org.example.programmers.lv_02.네트워크;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean [] visit = new boolean[n];

        // 연결된 모든 노드에 연결될 수 있도록 처리
        for(int i = 0; i < n; i++) {
            if (! visit[i]) {
                answer++;
                allLinkedComputerTryVisit(i, visit, computers);
            }
        }

        return answer;
    }

    private void allLinkedComputerTryVisit(int i, boolean[] visit, int[][] computers) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        while(! queue.isEmpty()) {
            int current = queue.poll();
            visit[current] = true;
            for(int j = 0; j < computers[current].length; j++) {
                if(visit[j]) continue;
                if(computers[current][j] == 1) queue.offer(j);
            }
        }
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [][] computers = new int[][] {{1,1,0}, {1,1,0}, {0,0,1}};
        var result = solution.solution(3, computers);
        System.out.println("result: " + result);
    }
}
