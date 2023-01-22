package org.example.baekjoon.다이얼;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<Character>> phoneChars = new LinkedHashMap<>();
        phoneChars.put(2, List.of('A', 'B', 'C'));
        phoneChars.put(3, List.of('D', 'E', 'F'));
        phoneChars.put(4, List.of('G', 'H', 'I'));
        phoneChars.put(5, List.of('J', 'K', 'L'));
        phoneChars.put(6, List.of('M', 'N', 'O'));
        phoneChars.put(7, List.of('P', 'Q', 'R', 'S'));
        phoneChars.put(8, List.of('T', 'U', 'V'));
        phoneChars.put(9, List.of('W', 'X', 'Y', 'Z'));

        Scanner sc = new Scanner(System.in);
        String intVal = sc.next();
        int ans = 0;
        // Map을 돌면서 valued word가 포함되었는지 체크
        for(char word : intVal.toCharArray()) {
            for(Integer key : phoneChars.keySet()) {
                if(phoneChars.get(key).contains(word)) ans += (key + 1);
            }
        }

        System.out.println(ans);
    }
}
