package org.example.baekjoon.트럭;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int W;
    static int L;
    static int moveCnt = 0;
    static Queue<Truck> truckQueue = new LinkedList<>();
    static List<Truck> bridge = new ArrayList<>();

    static class Truck {
        private int weight;
        private int movingDistance;
        public Truck(int weight) {
            this.weight = weight;
            this.movingDistance = 0;
        }

        public void move() {
            this.movingDistance+=1;
        }

        public boolean isBridgeOut() {
            return (movingDistance) > W;
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        L = sc.nextInt();

        for(int i = 0; i < N; i++)
            truckQueue.offer(new Truck(sc.nextInt()));

    }

    static void moveTrucksAndRemoveOnBridge() {
        // 다리위의 트럭을 이동시키고 다 이동한 것은 제거한다.
//        List<Truck> removeTargets = new ArrayList<>();
//        for(Truck truck : bridge) {
//            truck.move();
//            moveCnt+=1;
//            if(truck.isBridgeOut()) bridge.remove(truck);
//        }

        Iterator<Truck> iterator = bridge.iterator();
        while(iterator.hasNext()) {
            Truck truck = iterator.next();
            truck.move();
            moveCnt += 1;
            if(truck.isBridgeOut()) iterator.remove();
        }
    }

    static void solve() {
        while(! truckQueue.isEmpty()) {
            Truck cur = truckQueue.peek();
            int totalWeight = getTotalWeightOnBridge();

            if(totalWeight + cur.weight <= L) {
                Truck movedTruck = truckQueue.poll();
                moveCnt += 1;
                movedTruck.move();
                moveTrucksAndRemoveOnBridge();
                bridge.add(movedTruck);
            } else {
                // 무게가 가득참
                // 다리위의 트럭을 이동해서 무게를 낮추는 것이 목표
                // 무게를 낮추면 다음 트럭을 받야함
//                Truck truck = bridge.get(0);
//                while(! truck.isBridgeOut()) {
//                    truck.move();
//                    moveCnt++;
//                }
//                bridge.remove(0);
                // 더 받을 수 있을 때까지 이동하면서 제거
                // 더 받을 수 있는 것은 =  cur.weight + total <= L
                while(getTotalWeightOnBridge() + cur.weight > L) {
                    moveTrucksAndRemoveOnBridge();
                }
            }
//            moveTrucksAndRemoveOnBridge();
        }
    }

    static int getTotalWeightOnBridge() {
        int totalWeight = 0;
        for(Truck truck : bridge) {
            totalWeight += truck.weight;
        }
        return totalWeight;
//        return bridge.stream().mapToInt(truck-> truck.weight).sum();
    }

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(moveCnt);

    }
}
