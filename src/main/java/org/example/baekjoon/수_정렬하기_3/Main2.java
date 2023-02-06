package org.example.baekjoon.수_정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 길이 만큼의 배열을 초기화
        // 1 <= N <= 백만이니 N + 1
        int [] inputValues = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            int inputVal = Integer.parseInt(br.readLine());
            inputValues[inputVal] += 1;
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < inputValues.length + 1; i++) {
            for(int j = 0; j < inputValues[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
