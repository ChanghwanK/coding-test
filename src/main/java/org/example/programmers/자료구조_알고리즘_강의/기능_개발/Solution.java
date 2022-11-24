package org.example.programmers.자료구조_알고리즘_강의.기능_개발;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //[93, 30, 55], [1, 30, 5]
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();

        // 배포 가능한 날짜 구하기
        for(int i = 0; i < progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int day = (int) ((100 - p) / s);
            queue.offer(day);
        }

        // [7,2,9]
        Queue<Integer> answers = new LinkedList<>();
        int d = queue.poll();
        int releaseCnt = 1;
        while(!queue.isEmpty()) {
            int n = queue.poll();

            if(d >= n) {
                releaseCnt++;
                continue;
            }

            answers.offer(releaseCnt);
            releaseCnt = 1;
            d = n;
        }

        return answers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        int [] progresses = new int[] {93, 30, 55};
        int [] speeds = new int[] {1, 30, 5};
        Solution solution = new Solution();
        var result = solution.solution(progresses, speeds);
        System.out.println("result: " + Arrays.toString(result));
    }
}
