package org.example.baekjoon.분수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 몇번째 그룹
        int groupNumber = getGroupNumberOf(N);
//        System.out.println(groupNumber);

        // 그룹에서 몇번째
        int indexInGroup = getIndexInGroup(N, groupNumber);

        // 순방향 역방향
        if(groupNumber % 2 == 0) {
            // 순방향이면
            // 분모가 4 3 2 1로 줄어듬
            int bottom = groupNumber;
            int top = 1;

            for(int i = 0; i < indexInGroup - 1; i++) {
                bottom -= 1;
                top += 1;
            }
            String str = String.format("%d/%d",top, bottom);
            System.out.println(str);

        } else {
            // 역방향이면
            // 분모가 4 3 2 1로 줄어듬
            int bottom = 1;
            int top = groupNumber;

            for(int i = 0; i < indexInGroup - 1 ; i++) {
                bottom += 1;
                top -= 1;
            }
            String str = String.format("%d/%d",top, bottom);
            System.out.println(str);

        }
    }

    private static int getIndexInGroup(int n, int groupNumber) {
        int prevCnt = 0;
        for(int i = 1; i <= groupNumber - 1; i++) {
            prevCnt += i;
        }

        return n - prevCnt;
    }

    private static int getGroupNumberOf(int n) {
        // 10의 경우 4번째 그룹에 존재함
        int groupNumber = 1;
        int curCnt = 0;

        for(int i = 1; i <= n; i++) {
            curCnt += i;
            int temp = curCnt - (curCnt - i);
            if( temp <= n && curCnt >= n) {
                return groupNumber;
            }
            groupNumber++;
        }


        return groupNumber;
    }


}
