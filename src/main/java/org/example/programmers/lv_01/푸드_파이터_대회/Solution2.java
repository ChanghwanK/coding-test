package org.example.programmers.lv_01.푸드_파이터_대회;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {

    /**
     * 한쪽은 왼쪽부터 한쪽은 오른쪽부터 먹기 시작함
     * 중앙에 물이 있는데 이를 먼저 먹으면 승리
     *
     * 공정성을 위해
     * - 두 선수가 먹는 음식의 종류와 양이 같음
     * - 음식을 먹는 순서도 동일함
     * - 칼로리가 낮은 음식부터 배치
     *
     * food
     * - 인덱스 별로 음식 개수임
     * - 0번은 물 1번은 1번 음식의 개수 2번은 2번 음식의 개수 3번은 3번 음식의 개수
     *
     * Sol
     * - 왼쪽에 한 번 우측에 한 번이니 Linked List 활용
     *
     */
    public String solution(int[] food) {
        String answer = "";
        Deque<Integer> deque = new LinkedList<>();

        // 가운데 물추가
        deque.add(0);

        // 음식 개수만큼 돌면서 양쪽에 음식 추가
        // 이때 짝수가 아닐 경우 1개는 버림 (-1번 반복)

        for(int i = food.length - 1; i > 0; i--) {
            int foodCnt = food[i];
            if(foodCnt % 2 != 0) foodCnt -= 1;

            for(int j = 0; j < foodCnt; j+=2) {
                deque.addFirst(i);
                deque.addLast(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : deque)
            sb.append(num);

        return sb.toString();
    }
    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[] {1,3,4,6});
        System.out.println("result: " + result);
    }
}
