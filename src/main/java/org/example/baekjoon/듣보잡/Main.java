package org.example.baekjoon.듣보잡;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = 0, m = 0;
        while(st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }
        String [] nArr = new String[n];
        String [] mArr = new String[m];
        for(int i = 0; i < n; i++) {
            nArr[i] = br.readLine();
        }

        for(int i = 0; i < m; i++) {
            mArr[i] = br.readLine();
        }

        Arrays.sort(mArr);

        Map<String, Integer> map = new HashMap<>();
        for(String nValue : nArr) {
            map.put(nValue, 0);
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for(String mValue : mArr) {
            if(map.get(mValue) != null) {
                cnt++;
                sb.append(mValue).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}
