package org.example.algorithm.combination;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static int n;
    static final char[] values = { 'a', 'b', 'c', 'd' };
    static char [] selected;

    static void makeCombination(int depth, int startIdx) {
        if(depth == n) {
            System.out.println(Arrays.toString(selected));
            return;
        }

        for(int i = startIdx; i < values.length; i++) {
            selected[depth] = values[i];
            makeCombination(depth+1,  i+1); // 중복 방지를 위한 장치: i+1
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        selected = new char[n];
        makeCombination(0,  0); // src에서 3개를 뽑아 만들 수 있는 조합을 모두 출력
    }
}
