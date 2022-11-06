package org.example.programmers.lv_0.옷가게_할인_받기;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public int solution(int price) {
        int answer = 0;
        // 원가 * 0.2 = 할인가
        // 원가 - 할인가
        double salePercent = 0;

        if (price >= 500000)
            salePercent = 0.2;
        else if (price >= 300000)
            salePercent = 0.1;
        else if (price >= 100000)
            salePercent = 0.05;
        else
            salePercent = 0;
        return (int) (price - (price * salePercent));
    }

    public static void main(String[] args) throws IOException {
        System.out.print("price를 입렵하세요: ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        Solution solution = new Solution();

        System.out.println("Result: " + solution.solution(price));
    }
}
