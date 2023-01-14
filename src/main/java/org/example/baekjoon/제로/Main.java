package org.example.baekjoon.제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static int [] datas;
    static int ans;
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        datas  = new int[N];
        for(int i = 0; i < N; i++) {
            datas[i] = sc.nextInt();
        }
    }

    /**
     * 재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
     * 재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!
     */
    static void solve() {
        Stack<Integer> stack = new Stack<>();

        for(int num : datas) {
            if(!stack.empty() && num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        if(stack.isEmpty()) ans = 0;
        else {
            while(! stack.isEmpty()) {
                ans += stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        input();
        solve();

        //출력
        System.out.println(ans);
    }
}
