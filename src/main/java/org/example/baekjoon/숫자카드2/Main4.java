package org.example.baekjoon.숫자카드2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] nums = new int[n];

        String [] s = br.readLine().split(" ");

        for(int i = 0; i < s.length; i++)
            nums[i] = Integer.parseInt(s[i]);

        int m = Integer.parseInt(br.readLine());
        int [] nums2 = new int[m];

        String [] s2 = br.readLine().split(" ");
        for(int i = 0; i < m; i++) nums2[i] = Integer.parseInt(s2[i]);

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int num : nums2) {
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
