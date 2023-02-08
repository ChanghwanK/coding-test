package org.example.baekjoon.트로피진열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 12435
    private static int getLeftSight(List<Integer> trophySizes) {
        int prev = trophySizes.get(0);
        int cnt = 1;

        for(int i = 1; i < trophySizes.size(); i++) {
            int next = trophySizes.get(i);
            if(prev < next) {
                cnt++;
                prev = next;
            }
        }

        return cnt;
    }

    private static int getRightSight(List<Integer> trophySizes) {
        int prev = trophySizes.get(trophySizes.size() - 1);
        int cnt = 1;

        for(int i = trophySizes.size() - 2; i >= 0; i--) {
            int next = trophySizes.get(i);
            if(prev < next) {
                cnt++;
                prev = next;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        // TC 및 데이터 입력
        Scanner sc = new Scanner(System.in);
        final int TC = sc.nextInt();
        List<Integer> trophySizes = new ArrayList<>();

        for(int i = 0; i < TC; i++)
            trophySizes.add(sc.nextInt());

        // 오름차순인 개수를 구해야함
        System.out.println(getLeftSight(trophySizes));
        System.out.println(getRightSight(trophySizes));

        sc.close();
    }
}
