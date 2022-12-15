package org.example.programmers.코테_광탈_방지_KIT.기지국_설치;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    /**
     *
     * @param n 아파트 동 개수
     * @param stations 현재 기지국 위치
     * @param w : 전파 도달거리
     */
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        // 기지국을 최소로 설치하면서 모든 아파트에 전달하고자 함
        // 11 , {4, 11}이면서 전파 거리가 1인 경우 최소 3개가 필요함

        // 최소로 설치해야하기 때문에 최대한 전파를 많이 보낼 수 있도록 해야함
        // 즉 현재 설치위치의 전파 범위를 벗어날 경우 설치할 것인데 설치 위치는 중간에 설치해야 함

        // 일단 전파 범위를 벗어나면 설치할 것
        // 설치하는 위치는 전파 범위만큼 이동해서 설치

        Queue<Integer> stationQueue = new LinkedList<>();
        for(int s : stations) stationQueue.offer(s);

        int position = 1;
        while(position <= n) {
            if(!stationQueue.isEmpty() && stationQueue.peek() - w <= position) {
                position = stationQueue.poll() + w + 1;
            } else {
                answer+=1;
                position += 2 * w + 1;
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(11, new int[]{4, 11}, 1);
//        var result = solution.solution(16, new int[]{9}, 2);
        System.out.println("result: " + result);
    }
}