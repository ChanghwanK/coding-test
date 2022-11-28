package org.example.programmers.위클리_챌린지;

public class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 1; i <= count; i++) {
            long a = (long) price * i;
            total += a;
        }

        return money > total ? 0 : total - money;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(3, 20, 4);
        System.out.println("result: " + result);
    }
}
