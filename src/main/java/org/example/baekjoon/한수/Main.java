package org.example.baekjoon.한수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int X;
    static int cnt = 0;
    public static void main(String[] args) {
        input();
        solve();
        System.out.println(cnt);
    }

    static void solve() {
        for(int i = 1; i <= X; i++) if(isHanSu(i)) cnt++;
    }

    static boolean isHanSu(int i) {
        // i의 각 자리수가 등차수열을 이루는지
        // 공비 찾기
        if(i >= 1 && i < 100) return true;

        List<Integer> arr = new ArrayList<>();
        while(i != 0) {
            arr.add(i % 10);
            i /= 10;
        }
        arr.sort(Collections.reverseOrder());
        System.out.println("arr: " + arr);

        // 3 2 1
        for(int j = 0; j < arr.size(); j++) {
            for(int k = j + 1; k < arr.size(); k++) {
                int a = arr.get(i);
                int b = arr.get(j);
            }
        }

        return false;
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
    }

}
