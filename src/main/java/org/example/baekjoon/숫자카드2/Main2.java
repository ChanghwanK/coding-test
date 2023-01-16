package org.example.baekjoon.숫자카드2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 해쉬맵
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums1 = new int[n];

        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] nums2 = new int[m];

        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Map<Integer, Integer> givendMap = new LinkedHashMap<>();
        for(int num : nums2) {
            givendMap.put(num,0);
        }

        for(int num : nums1) {
            // 상근 숫자로 조회된다면 상근 숫자에 포함된 것이니 += 1
                Integer integer = givendMap.get(num);
            if(! (integer == null)) {
                givendMap.put(num, integer + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int value : givendMap.values()) {
            sb.append(value).append(" ");
        }

        System.out.println(sb.toString().strip());

    }
}
