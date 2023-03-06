package org.example.programmers.lv_01.삼총사_2;

class Solution {

    /**
     * 3명의 학생 번호를 더했을 때 0이되면 3명의 학생은 삼총사라고 함
     * 학생 번호가 주어졌을 때 삼총사는 몇 가지 경우가 있는지 출력
     *
     *  solution
     * - 완전 탐색으로 진행
     * - 3명이니 3중 for문으로 진행
     * - number[i][j][k] 한 값이 0되면 ans ++;
     */
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                for(int k = j + 1; k < len; k++) {
                    if(number[i] + number[k] + number[j] == 0) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {-2,3,0,2,-5});
        System.out.println("result: " + result);
    }
}