package org.example.programmers.lv_0.소인수_분해;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    /**
     * 소인수 분해는 숫자의 약수들 중 소수로 계속 나누는 것
     */
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> primes = new ArrayList<>();
        Integer[] divisor = getDivisor(n);

        for(Integer data : divisor) {
            if(isPrime(data)) primes.add(data);
        }

        answer = new int[primes.size()];

        for(int i = 0; i < primes.size(); i++) {
            answer[i] = primes.get(i);
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private Integer[] getDivisor(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= num ; i++) {
            if (num % i == 0) arr.add(i);
        }
        System.out.println(arr);
        return arr.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(420);
        System.out.println(Arrays.toString(data));
    }

}
