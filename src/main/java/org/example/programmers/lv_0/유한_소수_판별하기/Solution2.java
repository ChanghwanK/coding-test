package org.example.programmers.lv_0.유한_소수_판별하기;

import java.util.ArrayList;

public class Solution2 {

    /**
     * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
     * 기약분수는 더 이상 나눌 수 없는 분수 (즉, 분모 분자가 서로소)
     */
    public int solution(int a, int b) {
        if (a % b == 0) return 1;

        // 기약분수를 만듬
        while(true) {
            int gcd = gcd(a,b);
            if (gcd == 1) break;
            a = a / gcd;
            b = b / gcd;
        }

        System.out.println("b: " + b);
        if (b % 2 == 0) {
            return 1;
        } else if(b % 5 == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    static int gcd(int a, int b) {
        while(b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        System.out.println(solution.solution(100, 10));
//        System.out.println(solution.solution(1, 30));
//        System.out.println(solution.solution(11,22));
        System.out.println(solution.solution(7,20));
//        System.out.println(solution.solution(12,21));
    }
}
