package org.example.programmers.lv_0.유한_소수_판별하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    /**
     * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
     * 기약분수는 더 이상 나눌 수 없는 분수 (즉, 분모 분자가 서로소)
     */
    public int solution(int a, int b) {
        int answer = 0;
        ArrayList<Integer> divisors = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();

        // 3500 / 500
        if (a % b == 0) return 1;

        // 기약분수를 만듬
        while(true) {
            int gcd = gcd(a,b);
            if (gcd == 1) break;
            a = a / gcd;
            b = b / gcd;
        }

        System.out.println(a);
        System.out.println(b);

        //b의 약수 구하기
        for(int i = 2; i <= 20 ; i++) {
            if(b % i == 0) divisors.add(i);
        }

        System.out.println("divisors: " + divisors);

        // 약수 중에 소수 찾기
        for(int i = 0; i < divisors.size(); i++) {
            if(isPrime(divisors.get(i))) {
                primes.add(divisors.get(i));
            }
        }

        // 유한 소수 이면 1 무한 소수이면 2
        for(Integer num : primes) {
            if(num == 2 || num == 5) {
                answer = 1;
            } else{
                answer = 2;
                break;
            }
        }
        return answer;
    }

    static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if ((num % i) == 0) return false;
        }
        return true;
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
        Solution solution = new Solution();
//        System.out.println(solution.solution(100, 10));
//        System.out.println(solution.solution(1, 30));
//        System.out.println(solution.solution(11,22));
        System.out.println(solution.solution(7,20));
//        System.out.println(solution.solution(12,21));
    }
}
