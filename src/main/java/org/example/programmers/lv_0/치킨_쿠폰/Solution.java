package org.example.programmers.lv_0.치킨_쿠폰;

public class Solution {
    static final int BONUS_NUM = 10;
    public int solution(int chicken) {
        int answer = 0;

        int orderChick = chicken / BONUS_NUM;
        int restCoupon = orderChick + chicken % BONUS_NUM;

        while (true) {
            answer += orderChick;

            /**
             * 놓친 부분: 반복의 종료조건
             * - 치킨을 더 이상 시키지 못하는 것은 남은 쿠폰이 보너스 치킨 cnt보다 작을 떄
             */
            if (restCoupon < BONUS_NUM) {
                break;
            }

            orderChick = restCoupon / BONUS_NUM;
            restCoupon = orderChick + restCoupon % BONUS_NUM;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(1081));;
    }
}
