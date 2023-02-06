package org.example.baekjoon.단어공부;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        String uppercaseVal = val.toUpperCase();

        Map<String, Integer> wordMap = new HashMap<>();

        for(char a : uppercaseVal.toCharArray()) {
            wordMap.put(String.valueOf(a), wordMap.getOrDefault(String.valueOf(a), 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int maxValCnt = 0;

        for(int value : wordMap.values()) {
            max = Math.max(max, value);
        }

        for(int value : wordMap.values()) {
            if(value == max) maxValCnt++;
        }

        if(maxValCnt >= 2) {
            System.out.println("?");
        } else {
            for(String key : wordMap.keySet()) {
                if(wordMap.get(key) == max) {
                    System.out.println(key);
                    break;
                }
            }
        }
    }

}
