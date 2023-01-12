package org.example.baekjoon.수_정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {

    static int N;
    static Integer [] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();

        // sort
        Arrays.sort(arr);

        Arrays.stream(arr)
            .forEach(System.out::println);
    }
}
