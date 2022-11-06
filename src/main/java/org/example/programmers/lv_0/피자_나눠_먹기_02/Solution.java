package org.example.programmers.lv_0.피자_나눠_먹기_02;

public class Solution {
    // 6조각으로 나눔
    // n명이 주문한 피자를 모두 같은 수의 조각을 먹어야 함
    public int solution(int n) {
        // n: 사람 수
        // n과 6의 최소 공배수? => 조각수가 되고 => 조각수에서 /6 하면 피자 판 수
        int answer = 0;
        if (n % 6 == 0) {
            return n / 6;
        } else {
            answer = lcm(n,6) / 6;
        }
        return answer;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(4);
        System.out.println("Result: " + result);
    }
}
