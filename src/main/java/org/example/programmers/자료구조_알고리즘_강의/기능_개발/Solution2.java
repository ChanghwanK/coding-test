package org.example.programmers.자료구조_알고리즘_강의.기능_개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution2 {
    public int[] solution(int[] progresses, int[] speeds) {

        // 배포까지 남은 일수 구하기
        Queue<Integer> days = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int day = (int) Math.ceil((100 - p) / s);
            days.offer(day);
        }

        int day = days.poll();
        int releaseCnt = 1;
        List<Integer> answer = new ArrayList<>();

        while(!days.isEmpty()) {
            int n = days.poll();

            if (day >= n) {
                releaseCnt++;
                continue;
            }

            answer.add(releaseCnt);
            releaseCnt = 1;
            day = n;
        }

        answer.add(releaseCnt);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        int [] progresses = {93, 30, 55};
        int [] speeds = {1, 30 ,5};
        var result = solution.solution(progresses, speeds);
        System.out.println("result: " + result);
    }
}
