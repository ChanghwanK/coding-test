package org.example.programmers.lv_0.합성수_찾기;

public class Solution {

    /**
     * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다
     */
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) cnt ++;
        }
        answer = n - cnt;
        return answer;
    }

    public boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(10);
        var result2= solution.solution(15);

        System.out.println(result);
        System.out.println(result2);

//        System.out.println(solution.isPrime(9));
    }
}
