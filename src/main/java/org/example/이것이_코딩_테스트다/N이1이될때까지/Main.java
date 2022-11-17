package org.example.이것이_코딩_테스트다.N이1이될때까지;

import java.util.Scanner;

public class Main {
    static int n, k;
    static int cnt = 0;
    // 내 방식의 반례 19, 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        // 일단 n을 k로 나눴을 때 최적의 해임을 보장할 수 있나?

        while(true) {
            int target = (n/k) * k; // n에 가장 가까운 k의 배수를 찾을 수 있음
            cnt += (n - target);
            n = target;
            if (n < k) break;
            cnt+=1;
            n /= k;
        }

        cnt += (n - 1);

        System.out.println("======= 결과 =======");
        System.out.println("result: " + cnt);
    }

    public static int func1(int num) {
        cnt++;
        return num - 1;
    }

    public static int func2(int num) {
        cnt++;
        return num / k;
    }
}
