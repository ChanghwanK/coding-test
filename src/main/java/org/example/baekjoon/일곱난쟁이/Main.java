package org.example.baekjoon.일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int [] arr = new int[9];
    static int sum;

    static void input(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++) arr[i]= sc.nextInt();

        sum = Arrays.stream(arr).sum();
    }

    // 내가 사고하지 못한 것
    // 7개를 뽑는 것은 즉, 2개를 뽑는 것과 동일한데 이 사고를 하지 못함
    // 일반적으로 생각해보면 N개중 R개를 뽑아야할 때 R이 너무 크다면 그 반대를 생각해보자
    // 반대의 경우를 찾아 참을 증명하는 것으로 할 수 있음
    static void solve() {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);

                    for(int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
}
