package org.example.baekjoon.만들기_0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main4 {
    static Set<List<String>> operatorStore = new HashSet<>();
    static int nums [];

    static void dfs(final int size , int idx, LinkedList<String> list) {
        if(idx == size) {
            List<String> des = new ArrayList<>();
            des.addAll(list);
            operatorStore.add(des);
            return;
        }

        list.add(" ");
        dfs(size, idx + 1, list);
        list.pop();

        list.add("+");
        dfs(size, idx + 1, list);
        list.pop();

        list.add("-");
        dfs(size, idx + 1, list);
        list.pop();
    }

    static String createExpressionOf(StringBuilder sb, List<String> ops) {
        for(int i = 0; i < ops.size(); i++) {
            sb.append(nums[i]).append(ops.get(i));
        }
        sb.append(nums[nums.length - 1]);
        return sb.toString();
    }

    public static int calToTalOf(String ex) {
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
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for(int i = 0; i < TC; i++) {
            int n = sc.nextInt();

            nums = new int[n];
            for(int j = 1; j <= n; j++) nums[j-1] = j;

            dfs(n - 1, 0, new LinkedList<>());

            operatorStore.forEach(
                ops -> {
                    StringBuilder sb = new StringBuilder();
                    // operator를 이용해 expresstion 생성
                    String expression = createExpressionOf(sb, ops);
                    String validEx = expression.replaceAll(" ", "");

                    int total = calToTalOf(validEx);
                    if(total == 0) {
                        System.out.println(validEx);
                    }
                }
            );

            System.out.println();
        }
    }
}
