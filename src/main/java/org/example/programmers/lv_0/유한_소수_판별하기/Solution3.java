package org.example.programmers.lv_0.유한_소수_판별하기;

import java.util.ArrayList;

public class Solution3 {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b);
        // 왜 나눠줘야하는가?
        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
//        System.out.println(solution.solution(100, 10));
//        System.out.println(solution.solution(1, 30));
//        System.out.println(solution.solution(11,22));
        System.out.println(solution.solution(7,20));
//        System.out.println(solution.solution(12,21));
    }
}
