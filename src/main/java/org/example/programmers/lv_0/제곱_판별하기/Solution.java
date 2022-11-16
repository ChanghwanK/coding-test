package org.example.programmers.lv_0.제곱_판별하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        var data = Math.sqrt(n);
        var result = data - (int) data;
        return result == 0.0 ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(144);
    }

}
