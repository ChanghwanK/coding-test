package org.example.baekjoon.성지키기;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int col = 0;
        int row = 0;

        char [][] map = new char[n][m];

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
            }
        }


        // 행
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < m; j++) {
                char a = map[i][j];
                if(a == 'X') {
                    flag = true;
                    break;
                }
            }

            if(! flag) col++;
        }

        // 열
        for(int i = 0; i < m; i++) {
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                char a = map[j][i];
                if(a == 'X') {
                    flag = true;
                    break;
                }
            }

            if(! flag) row++;
        }

        System.out.println(Math.max(row, col));
    }
}
