package org.example.baekjoon.K번째_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int k = 0;
        List<Integer> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
        }

        String [] datas = br.readLine().split(" ");

        for(String data : datas) {
            arr.add(Integer.parseInt(data));
        }

        Collections.sort(arr);

        System.out.println(arr.get(k - 1));

    }
}
