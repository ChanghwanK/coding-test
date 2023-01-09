package org.example.algorithm.combination;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 조합은 다음 시작점을 아는 것이 중요하다.
 * 이유는 이전 선택은 다음 선택의 목록에서 완전히 제거되어야하기 때문
 *
 * 따라서 dfs를 호출할 땐 시작 depth와 선택지의 시작 위치를 넘기고 다음 호출시 각각 +1을 해준다.
 */
public class Main {
    static int n;
    static final char [] values = {'a','b','c','d'};
    static char [] selected;

    static void comb(int depth, int start) {
        // n개를 뽑았다면
        if (depth == n) {
            System.out.println(Arrays.toString(selected));
            return;
        }

        for(int i = start; i < values.length; i++) {
            selected[depth] = values[i];
            comb(depth + 1, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        n = sc.nextInt();

        selected = new char[n];

        comb(0, 0);
    }
}
