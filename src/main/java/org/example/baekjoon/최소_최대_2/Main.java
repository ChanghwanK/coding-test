package org.example.baekjoon.최소_최대_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TC = sc.nextInt();

        List<List<Integer>> answers = new ArrayList<>();

        for (int i = 0; i < TC; i++) {
            int N = sc.nextInt();
            int MAX_VAL = Integer.MIN_VALUE;
            int MIN_VAL = Integer.MAX_VALUE;

            for (int j = 0; j < N; j++) {
                int target = sc.nextInt();
                if (MAX_VAL < target) MAX_VAL = target;
                if (MIN_VAL > target) MIN_VAL = target;
            }

            System.out.println(MIN_VAL + " " + MAX_VAL);
        }

    }
}
