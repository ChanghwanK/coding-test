package org.example.baekjoon.트럭;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {
    static class Truck {
        int weight;
        public Truck(int weight) {this.weight = weight;}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int l = sc.nextInt();
        Queue<Truck> queue = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();

        // 트럭 대기열 초기화
        for(int i = 0; i < n; i++) queue.offer(new Truck(sc.nextInt()));
        // 다리 길이만큼 0으로 초기화
        for(int i = 0; i < w; i++) bridge.offer(new Truck(0));

        // bridge 가 빌 때까지 반복
        int ans = 0;
        int bridgeWeight = 0;
        while(! bridge.isEmpty()) {
            ans++;
            bridgeWeight -= bridge.poll().weight;
            // 트럭 대기열이 비어있지 않다면 하나를 뽑아서 조건 검사
            if(! queue.isEmpty()) {
                if(queue.peek().weight + bridgeWeight <= l) {
                    Truck curTruck = queue.poll();
                    bridgeWeight += curTruck.weight;
                    bridge.offer(curTruck);
                } else {
                    bridge.offer(new Truck(0));
                }
            }
        }

        System.out.println(ans);

    }

    public static int bridgeTotalWeight(Queue<Truck> bridge) {
        return bridge.stream()
            .mapToInt(truck -> truck.weight)
            .sum();
    }
}
