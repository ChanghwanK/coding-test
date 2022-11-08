package org.example.programmers.lv_0.양꼬치;

public class Solution {
    public int solution(int n, int k) {
        int totalSum = 0;
        int price1 = 12000; // 양꼬치
        int price2 = 2000;  // 음료

        totalSum = (price1 * n) + (price2 * k);

        if (n >= 10) {
            totalSum = totalSum - ((n / 10) * 2000);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(10, 3);
        System.out.println("Result: " + result);
    }
}
