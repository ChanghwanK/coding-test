package org.example.baekjoon.수_찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] arr1;
    static int [] arr2;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr1 = new int[N];
        for(int i = 0; i < N; i++) arr1[i] = sc.nextInt();

        M = sc.nextInt();
        arr2 = new int[M];
        for(int i = 0; i < M; i++) arr2[i] = sc.nextInt();
    }

    static boolean binSearch(int num) {
        int start = 0;
        int end = arr1.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(arr1[mid] == num) return true;
            else if(num > arr1[mid]) start = mid + 1;
            else end = mid -1;
        }
        return false;
    }

    public static void main(String[] args) {
        input();
        Arrays.sort(arr1);

        for(int a : arr2)
            if(binSearch(a))
                System.out.println(1);
            else
                System.out.println(0);
    }
}
