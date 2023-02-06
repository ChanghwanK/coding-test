package org.example.baekjoon.만들기_0;

import java.util.Arrays;

public class Main2 {

    static String [] ops = {" ", "+", "-"};
    static String [] opsStore = new String[ops.length];
    static boolean [] selected = new boolean[ops.length];

    /**
     * " ", +, - 을 사용하여 만들 수 있는 순열을 구하기
     */
    static void operatorPermutation(int idx) {
        if(idx == 3) {
            System.out.println(Arrays.toString(opsStore));
        }

        for(int i = 0; i < ops.length; i++) {
            if(selected[i]) continue;
            selected[i] = true;
            opsStore[idx] = ops[i];
            operatorPermutation(idx + 1);
            selected[i] = false;
        }
    }

    public static void main(String[] args) {
        operatorPermutation(0);
    }

}
