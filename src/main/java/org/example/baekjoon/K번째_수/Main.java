package org.example.baekjoon.K번째_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int k = 0;
        int [] arr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
        }

        arr = new int[n];
        String [] datas = br.readLine().split(" ");

        for(int i = 0; i < datas.length; i++) {
            arr[i] = Integer.parseInt(datas[i]);
        }

        Arrays.sort(arr);

        int kNum = arr[k - 1];

        System.out.println(kNum);

    }
}
