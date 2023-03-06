package org.example.baekjoon.보물;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    /**
     * 1 1 1 6 0
     * 2 7 8 3 1
     *
     * 1  1 6
     * 2   3 1
     *
     * 8-0 7-1 1-3 1-2 6-1
     *
     * 즉 젤 큰 것과 제일 작은 것을 매칭하면 됨
     *
     * 1 1 3
     * 10 30 20
     *
     * 30 1 20 1 10 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();
        Integer [] a = new Integer[TC];
        Integer [] b = new Integer[TC];


        for(int i = 0; i < TC; i++) {
            a[i] = sc.nextInt();

        }

        for(int j = 0; j < TC; j++) {
            b[j] = sc.nextInt();
        }

        // a는 오름차순 정렬
        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0; i < TC; i++) {
            sum += (a[i] * b[i]);
        }

        System.out.println(sum);
    }
}
