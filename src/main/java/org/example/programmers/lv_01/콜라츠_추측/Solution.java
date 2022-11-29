package org.example.programmers.lv_01.콜라츠_추측;

public class Solution {
    public int solution(int num) {
        long n = num;
        if (n == 1) return 0;
        int cnt = 0;

        while(n != 1) {
            n = collatz(n);
            cnt++;

            if(cnt > 500) return -1;
        }

        return cnt;
    }

    //1-1. 입력된 수가 짝수라면 2로 나눕니다.
    //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
    //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    public long collatz(long num) {
        if (num % 2 == 0) {
            num /= 2;
        } else {
            num = num * 3 + 1;
        }
        return num;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(626331);
        System.out.println("result: " + result);
    }
}
