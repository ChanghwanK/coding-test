package org.example.programmers.lv_0.아이스_아메리카노;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int[] solution(int money) {
        int iceAmericanoPrice = 5500;
        int temp = money / iceAmericanoPrice;
        int temp2 = money % iceAmericanoPrice;
        return new int[]{temp, temp2};
    }

    public static void main(String[] args) {
        System.out.print("가지고 있는 돈을 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.solution(money)));
    }
}
