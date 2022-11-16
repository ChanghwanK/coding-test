package org.example.programmers.lv_0.머쓱이_보다_키큰사람;

public class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {149, 180, 192, 170}, 167);
    }

}
