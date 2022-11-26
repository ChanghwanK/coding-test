package org.example.programmers.자료구조_알고리즘_강의.기능_개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        // 93, 30, 55 | 1, 30, 5
        // 7, 3, 9
        // 7일 뒤에 7,3 배포 가능 2
        // 남은 것 배포 1

        // 100 - 93 / speed
        Queue<Integer> needDays = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int needDay = (int) Math.ceil((100 - p) / s);
            needDays.offer(needDay);
        }
        System.out.println(needDays);
        // 앞의 숫자 보다 작다면 배포 가능
        Queue<Integer> answers = new LinkedList<>();
        int releaseCnt = 1;
        int firstJobNeedDay = needDays.poll();
        while(!needDays.isEmpty()) {
            int nextNeedDay = needDays.poll();

            if (firstJobNeedDay >= nextNeedDay) {
                releaseCnt++;
                continue;
            }

            answers.offer(releaseCnt);
            releaseCnt = 1;
            firstJobNeedDay = nextNeedDay;
        }
        answers.offer(releaseCnt);

        return answers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        int [] progresses = new int[] {93, 30, 55};
        int [] speeds = new int[] {1, 30, 5};
        Solution2 solution = new Solution2();
        var result = solution.solution(progresses, speeds);
        System.out.println("result: " + Arrays.toString(result));
    }
}
