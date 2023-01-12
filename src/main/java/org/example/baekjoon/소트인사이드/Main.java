package org.example.baekjoon.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 각 자리수를 내림차순으로 정렬
public class Main {
    static String num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = br.readLine();
        String [] arr = new String[num.length()];

        for(int i = 0; i < num.length(); i++) {
            arr[i] = String.valueOf(num.charAt(i));
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));

        String res = String.join("", arr);
        System.out.println(res);
    }

}
