package org.example.baekjoon.단어_정렬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static int N;
    static String [] strs;
    static Set<String> stringSet = new HashSet<>();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        strs = new String[N];

        for(int i = 0; i < N; i++)
            strs[i] = sc.next();

        stringSet.addAll(Arrays.asList(strs));
    }

    static List<String> sort() {
         return stringSet.stream()
            .sorted((s1, s2) -> {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            })
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        input();
        for (String s : sort())
            System.out.println(s);
    }
}
