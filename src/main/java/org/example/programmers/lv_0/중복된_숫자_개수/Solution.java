package org.example.programmers.lv_0.중복된_숫자_개수;

public class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == n) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1, 1, 2, 3, 4, 5}, 1);
        System.out.println(result);
    }

}
