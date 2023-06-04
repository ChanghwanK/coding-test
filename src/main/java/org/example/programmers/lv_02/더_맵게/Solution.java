package org.example.programmers.lv_02.더_맵게;

import java.util.PriorityQueue;

public class Solution {

    /**
     * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
     *
     * // 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
     */
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int j : scoville) {
            minHeap.add(j);
        }

        while (minHeap.size() > 1) {
            if (minHeap.peek() >= K)
                break;
            answer++;
            int a = minHeap.poll();
            int b = minHeap.poll();

            int temp = a + (b * 2);
            minHeap.add(temp);

        }

        if (minHeap.peek() < K)
            return -1;


        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1,2,3,9,10,12}, 7);
        System.out.println("result: " + result);
    }

}
