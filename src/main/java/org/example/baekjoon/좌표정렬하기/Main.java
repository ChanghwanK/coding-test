package org.example.baekjoon.좌표정렬하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static int N;
    static int [][] arr;

    static void sort() {
        Arrays.sort(arr, Comparator.comparingInt(data -> data[0]));

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
    }

    /**
     * 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String [] values = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(values[0]);
            arr[i][1] = Integer.parseInt(values[1]);
        }


        sort();

        for(int [] a : arr) {
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
