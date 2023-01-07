package org.example.algorithm.permutation;

import java.util.Scanner;

/**
 * 백준 순열 강의 방식
 */
public class Main2 {
    static boolean nextPermutation(int [] arr) {
        int len = arr.length;

        // 1. i찾기
        int i = len - 1;
        while(i > 0 && arr[i-1] >= arr[i]) i -= 1;

        // 마지막 순열 체크
        if (i <= 0) return false;


        // 2  j찾기
        int j = len - 1;
        while(arr[j] <= arr[i - 1]) j -= 1;

        // 3. i, j스왑하기
        int temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        j = len - 1;
        // 4. 내림차순으로 스왑하기
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        /**
         *  모든 순열 출력 방식
         */
//        do {
//            // 현재 순열을 출략
//            for (int i=0; i<N; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        } while(nextPermutation(arr));

        if (nextPermutation(arr)) {
            for (int i=0; i<N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }
}
