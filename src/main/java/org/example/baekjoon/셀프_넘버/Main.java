package org.example.baekjoon.셀프_넘버;

public class Main {
    static boolean [] check = new boolean[10001];

    static int d(int num) {
        int sum = num;
        // 2 4 6 8
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 10001; i++) {
            int n = d(i);
            if (n < 10001) {
                check[n] = true;
            }
        }


        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
