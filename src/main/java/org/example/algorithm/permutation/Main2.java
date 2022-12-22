package org.example.algorithm.permutation;

import java.util.Arrays;

public class Main2 {
    static boolean[] visited;
    static int [] output;
    static int[] arr = {1, 2, 3};

    public static void main(String[] args) {
        int n = 3;

        output = new int[n];
        visited = new boolean[3];

        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == 3) {
            System.out.println("arr: " + Arrays.toString(output));
            return;
        }

        for (int i = 0; i < 3; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            output[depth] = arr[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
