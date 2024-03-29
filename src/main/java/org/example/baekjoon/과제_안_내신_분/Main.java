package org.example.baekjoon.과제_안_내신_분;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();


        for (int i = 0; i < 28; i++) {
            numbers.add(sc.nextInt());
        }

        for (int i = 1; i <= 30 ; i++) {
            if (! numbers.contains(i))
                answer.add(i);
        }

        Collections.sort(answer);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}
