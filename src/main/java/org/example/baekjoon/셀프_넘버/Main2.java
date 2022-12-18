package org.example.baekjoon.셀프_넘버;

public class Main2 {
    static boolean [] check = new boolean[10001];

    // d(n) = n + 각 자리수
    static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 10001; i++) {
            int result = d(i);
            if (result < 10001) check [result]= true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
