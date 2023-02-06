package org.example.baekjoon.만들기_0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<List<String>> operatorCombos = new HashSet<>();
    static int [] nums;

    /**
     * 순열 만들기
     */
    private static void createAllOperators(LinkedList<String> list, int size) {
        if (list.size() == size) {
            List<String> des = new ArrayList<>(list.size());
            des.addAll(list);
            operatorCombos.add(des);
            return;
        }

        list.add(" ");
        createAllOperators(list, size);
        list.pop();

        list.add("+");
        createAllOperators(list, size);
        list.pop();

        list.add("-");
        createAllOperators(list, size);
        list.pop();
    }

    public static String createExpression(StringBuilder sb, List<String> operatorCombo) {
        for(int i = 0; i < operatorCombo.size(); i++) {
            sb.append(nums[i]).append(operatorCombo.get(i));
        }
        sb.append(nums[nums.length - 1]);
        return sb.toString();
    }
    
    public static int getTotal(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "-|+", true);
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
            // 수열 초기화
            nums = new int[n];
            for(int j = 1; j <= n; j++) nums[j-1] = j;

            // createAllOperators
            createAllOperators(new LinkedList<>(), n - 1);

            // 수식 생성
            for(List<String> operatorCombo : operatorCombos) {
                StringBuilder sb = new StringBuilder();
                String expression = createExpression(sb, operatorCombo);
                String target = expression.replace(" ", "");

                if(target.length() == n)
                    continue;

                if(getTotal(target) == 0) {
                    System.out.println(expression);
                }
            }
        }
    }

}
