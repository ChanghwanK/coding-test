package org.example.programmers.lv_0.팩토리얼;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++) {
//            System.out.println(factorial(i));
            if (factorial(i) > n) {
                answer = i - 1;
                break;
            }
        }

        return answer;
    }

    public int factorial(int num) {
        if (num <= 1) return num;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(7);
        System.out.println();
        System.out.println(data);
    }
}
