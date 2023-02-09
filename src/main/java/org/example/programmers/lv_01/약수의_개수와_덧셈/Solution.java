package org.example.programmers.lv_01.약수의_개수와_덧셈;

public class Solution {

    /**
     * 약수의 개수를 return
     */
    private int getDivisorCnt(int num) {
        int cnt = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) cnt ++;
        }

        return cnt;
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right ; i++) {
            int divisorCnt = getDivisorCnt(i);

            if(divisorCnt % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(13, 17);
        System.out.println("result: " + result);
    }
}
