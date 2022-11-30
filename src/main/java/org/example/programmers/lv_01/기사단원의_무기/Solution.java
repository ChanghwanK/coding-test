package org.example.programmers.lv_01.기사단원의_무기;

class Solution {

    /**
     * 기사는 각자 번호의 약수 개수에 해당하는 공격력을 가진 무기를 가질 수 있음 ex) 12 => 4
     * 공격력에 제한있음
     * - 넘어설 경우 협약기관에서 정한 공격력의 무기를 구매
     *
     *  무기를 만들 때 무기의 공격력 1kg당 철 1kg 필요함
     *  무기점에선 무기를 만들기 위해서 미리 철의 무게를 계산하고자함
     *
     *  구하고자 하는 것
     *  - 무기점 주인이 무기를 모두 만들기 위해서 필요한 철의 무게
     */
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 각 기사단원의 약수 구하기
        for(int i = 1; i <= number; i++) {
            int divisorCnt = getDivisorCnt(i);
            if(divisorCnt > limit) divisorCnt = power;
            answer+=divisorCnt;
        }
        // 약수의 개수가 limit를 넘는다면 limit로 설정
        // 다 합쳐서 철의 무게 구하기
        return answer;
    }

    public int getDivisorCnt(int num) {
        int cnt = 0;
        if (num == 1) return 1;
        if (num == 2) return 2;
        if (num == 3) return 2;

        if(isPrime(num)) return 2;

        for(int i = 1; (int) Math.pow(i, 2) <= num ; i++) {
            if (i * i == num) cnt++;
            else if(num % i == 0) cnt +=2;
        }
        return cnt;
    }

    public boolean isPrime(int num) {
        for(int i = 2; i <= (int) Math.sqrt(num) ; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(5, 4, 2);
        System.out.println("result: " + result);
    }
}