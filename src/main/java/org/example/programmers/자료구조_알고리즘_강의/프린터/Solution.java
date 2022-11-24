package org.example.programmers.자료구조_알고리즘_강의.프린터;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    static class Paper {
        int priority;
        boolean isMine;

        public Paper(int priority, boolean isMine) {
            this.priority = priority;
            this.isMine = isMine;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Paper> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            queue.add(new Paper(priorities[i], location == i));
        }

        while(!queue.isEmpty()) {
            Paper now = queue.remove(0);
            boolean printable = true;
            for(Paper p : queue) {
                if(p.priority > now.priority) {
                    printable = false;
                    continue;
                }
            }

            if(!printable) {
                queue.add(now);
                continue;
            }

            answer++;
            if(now.isMine) return answer;
        }

        return answer;
    }

    public static void main(String [] args) {
        int [] arr = new int[]{2, 1, 3, 2};
        int location = 2;
        Solution solution = new Solution();
        var result = solution.solution(arr, location);
        System.out.println("result: " + result);
    }
}
