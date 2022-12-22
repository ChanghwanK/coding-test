package org.example.baekjoon.카잉_달력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static String [] nums;
    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new String[N];

        for(int i = 0; i < N; i++) {
            nums[i] = br.readLine();
        }
    }

    public static void main(String[] args) throws Exception{
        input();
    }

}
