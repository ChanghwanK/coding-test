package org.example.baekjoon.프린터_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 11:30분까
public class Main {

    static class Paper {
        int priority;
        boolean isWanted;

        public Paper(int priority, boolean isWanted) {
            this.priority = priority;
            this.isWanted = isWanted;
        }
    }

    static int printQueue(int wantedPaperIdx, int[] priorityArr) {
        int res = 0;
        if(priorityArr.length == 1) {
            return 1;
        }

        Queue<Paper> printer = new LinkedList<>();

        for(int i = 0; i < priorityArr.length; i++) {
            printer.offer(new Paper(priorityArr[i], i == wantedPaperIdx));
        }

        while(!printer.isEmpty()) {
            boolean isPrintable = true;
            Paper currentPaper = printer.poll();

            for(Paper next : printer) {
                if(next.priority > currentPaper.priority) {
                    isPrintable = false;
                }
            }

            // 프린트 할 수 있다면 최대 우선 순위이면 프린트 및 하고 카운트 증가 만약 내껏이면
            // 다음 작업 진행
            if(! isPrintable) {
                printer.offer(currentPaper);
                continue;
            }

            res ++;
            if(currentPaper.isWanted) break;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            // 입력받고
            int paperCnt = sc.nextInt();
            int wantedPaperPosition = sc.nextInt();
            int [] priorityArr = new int[paperCnt];
            for(int j = 0; j < paperCnt; j++) {
                priorityArr[j] = sc.nextInt();
            }

            // 풀고
            int res = printQueue(wantedPaperPosition, priorityArr);
            // 출력
            System.out.println(res);
        }
    }

}
