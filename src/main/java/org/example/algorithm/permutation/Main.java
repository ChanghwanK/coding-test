package org.example.algorithm.permutation;

import java.util.Arrays;

public class Main {
    static boolean [] visited;
    static int [] nums;
    static int [] selectableNums = {1,2,3};

    public static void main(String[] args) {
        nums = new int[3];
        visited = new boolean[3]; // 3 + 1
        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == 3) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i = 0; i < 3; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            nums[depth] = i + 1; // 현재 뎁스의 값을 구하는 것이기 때문에 nums에는 depth 값이 와야함
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}
