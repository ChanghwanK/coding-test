package org.example.algorithm.permutation;

import java.util.Arrays;

public class Main {
    static int [] nums = new int[] {1, 2, 3};
    static int [] selected = new int[nums.length];
    static boolean [] visited = new boolean[nums.length];

    static void permutation(int idx) {
        if(idx == nums.length) {
            System.out.println(Arrays.toString(selected));;
            System.out.println("======");
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            selected[idx] = nums[i];
            permutation(idx + 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        permutation(0);
    }

}
