package org.example.baekjoon.부녀회장이될테야;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] rooms = new int[15][15];
        int TC = sc.nextInt();

        // 제
        for(int i = 0; i < 14; i++) {
            rooms[0][i] = i + 1;
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 0; j < 14; j++) {
                // i - 1의 j까지
                rooms[i][j] = numberTotal(rooms, i - 1, j + 1);
            }
        }

        for(int i = 0; i < TC; i++) {
            int floor = sc.nextInt();
            int number = sc.nextInt();

            System.out.println(rooms[floor][number - 1]);
        }
    }

    /**
     * N호실까지의 합을 리턴함
     */
    private static int numberTotal(int [][] rooms, int floor, int number) {
        int total = 0;
        for(int i = 0; i < number ; i++) {
            total += rooms[floor][i];
        }

        return total;
    }
}
