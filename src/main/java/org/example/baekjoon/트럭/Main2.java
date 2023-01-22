package org.example.baekjoon.트럭;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    static int N;
    static int W;
    static int L;
    static int moveCnt = 0;
    static Queue<Integer> bridge = new LinkedList<>();
    static Queue<Truck> truckQueue = new LinkedList<>();


    static class Truck {
        int weight;
        public Truck(int weight) {
            this.weight = weight;
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

    static void solve() {
        while(! bridge.isEmpty() ) {

        }
    }

    private static int getTotalTruckWeightOnBridge() {
        int weight = 0;
        for(Integer integer : bridge)
            weight += integer;
        return weight;
    }


    public static void main(String[] args) {
        input();
        solve();
        System.out.println(moveCnt);
    }
}
