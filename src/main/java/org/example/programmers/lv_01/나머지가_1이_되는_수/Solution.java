package org.example.programmers.lv_01.나머지가_1이_되는_수;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 2;
        while(n % x != 1) {
            x++;
        }
        return x;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(12);
        System.out.println("result: " + result);
    }
}
