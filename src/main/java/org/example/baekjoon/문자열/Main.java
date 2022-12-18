package org.example.baekjoon.문자열;

import java.util.Scanner;

public class Main {
    static String A, B;

    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();
    }
    // A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
    // 최소 차이를 만드는 것이기 때문에 결국에는 같은 문자를 넣어주면 되는 것임
    // 따라서 추가 연산은 고민할거리가 아니라 우리는 최소 차이를 찾아내면 됨
    void solve() {
        int ans = A.length();

        for(int i = 0; i < B.length() - A.length() ; i++) {
            int cnt = 0;
            for(int j = 0; j < A.length() ; j++) {
                if (A.charAt(j) != B.charAt(i + j)) cnt++;
            }
            ans = Math.min(ans, cnt);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        input();
    }
}
