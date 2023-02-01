package org.example.baekjoon.수정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N + 1];

        // 인덱스가 값
        // 요소는 등장 횟수
        for(int i = 0; i < N; i++) {
            int data = Integer.parseInt(br.readLine());
            arr[data] ++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if(val != 0) {
                for(int j = 0; j < val ; j++) {
                    sb.append(i).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
