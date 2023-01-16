package org.example.baekjoon.회전하는_큐;

import java.util.LinkedList;
import java.util.Scanner;

public class Main4 {
    // 수의 위치가 순서대로 주어진다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] wantedNumPosition = new int[m];
        LinkedList<Integer> nums = new LinkedList<>();

        for(int i = 0; i < m; i++)
            wantedNumPosition[i] = sc.nextInt();

        for(int i = 1; i <= n; i++) nums.offer(i);


        int cnt = 0;
        for(int wantedIdx : wantedNumPosition) {
            int halfIdx;
            int targetIdx = nums.indexOf(wantedIdx);

            if(nums.size() % 2 == 0) {
                halfIdx = nums.size() / 2 - 1;
            } else {
                halfIdx = nums.size() / 2;
            }


            if(wantedIdx <= halfIdx) {
                for(int i = 0; i < targetIdx; i++) {
                    nums.offerLast(nums.pollFirst());
                    cnt++;
                }
            }else {
                for(int i = 0; i < nums.size() - targetIdx; i++) {
                    nums.offerFirst(nums.pollLast());
                    cnt++;
                }
            }

            nums.poll();
        }

        System.out.println(cnt);
    }
}
