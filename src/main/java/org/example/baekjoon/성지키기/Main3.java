package org.example.baekjoon.성지키기;

public class Main3 {
    // 열만 탐색하기
    public static void main(String[] args) {
        char [][] map = {
            {'a','b','c', 'd'},
            {'#','$','*', '$'},
            {'A','B','C', 'D'},
        };

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }

    }

}
