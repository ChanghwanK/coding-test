package org.example.baekjoon.스택수열;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static int [] nums;
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
    }

    static void solve() {
        int cnt = 1;
        for(int i = 0; i < N; i++) {
            int inputValue = nums[i];
            while(cnt <= inputValue) {
                stack.push(cnt);
                cnt += 1;
                sb.append("+").append("\n");
            }

            if(stack.peek() == inputValue) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("No");
                break;
            }
        }

    }

    public static void main(String[] args) {
        input();
        solve();
        // 결과 출력
        System.out.println(sb.toString());
    }
}