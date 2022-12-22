package org.example.programmers.lv_02.프린터;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    static class Paper {
        boolean isMine;
        int priority;

        public Paper(boolean isMine, int priority) {
            this.isMine = isMine;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        // location은 인덱스
        int answer = 0;

        List<Paper> printer = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            printer.add(new Paper(location == i, priorities[i]));
        }

        // 프린터가 계속 빌 때까지
        while(! printer.isEmpty()) {
            Paper paper = printer.remove(0);
            boolean printable = true;
            for(Paper p : printer) {
                if(p.priority > paper.priority) {
                    printable = false;
                }
            }

            if(!printable) {
                printer.add(paper);
                continue;
            }

            answer++;
            if (paper.isMine) return answer;
        }
        return answer;
    }

    public static void main(String [] args) {
        int [] arr = new int[]{2, 1, 3, 2};
        int location = 2;
        var solution = new Solution();
        var result = solution.solution(arr, location);
        System.out.println("result: " + result);
    }
}
