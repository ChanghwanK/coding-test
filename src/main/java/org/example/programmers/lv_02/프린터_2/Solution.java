package org.example.programmers.lv_02.프린터_2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class Paper {
        int priority;
        boolean isTarget;

        public Paper(int priority, boolean isTarget) {
            this.priority = priority;
            this.isTarget = isTarget;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Paper> queue = new LinkedList<>();

        // 문서 생성 후 대기열에 PUSH
        for(int i = 0; i < priorities.length; i++) {
            Paper newPaper = new Paper(priorities[i], location == i);
            queue.offer(newPaper);
        }
        // 꺼내서 더 중요한 문서가 있는지 검사
        while(true) {
            Paper currentPaper = queue.poll();
            boolean printable = true;

            for(Paper remained : queue) {
                if (remained.priority > currentPaper.priority) {
                    printable = false;
                }
            }

            if (! printable) {
                queue.offer(currentPaper);
                continue;
            }

            answer ++;
            if (currentPaper.isTarget) break;
        }


        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [] arr = {2,1,3, 2};
        var result = solution.solution(arr, 2);
        System.out.println("result: " + result);
    }
}
