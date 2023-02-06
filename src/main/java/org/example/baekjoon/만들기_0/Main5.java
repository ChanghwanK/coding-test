package org.example.baekjoon.만들기_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main5 {
    static int N;
    static List<String> ans;
    static String [] ops;
    static String op[] = {"+", "-", " "};

    private static void dfs(int idx, String s) {
        if(idx == N) {
            String ex = s.replaceAll(" ", "");
            if(cal(ex)) {
                ans.add(s);
            }
            return;
        }

        for(int i = 0; i < 3; i++) {
            dfs(idx + 1, s + op[i] + (idx + 1));
        }
    }

    private static boolean cal(String ex) {
        StringTokenizer st = new StringTokenizer(ex, "-|+", true);
        int sum = Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            if(s.equals("+")) {
                sum += Integer.parseInt(st.nextToken());
            } else {
                sum -= Integer.parseInt(st.nextToken());
            }
        }

        return sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for(int i = 1; i <= TC; i++) {
            N = sc.nextInt();
            ans = new ArrayList<>();
            ops = new String[N - 1];
            dfs(1, "1");

            Collections.sort(ans);

            ans.forEach(System.out::println);
            System.out.println();
        }
    }

}
