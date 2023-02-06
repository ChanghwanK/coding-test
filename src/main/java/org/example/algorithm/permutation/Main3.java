package org.example.algorithm.permutation;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    static String [] ops = {" ", "+", "-"};
    static String [] opsStore;

    public static void createAllOps(int idx, final int size) {
        if(idx == size) {
            System.out.println(Arrays.toString(opsStore));
            return;
        }

        for(int i = 0; i < ops.length; i++) {
            opsStore[idx] = ops[i];
            createAllOps(i + 1, size);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n - 1;
        opsStore = new String[size];
        createAllOps(0, size);
    }
}
