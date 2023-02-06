package org.example.baekjoon.만들기_0;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    static String [] selected;

    static void dfs(final int size , int idx ) {
        if(idx == size) {
            System.out.println(Arrays.toString(selected));
            return;
        }

        selected[idx] = " ";
        dfs(size, idx + 1);

        selected[idx] = "+";
        dfs(size, idx + 1);

        selected[idx] = "-";
        dfs(size, idx + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < sc.nextInt(); i++) {
            int n = sc.nextInt();
            selected = new String[n-1];

            dfs(n - 1, 0);
        }
    }
}
