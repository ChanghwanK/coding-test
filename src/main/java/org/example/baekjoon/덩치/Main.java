package org.example.baekjoon.덩치;

import java.util.Scanner;

public class Main {
    static int N;
    static int [][] peopleInfos;
    static int [] ranks;
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        peopleInfos = new int[N][2];
        ranks = new int[N];
        for(int i = 0; i < N; i++) {
            peopleInfos[i][0] = sc.nextInt();
            peopleInfos[i][1] = sc.nextInt();
        }
    }

    // index의 등수를 찾는다
    static void solve(int index) {

        if(index >= N) return;

        int rank = 1;
        for(int i = 0; i < N; i++) {
            if (index == i) continue;
            if (peopleInfos[index][0] < peopleInfos[i][0] && peopleInfos[index][1] < peopleInfos[i][1]) rank++;
        }

        ranks[index] = rank;
        solve(index + 1);
    }

    public static void main(String[] args) {
        input();

        // index 넘겨주면 알아서 index번째의 정보의 rank가 결정
        solve(0);

        for(int rank : ranks)
            System.out.print(rank + " ");
    }
}
