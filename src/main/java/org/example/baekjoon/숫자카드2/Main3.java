package org.example.baekjoon.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main3 {
    public static void main(String[] args) throws IOException {
        // 뭐가 있는지 정해두고 m 배열에서 그냥 쿼리함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] nums1 = new int[n];

        String[] s = br.readLine().split(" ");
        for(int i = 0; i < s.length; i++) {
            nums1[i] = Integer.parseInt(s[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int [] nums2 = new int[m];

        String [] s2 = br.readLine().split(" ");
        for(int i = 0; i < s2.length; i++) {
            nums2[i] = Integer.parseInt(s2[i]);
        }

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int num : nums2) {
            Integer ans = map.get(num);
            if(ans != null) {
                sb.append(ans).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
