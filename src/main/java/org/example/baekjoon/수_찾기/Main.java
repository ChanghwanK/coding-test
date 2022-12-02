package org.example.baekjoon.수_찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int [] arr1;
    static int [] arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr1 = new int[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        m = sc.nextInt();
        arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }


        // arr2의 요소가 arr1에 있는지
        // 출력은 m 길이만큼

        Arrays.sort(arr1);

        for(int i = 0; i < m; i++) {
            // 결과가 있다면 1 없다면 0
            System.out.println(isExist(arr2[i]));
        }
    }

    public static int isExist(int num) {
        // 탐색 범위를 줄여가며 찾을 것임

//        if (num > mid) {
//            // mid 부터 끝까지 탐색
//        } else {
//
//        }
//
//        System.out.println(max);

        return 0;
    }
}
