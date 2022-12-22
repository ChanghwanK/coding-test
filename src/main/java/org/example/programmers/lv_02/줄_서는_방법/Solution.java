package org.example.programmers.lv_02.줄_서는_방법;

public class Solution {
    boolean [] visited;
    int[] answer;
    public int[] solution(int n, long k) {
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        return answer;
    }

//    void dfs(int dept) {
//        if (dept == answer.length) {
//
//        }
//
//        for(int i = 0; i < ; i++) {
//
//        }
//    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(3, 5);
        System.out.println("result: " + result);
    }
}
